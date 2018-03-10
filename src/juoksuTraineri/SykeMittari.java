package juoksuTraineri;

/**
 *
 * @author vadimzu
 */
public class SykeMittari {

    // kapsuloidaan ominaisuudt;
    private int syke, syke1, syke2;
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
    public int getSyke() {
        anturi.Anturi(100, 120);
        syke = anturi.getAnturi();
        return syke;
    }
    public int getSyke1() {
        anturi.Anturi(120, 160);
        syke1 = anturi.getAnturi();
        return syke1;
    }
    public int getSyke2() {
        anturi.Anturi(160, 220);
        syke2 = anturi.getAnturi();
        return syke2;
    }

}

