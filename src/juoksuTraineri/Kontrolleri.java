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
    private ReittiOpas reitti = new ReittiOpas ();
    private Askelmittari korkeus = new Askelmittari ();
    
    
    private int pituus, valinta, time; //Heidin
    private int nopeus;
    private double matka1 = 0;
    
    DecimalFormat precision = new DecimalFormat( "0.00" );  //heidi

    // metodi luo tarvittavat MVC-sovelluksen komponentit ja 
    // käynnistää MVC-sovelluksen.
    public void kaynnistaMvcSovellus() {
        // Nyt kontrollerin (C) konstruktori (eli tämä metodi) 
        // luo muut tarvittavat komponentit ja pyytää sitten 
        // näyttöä esittämään aloitusnäytön.

        // luodaan sovelluksen tarvitsemat muut komponentit: M, V.
        mittari = new SykeMittari(); // model Sykemittari
        naytto = new Naytto();       // View

        // välitetään näytölle tieto sovelluksen kontrollerista eli
        // tämä komponentti itse (this).
        naytto.rekisteroiOhjain(this);

        // pyydetään näyttöä esittämään aloitusnäyttö
        naytto.aloitusNaytto();

    }

    public void start(int nopeus) {
        
        // pyydetään näyttöä kysymään käyttäjältä haluttu jouksuaika
        String vastaus = naytto.kysyTieto("Kuinka kauan juostaan?");
        Double aika = Double.parseDouble(vastaus);
        
        String vastaus1 = JOptionPane.showInputDialog ("Anna pituutesi: ");
        pituus = Integer.parseInt(vastaus1); //heidi
        
        korkeus.setKorkeus(pituus); //heidi
        
        
        // annetaan reitin olot
        String reittiMaisema = naytto.kysyTieto("Millaisella alueella liikut?\n" 
                + "1. Kaupunki\n, 2. Metsä\n, 3. Hiekkatiet/peltoalue");
        int maisema = Integer.parseInt(reittiMaisema);
        // siirretään tietoa mittarille
        //reitti.setMaisema(maisema);
        
        // while-tostorakenteella, joka simuloi kelloa
        int vaihe = 0;
        while (aika > 0) {
            vaihe++;
            aika = aika - 1;
            // pyydetään näyttöä ilmoittamaan viesti tapahtumasta.
            naytto.naytaViesti(" Olet juossut " + vaihe
                    + " minuttia\n" + " Aika on jäljellä: " + aika
                    + " minuttia\n");
            // pyydetään SykeMittari -kerrosta hoitamaan laskemaan kevyt-syketta.
            // saadaan takaisin haluttu vastaus
            double tulos = aika / 5;
            if (tulos % 1 == 0) {

                if (nopeus == 1) {
                    int syke = mittari.getSyke();
                    if (syke >= 90 && syke <= 110) {
                        naytto.naytaViesti("Syke: " + syke + " bpm.\n"
                                + " Hyvin menee!");
                    }
                    if (syke > 110) {
                        naytto.naytaViesti("Huomio! \n"
                                + "Syke: " + syke + " bpm. \n"
                                + "Korkea! \n"
                                + "Laske nopeus! ");
                    }
                    if (syke < 90) {
                        naytto.naytaViesti("Syke: " + syke + " bpm. \n"
                                + " Liian pieni. \n"
                                + "Kävele nopeampi! ");
                    }
                }
                if (nopeus == 2) {
                    int syke = mittari.getSyke1();
                    if (syke >= 140 && syke <= 160) {
                        naytto.naytaViesti("Syke: " + syke + " bpm. \n"
                                + "Hyvin menee!");
                    }
                    if (syke > 160) {
                        naytto.naytaViesti("Huomio! \n"
                                + " Syke: " + syke + " bpm. \n"
                                + "Korkea! \n"
                                + "Laske nopeus! ");
                    }
                    if (syke < 140) {
                        naytto.naytaViesti("Syke: " + syke + " bpm. \n"
                                + "Liian pieni. \n"
                                + "Juokse nopeampi! ");
                    }
                }
                if (nopeus == 3) {
                    int syke = mittari.getSyke2();
                    if (syke >= 150 && syke <= 180) {
                        naytto.naytaViesti("Syke: " + syke + " bpm.  \n"
                                + "Hyvin menee!");
                    }
                    if (syke > 180) {
                        naytto.naytaViesti("Huomio! \n"
                                + "Syke: " + syke + " bpm. \n"
                                + "Korkea! \n"
                                + "Laske nopeus! ");
                    }
                    if (syke < 150) {
                        naytto.naytaViesti("Syke: \n" + syke + " bpm. \n"
                                + "Liian pieni. \n"
                                + "Juokse nopeampi! ");
                    }

                }

            }
        }

        naytto.naytaViesti(
                "Onneksi olkoon! Olet suorittanut juoksuohjelman!");

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
