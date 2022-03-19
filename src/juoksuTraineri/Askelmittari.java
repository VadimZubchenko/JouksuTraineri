package juoksuTraineri;

/**
 *
 * @author heidi
 */
public class Askelmittari {
    private double kav = 150, holk = 220, juok = 290;
    
    private double pkavely = 0.413;
    private double pholkka = 0.435;
    private double pjuoksu = 0.464;
    

    private double korkeus, valinta, valinta2;
    private double askel, askelpituus;
    
    public Askelmittari (){
         
    }
    
    public void setKorkeus (int uusiPituus) {
        korkeus = uusiPituus;
    }
    public void setValinta (int uusiValinta) {
        valinta = uusiValinta;
        
    }
    public void setAskel (double uusiAskel) {
        valinta2 = uusiAskel;
    }
    
    public double getKorkeus () {
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
    
    public double getAskel () {
        if (valinta2 == 1) {
            return kav;
        } else if (valinta2 == 2) {
            return holk;
        }else {
            return juok; 
        }
    }
    //Askeleiden pituus
    public double getAskelpituus () {
        askelpituus = getKorkeus() * getValinta() / 100;
        return askelpituus;
    
        }
}

    

