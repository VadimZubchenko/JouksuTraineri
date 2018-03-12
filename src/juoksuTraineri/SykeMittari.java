package juoksuTraineri;

/**
 *
 * @author vadimzu
 */
public class SykeMittari {

    // kapsuloidaan ominaisuudt;
    private int syke, syke1, syke2, 
            sykeMaki, olosuhde, min1, max1,
            min2, max2, min3, max3;
    private final SykeAnturi anturi; // mittarin käyttämä anturi.

// parametriton konstruktori
    public SykeMittari() {
        // Mittarille ei anneta mittausalueen rajoja ->
        // Luodaan uusi anturi oletusarvoilla ja
        // annetaan se mittarin käyttöön (luokkatason muuttuja).

        // esittelen ja luon uuden SykeAnturi olion.
        anturi = new SykeAnturi();

        // tätä käytetään kun Syke ei halutaan muuttua
        //anturi.Anturi(120, 160);
        // syke1 = anturi.getAnturi();
    }
    //Kysytään anturilla lämpötila ja samalla luodaan
    // konstruktoriin min ja max parametrit

    public void setOlo(int olo) {
        olosuhde = olo;

        if (olosuhde == 1) { // tähän voi reitin esim. 1=tasainen, 2=mäki
            min1 = 90;
            max1 = 120;
            min2 = 130;
            max2 = 170;
            min3 = 150;
            max3 = 190;
        }
        if (olosuhde == 2) {
            min1 = 100;
            max1 = 130;
            min2 = 140;
            max2 = 180;
            min3 = 160;
            max3 = 200;
        }
        if (olosuhde == 3){
            min1 = 110;
            max1 = 140;
            min2 = 150;
            max2 = 190;
            min3 = 170;
            max3 = 210;
        }
    }

    public int getSyke() {
        anturi.Anturi(min1, max1);
        syke = anturi.getAnturi();
        return syke;
    }

    public int getSyke1() {
        anturi.Anturi(min2, max2);
        syke1 = anturi.getAnturi();
        return syke1;
    }

    public int getSyke2() {
        anturi.Anturi(min3, max3);
        syke2 = anturi.getAnturi();
        return syke2;
    }

    public int getSykeMaki() {
        anturi.Anturi(180, 200);
        sykeMaki = anturi.getAnturi();
        return sykeMaki;
    }

}
