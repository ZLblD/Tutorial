package interfac;

import interfac.interf.Running;

/**
 * Created by ЗВЕРЬ-МАШИНА on 07.07.2017.
 */
public class Dog implements Running {
    @Override
    public void run() {
        System.out.println("Собака Побежала");
    }
}
