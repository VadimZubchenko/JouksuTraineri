package juoksuTraineri;

/**
 *
 * @author heidi
 */
public class Askelmittari {
    
    private double pkavely = 0.413;
    private double pholkka = 0.435;
    private double pjuoksu = 0.464;

    private int korkeus, valinta;
    private double askel;
    
    public Askelmittari (){
         
    }
    
    public void setAskelmittari (int uusiPituus) {
        korkeus = uusiPituus;
    }
    public void setValinta (int uusiValinta) {
        valinta = uusiValinta;
    }
    
    public double getAskelmittari () {
        return korkeus;
    }
    public double getValinta () {
        if (valinta == 1) {
            return pkavely;
          } else if (valinta == 2) {
              return pholkka;
          }else {
              return pjuoksu;
          }
    }
            
    public void setAskel (double uusiAskel){
          askel = uusiAskel;  
    }
    public double getAskel (){
        return askel;
    }
}