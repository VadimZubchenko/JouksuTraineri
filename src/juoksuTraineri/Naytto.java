package juoksuTraineri;

import javax.swing.JOptionPane;


/**
 *
 * @author vadimzu
 */
public class Naytto {

    // tieto kontrollerista, jolle näyttö lähettää pyynnöt
    private Kontrolleri kontrolleri;
    // metodi luo näytön, joka näytetään aluksi käyttäjälle
    public void aloitusNaytto() {
        String valintaStr;      // käyttäjän valinta merkkijonona
        int valinta;            // valinta numerona

        // näytetään käyttäjälle päävalikko
        valintaStr = JOptionPane.showInputDialog(null,
                "Valitse toiminto (1-4) seuraavista: \n"
                + "1: Kävely \n"
                + "2: Hölkä \n"
                + "3: Jouksu \n"
                + "4: lopetus \n"
                + "Mitä haluat tehdä?");

        // muutetaan käyttäjän vastaus numeroksi
        valinta = Integer.parseInt(valintaStr);

        // siirrytään käyttäjän haluamaan toimintoon
        switch (valinta) {
            case 1:
                kontrolleri.start(1);
                break;
            case 2:
                kontrolleri.start(2);
                break;
            case 3:
                kontrolleri.start(3);
                break;
            case 4:
                lopetus();
                break;
            default:
                // näytetään valikko uudestaan, jos ei kunnollinen valinta
                aloitusNaytto();
        }
    }
    // näytön toimintoja
    public void naytaViesti(String viesti) {
        // Parametrina näytettävä viesti
        JOptionPane.showMessageDialog(null, viesti);
    }
    public String kysyTieto(String kysymys) {
        // Metodi kysyy käyttäjältä jotakin tietoa.
        // Käyttäjälle esitetään kysymys, joka tulee parametrina.
        // Metodi palauttaa käyttäjän antaman vastauksen
        
        return JOptionPane.showInputDialog(kysymys);
    }
    public void lopetus() {
        System.exit(0);
    }

    public void rekisteroiOhjain(Kontrolleri ohjain) {
        // näyttö saa tiedon kontrollerista, jolle se välittää pyyntöjä
        this.kontrolleri = ohjain;
    }
    

}
