package interfac.impl;

import interfac.interf.Swiming;

/**
 * Created by ЗВЕРЬ-МАШИНА on 07.07.2017.
 */
public class Ocean {

    public Ocean() {
        System.out.println("Создание океана");
    }

    public void goingOcean(Swiming swiming){
        swiming.swim();
    }
}
