package interfac.impl;

import interfac.interf.Running;

/**
 * Created by ЗВЕРЬ-МАШИНА on 07.07.2017.
 */
public class Street  {
    public Street() {
        System.out.println("Создалась улица");
    }

    public void goingStreet(Running running){
        running.run();
    }
}
