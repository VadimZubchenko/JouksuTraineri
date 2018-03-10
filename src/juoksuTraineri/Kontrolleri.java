package juoksuTraineri;

/**
 * Tämä on sovelluksen Controller (C). Tämä luokka sisältää nyt myös sovelluksen
 * käynnistyksen (main).
 *
 * @author vadimzu
 */
public class Kontrolleri {

    // kapseloidut ominaisuudet (V, M)
    private Naytto naytto;
    private SykeMittari mittari;
    private int nopeus;

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
        this.nopeus = nopeus;
        // pyydetään näyttöä kysymään käyttäjältä haluttu jouksuaika
        String vastaus = naytto.kysyTieto("Kuinka kauan juostaan?");
        Double aika = Double.parseDouble(vastaus);
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
                    naytto.naytaViesti(" Syke on: " + syke);
                }
                if (nopeus == 2) {
                    int syke = mittari.getSyke1();
                    naytto.naytaViesti(" Syke on: " + syke);
                }
                if (nopeus == 3) {
                    int syke = mittari.getSyke2();
                    naytto.naytaViesti(" Syke on: " + syke);
                }

            }
        }

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
