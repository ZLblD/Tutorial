package interfac;

import interfac.interf.Swiming;

/**
 * Created by ЗВЕРЬ-МАШИНА on 07.07.2017.
 */
public class Turtells implements Swiming {
    @Override
    public void swim() {
        System.out.println("Черепаха поплыла");
    }
}