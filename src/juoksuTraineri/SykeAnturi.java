package juoksuTraineri;

/**
 * Data-luokka, joka antaa sykemittarille syke parametria.
 *
 * @author vadimzu
 */
public class SykeAnturi {

    // kaplseloidut ominaisuudet (min ja max syke)
    private int min;
    private int max;
    // luodaan 2 parametrinen konstruktori
    public void Anturi(int MIN, int MAX) {
        this.min = MIN;
        this.max = MAX;
    }
    // getterin luo random syke
    public int getAnturi() {
        int syke = (int) (Math.random() * (max + 1 - min) + min);
        return syke;
    }

}
