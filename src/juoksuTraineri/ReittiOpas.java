package juoksuTraineri;

import javax.swing.JOptionPane;

/**
 *
 * @author heidi
 */
public class ReittiOpas {
    private final int max = 30, min=1;
    private double random = Math.random();
    private double liike2, liike1, tapahtuma;
    private int  maisema, muutosSyke;
    
    private SykeMittari muutokset = new SykeMittari();
    private Kontrolleri muutokset2;
    
    public ReittiOpas() {
        
    }
    public void setLiike1(int uusiLiike){
        liike1 = uusiLiike;
        
    }
    public void setMaisema (int uusiMaisema){
        maisema = uusiMaisema;
    }
    public int getMaisema () {
        return maisema;
    }
    
    public void setUusiSyke (int uusiSyke){
        muutosSyke = uusiSyke;
    }
    
    
    public double suunta() {
    this.tapahtuma = (int) (min + 10* Math.random());
    if (tapahtuma <= 10 )  {
         if (tapahtuma == 1){
            if (maisema == 2 || maisema == 3){
                
            } else {
            JOptionPane.showMessageDialog(null, "Liikennevalot");
            liike2 = 0;
            if (liike1 == 1) {
            muutosSyke = muutosSyke - 10;
            
            } 
            
            if (liike1  == 2) {
            muutosSyke = muutosSyke - 10;
            
            }
            
            if (liike1  == 3) {
            muutosSyke = muutosSyke - 10;
            
            }
            }
              
            
        }if (tapahtuma == 2){
            JOptionPane.showMessageDialog(null, "Liikennevalot");
            if (maisema == 2 || maisema == 3){
            } else {
            liike2 = 0.3;
            if (liike1  == 1) {
            muutosSyke = muutosSyke - 5;
            
            } 
            
            if (liike1  == 2) {
            muutosSyke = muutosSyke - 5;
            
            }
            
            if (liike1 == 3) {
            muutosSyke = muutosSyke - 5;
            
            }
            }
              
            
        } if (tapahtuma == 3){
            JOptionPane.showMessageDialog(null, "Jyrkkä ylämäki");
            liike2 = 0.65;
            if (liike1 == 1) {
            muutosSyke = muutosSyke + 10;
            
            } 
            
            if (liike1 == 2) {
            muutosSyke = muutosSyke + 10;
            
            }
            
            if (liike1 == 3) {
            muutosSyke = muutosSyke + 10;
            
            }
              
            
        } if(tapahtuma == 4) {
            JOptionPane.showMessageDialog(null, "Loiva ylämäki");
            liike2 = 0.75;
            if (liike1 == 1) {
            muutosSyke = muutosSyke + 5;
            
            } 
            
            if (liike1 == 2) {
            muutosSyke = muutosSyke + 5;
            
            }
            
            if (liike1 == 3) {
            muutosSyke = muutosSyke + 5;
            
            }
              
            
        } if (tapahtuma == 5){
            JOptionPane.showMessageDialog(null, "Varo pyöräilijää!");
            liike2 = 0.9;
            if (liike1 == 1) {
            muutosSyke = muutosSyke + 2;
           
            } 
            
            if (liike1 == 2) {
            muutosSyke = muutosSyke + 2;
            
            }
            
            if (liike1 == 3) {
            muutosSyke = muutosSyke + 2;
            
            }
              
            
        } if (tapahtuma == 6){
            JOptionPane.showMessageDialog(null, "Jyrkkä alamäki");
            liike2 = 1.25;
            if (liike1 == 1) {
            muutosSyke = muutosSyke - 4;
            
            } 
            
            if (liike1 == 2) {
             muutosSyke = muutosSyke - 4;
            
            }
            
            if (liike1 == 3) {
            muutosSyke = muutosSyke - 4;
            
            }
              
            
        } if (tapahtuma == 7){
            JOptionPane.showMessageDialog(null, "Loiva alamäki");
            liike2 = 1.15;
            if (liike1  == 1) {
            muutosSyke = muutosSyke - 3;
            
            } 
            
            if (liike1 == 2) {
            muutosSyke = muutosSyke - 3;
            
            }
            
            if (liike1 == 3) {
            muutosSyke = muutosSyke - 3;
            
            }
              
            
        } if (tapahtuma == 8){
            JOptionPane.showMessageDialog(null, "Epätasaista maastoa");
            liike2 = 0.85 ;
            if (liike1 == 1) {
            muutosSyke = muutosSyke;
            
            } 
            
            if (liike1 == 2) {
             muutosSyke = muutosSyke;
            
            }
            
            if (liike1 == 3) {
            muutosSyke = muutosSyke;
            
            }
              
            
        } if (tapahtuma == 9){
            JOptionPane.showMessageDialog(null, "9 ");
            liike2 = 1;
            if (liike1 == 1) {
            muutosSyke = muutosSyke;
            
            } 
            
            if (liike1 == 2) {
            muutosSyke = muutosSyke;
            
            }
            
            if (liike1 == 3) {
            muutosSyke = muutosSyke;
            
            }
              
            
        } if (tapahtuma == 10){
            JOptionPane.showMessageDialog(null, "10 ");
            liike2 = 1;
            if (liike1 == 1) {
            muutosSyke = muutosSyke;
            
            } 
            
            if (liike1 == 2) {
            muutosSyke = muutosSyke ;
            
            }
            
            if (liike1 == 3) {
             muutosSyke = muutosSyke;
            
            }
              
            
            }
                                       
    } else if (tapahtuma <= 20 && tapahtuma > 10) {
        if (tapahtuma == 11){
            JOptionPane.showMessageDialog(null, "11");
            liike2 = 1;
            if (liike1 == 1) {
            muutosSyke = muutosSyke;
            
            } 
            
            if (liike1 == 2) {
            muutosSyke = muutosSyke;
            
            }
            
            if (liike1 == 3) {
            muutosSyke = muutosSyke;
           
            }
              
            

        } if (tapahtuma == 12){
            JOptionPane.showMessageDialog(null, "12");
            liike2 = 0;
            if (liike1 == 1) {
            muutosSyke = muutosSyke;
            
            } 
            
            if (liike1 == 2) {
            muutosSyke = muutosSyke;
            
            }
            
            if (liike1 == 3) {
            muutosSyke = muutosSyke;
            
            }
              
            
        } if (tapahtuma == 13){
            JOptionPane.showMessageDialog(null, "13");
            liike2 = 0;
            if (liike1 == 1) {
            muutosSyke = muutosSyke;
           
            } 
            
            if (liike1 == 2) {
            muutosSyke = muutosSyke;
            
            }
            
            if (liike1 == 3) {
            muutosSyke = muutosSyke;
            
            }
              
             
        } if(tapahtuma == 14) {
            JOptionPane.showMessageDialog(null, "14");
            liike2 = 0;
            if (liike1 == 1) {
            muutosSyke = muutosSyke;
            
            } 
            
            if (liike1 == 2) {
            muutosSyke = muutosSyke;
            
            }
            
            if (liike1 == 3) {
            muutosSyke = muutosSyke;
            
            }
              
            
        } if (tapahtuma == 15){
            JOptionPane.showMessageDialog(null, "15");
            liike2 = 0;
            if (liike1 == 1) {
            muutosSyke =muutosSyke;
            
            } 
            
            if (liike1 == 2) {
            muutosSyke = muutosSyke;
            
            }
            
            if (liike1 == 3) {
            muutosSyke = muutosSyke;
            
            }
              
                   
        } if (tapahtuma == 16){
            JOptionPane.showMessageDialog(null, "16");
            liike2 = 0;
            if (liike1 == 1) {
            muutosSyke = muutosSyke;
            
            } 
            
            if (liike1 == 2) {
             muutosSyke = muutosSyke;
            
            }
            
            if (liike1 == 3) {
             muutosSyke = muutosSyke;
            
            }
              
                   
        } if (tapahtuma == 17){
            JOptionPane.showMessageDialog(null, "17");
            liike2 = 0;
            if (liike1 == 1) {
            muutosSyke = muutosSyke;
            
            } 
            
            if (liike1 == 2) {
            muutosSyke = muutosSyke;
            
            }
            
            if (liike1 == 3) {
            muutosSyke = muutosSyke;
            
            }
              
                           
        } if (tapahtuma == 18){
            JOptionPane.showMessageDialog(null, "18");
            liike2 = 0;
            if (liike1 == 1) {
            muutosSyke = muutosSyke;
            
            } 
            
            if (liike1 == 2) {
             muutosSyke = muutosSyke;
            
            }
            
            if (liike1 == 3) {
            muutosSyke = muutosSyke;
            
            }
              
                             
        } if (tapahtuma == 19){
            JOptionPane.showMessageDialog(null, "19");
            liike2 = 0;
            if (liike1 == 1) {
            muutosSyke = muutosSyke;
            
            } 
            
            if (liike1 == 2) {
            muutosSyke = muutosSyke;
            
            }
            
            if (liike1 == 3) {
            muutosSyke = muutosSyke;
            
            }
              
                               
        } if (tapahtuma == 20) {
            JOptionPane.showMessageDialog(null, "20");
            liike2 = 0;
            if (liike1 == 1) {
            muutosSyke = muutosSyke;
            
            } 
            
            if (liike1 == 2) {
            muutosSyke = muutosSyke;
            
            }
            
            if (liike1 == 3) {
            muutosSyke = muutosSyke;
            
            }
              
            
        }
    } else {
        muutosSyke = muutosSyke;
        liike2 = liike2;
        
    }return liike2;
    
         }
    
    
    public int getMuutossyke (){
    return muutosSyke;
    } 


}



        
