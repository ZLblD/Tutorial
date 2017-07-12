package Shild.Sup;

/**
 * Created by TEHOTD7 on 04.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Sup superOn = new Sup();
        Sub1 subOb1 = new Sub1();
        Sub2 subOb2 = new Sub2();

        Sup supRef;

        supRef = superOn;
        supRef.who();

        supRef = subOb1;
        supRef.who();

        supRef = subOb2;
        supRef.who();

    }
}
