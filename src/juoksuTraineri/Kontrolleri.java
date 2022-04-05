package juoksuTraineri;

/**
 * Tämä on sovelluksen Controller (C). Tämä luokka sisältää nyt myös sovelluksen
 * käynnistyksen (main).
 *
 * @author vadimzu
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Kontrolleri {

    // kapseloidut ominaisuudet (V, M)
    private Naytto naytto;
    private SykeMittari mittari;
    private ReittiOpas reitti;
    private Askelmittari korkeus;

    private int pituus, valinta, time, mennytAika, nopeus; //Heidin

    private double matka, askel;
    
    DecimalFormat precision = new DecimalFormat("0.00");  //heidi

    // metodi luo tarvittavat MVC-sovelluksen komponentit ja 
    // käynnistää MVC-sovelluksen.
    public void kaynnistaMvcSovellus() {
        // Nyt kontrollerin (C) konstruktori (eli tämä metodi) 
        // luo muut tarvittavat komponentit ja pyytää sitten 
        // näyttöä esittämään aloitusnäytön.

        // luodaan sovelluksen tarvitsemat muut komponentit: M, V.
        naytto = new Naytto();       // View
        mittari = new SykeMittari(); // model Sykemittari
        reitti = new ReittiOpas();
        korkeus = new Askelmittari();

        // välitetään näytölle tieto sovelluksen kontrollerista eli
        // tämä komponentti itse (this).
        naytto.rekisteroiOhjain(this);

        // pyydetään näyttöä esittämään aloitusnäyttö
        naytto.aloitusNaytto();

    }

    public void start(int tapa) {

        int liikkuTapa = tapa;

        // pyydetään näyttöä kysymään käyttäjältä haluttu jouksuaika
        String vastaus = naytto.kysyTieto("Kuinka kauan juostaan, min?");
        Double aika = Double.parseDouble(vastaus);

        String vastaus1 = JOptionPane.showInputDialog("Anna pituutesi: ");
        pituus = Integer.parseInt(vastaus1); //heidi

        korkeus.setKorkeus(pituus); //heidi

        // annetaan reitin olot
        String reittiMaisema = naytto.kysyTieto("Millaisella alueella liikut?\n"
                + "1. Kaupunki\n"
                + "2. Metsä\n"
                + "3. Hiekkatiet/peltoalue");

        int maisema = Integer.parseInt(reittiMaisema);
        // siirretään tietoa mittarille
        mittari.setOlo(maisema);

        // askel pituuden kerroin laskemiseen liikumistavasta riippuen 
        korkeus.setValinta(liikkuTapa);
        askel = korkeus.getAskelpituus();
        // while-tostorakenteella, joka simuloi kelloa
        int vaihe = 0;
        while (aika > 0) {
            vaihe++;
            aika = aika - 1;
            mennytAika++;

            // pyydetään näyttöä ilmoittamaan viesti tapahtumasta.
            naytto.naytaViesti(" Olet liikkunut "
                    + vaihe + " minuttia\n"
                    + " askelpituusi: " + precision.format(askel) + "m.\n"
                    + " Aika on jäljellä: " + aika + " minuttia\n");
            // pyydetään SykeMittari -kerrosta hoitamaan laskemaan kevyt-syketta.
            // saadaan takaisin haluttu vastaus
            double tulos = aika / 5;

            // 3.2 km/t (kavely) 60 askels/min
            if (tulos % 1 == 0) {

                if (tapa == 1) {
                    int syke = mittari.getSyke();
                    matka = askel * 80; //askeleita minutissa
                    matka = matka * mennytAika;
                    if (syke >= 90 && syke <= 110) {
                        naytto.naytaViesti("Syke: " + syke + " bpm.\n"
                                + "Matkasi: " + precision.format(matka) + " metria.\n"
                                + " Hyvin menee!");
                    }
                    if (syke > 110) {
                        naytto.naytaViesti("Syke: " + syke + " bpm.\n"
                                + "Huomio!\n"
                                + "Korkea syke!\n"
                                + "Laske nopeus!\n\n "
                                + "Matkasi: " + precision.format(matka) + " metria.");
                    }
                    if (syke < 90) {
                        naytto.naytaViesti("Syke: " + syke + " bpm. \n"
                                + "Liian pieni.\n"
                                + "Kävele nopeampi!\n"
                                + "Matkasi: " + precision.format(matka) + " metria.\n");
                    }
                }
                // 4.8 kmp/t (hölkä) 80 steps/min
                if (tapa == 2) {
                    int syke = mittari.getSyke1();
                    matka = askel * 160;
                    matka = matka * mennytAika;
                    if (syke >= 140 && syke <= 160) {
                        naytto.naytaViesti("Syke: " + syke + " bpm. \n"
                                + "Hyvin menee!\n"
                                + "Matkasi: " + precision.format(matka) + " metria.\n");
                    }
                    if (syke > 160) {
                        naytto.naytaViesti("Syke: " + syke + " bpm.\n"
                                + "Huomio!\n"
                                + "Korkea syke!\n"
                                + "Laske nopeus! \n"
                                + "Matkasi: " + precision.format(matka) + " metria.\n");
                    }
                    if (syke < 140) {
                        naytto.naytaViesti("Syke: " + syke + " bpm. \n"
                                + "Liian pieni. \n"
                                + "Juokse nopeampi!\n"
                                + "Matkasi: " + precision.format(matka) + " metria.\n");
                    }
                }
                // 8 km/t (jouksu) 100 steps/min
                if (tapa == 3) {
                    int syke = mittari.getSyke2();
                    matka = askel * 200;
                    matka = matka * mennytAika;
                    if (syke >= 150 && syke <= 180) {
                        naytto.naytaViesti("Syke: " + syke + " bpm.  \n"
                                + "Hyvin menee!\n"
                                + "Matkasi: " + precision.format(matka) + " metria.\n");
                    }
                    if (syke > 180) {
                        naytto.naytaViesti("Syke: " + syke + " bpm.\n"
                                + "Huomio!\n"
                                + "Korkea syke!\n"
                                + "Laske nopeus!\n"
                                + "Matkasi: " + precision.format(matka) + " metria.\n");
                    }
                    if (syke < 150) {
                        naytto.naytaViesti("Syke: \n" + syke + " bpm. \n"
                                + "Liian pieni. \n"
                                + "Juokse nopeampi!\n"
                                + "Matkasi: " + precision.format(matka) + " metria.\n");
                    }

                }
            }

        }
        matka = 0;
        mennytAika = 0;
        naytto.naytaViesti("Matkasi lopussa: " + precision.format(matka));
        naytto.naytaViesti("Onneksi olkoon! Olet suorittanut juoksuohjelman!");

        // siirrytään takaisin aloitusnäyttöön
        naytto.aloitusNaytto();

    }

// Koko sovelluksen käynnistäminen
    public static void main(String[] args) {
        // luodaan uusi kontrolleri-olio, ja
        // kutsutaan samalla sovelluksen käynnistää metodia.
        new Kontrolleri().kaynnistaMvcSovellus();

    }

}
