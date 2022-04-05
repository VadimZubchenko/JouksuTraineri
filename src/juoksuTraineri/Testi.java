package juoksuTraineri;



import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;
import juoksuTraineri.Askelmittari;
import juoksuTraineri.ReittiOpas;

public class Testi {
    static Scanner read = new Scanner (System.in);
    public static void main(String[] args) {
        int pituus, valinta;
        double p;
        String vastaus1, vastaus2;
        DecimalFormat precision = new DecimalFormat( "0.00" );
        
        ReittiOpas reitti = new ReittiOpas();
        Askelmittari korkeus;
        korkeus = new Askelmittari ();
        //valinta = new Askelmittari ();
        
        
        vastaus1 = JOptionPane.showInputDialog ("Anna pituutesi: ");
        pituus = Integer.parseInt(vastaus1);
        
        korkeus.setKorkeus(pituus);
        
        vastaus2 = JOptionPane.showInputDialog ("Mikä on liikkumistapa? \n"
                + "1. kävellään\n"
                + "2. hölkätään\n"
                + "3. juostaan");
        valinta = Integer.parseInt(vastaus2);
        
        korkeus.setValinta(valinta);
        
        korkeus.setAskel(korkeus.getAskel()
                        * korkeus.getValinta());
        
        JOptionPane.showMessageDialog(null, 
                "Askelpituutesi on:"
                + precision.format(korkeus.getAskel()
                        * korkeus.getValinta()));
        
        reitti.suunta();
        
        
    }
    
    
    
}