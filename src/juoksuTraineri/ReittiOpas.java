package juoksuTraineri;

import javax.swing.JOptionPane;

/**
 *
 * @author heidi
 */
public class ReittiOpas {
    private final int max = 21, min=1;
    private double random = Math.random();
    private int tapahtuma;
    
    
    public ReittiOpas() {
        
    }
   
    
    public void suunta() {
    this.tapahtuma = (int) (min + 21* Math.random());
    if (tapahtuma <= 10 )  {
         if (tapahtuma == 1){
            JOptionPane.showMessageDialog(null, "1");
                    
                
        }if (tapahtuma == 2){
            JOptionPane.showMessageDialog(null, "2");
            
        } if (tapahtuma == 3){
            JOptionPane.showMessageDialog(null, "3");
                
        } if(tapahtuma == 4) {
            JOptionPane.showMessageDialog(null, "4");
                    
        } if (tapahtuma == 5){
            JOptionPane.showMessageDialog(null, "5");
                        
        } if (tapahtuma == 6){
            JOptionPane.showMessageDialog(null, "6");
                            
        } if (tapahtuma == 7){
            JOptionPane.showMessageDialog(null, "7");
                                
        } if (tapahtuma == 8){
            JOptionPane.showMessageDialog(null, "8");
                                    
        } if (tapahtuma == 9){
            JOptionPane.showMessageDialog(null, "9");
                                        
        } if (tapahtuma == 10){
            JOptionPane.showMessageDialog(null, "10");
                                        }
                                       
    } else {
        if (tapahtuma == 11){
            JOptionPane.showMessageDialog(null, "11");

        } if (tapahtuma == 12){
            JOptionPane.showMessageDialog(null, "12");
            
        } if (tapahtuma == 13){
            JOptionPane.showMessageDialog(null, "13");
                
        } if(tapahtuma == 14) {
            JOptionPane.showMessageDialog(null, "14");
                    
        } if (tapahtuma == 15){
            JOptionPane.showMessageDialog(null, "15");
                        
        } if (tapahtuma == 16){
            JOptionPane.showMessageDialog(null, "16");
                            
        } if (tapahtuma == 17){
            JOptionPane.showMessageDialog(null, "17");
                                
        } if (tapahtuma == 18){
            JOptionPane.showMessageDialog(null, "18");
                                    
        } if (tapahtuma == 19){
            JOptionPane.showMessageDialog(null, "19");
                                        
        } else {
            JOptionPane.showMessageDialog(null, "20");
                                            
        
    }
    }
    }
    
   
}