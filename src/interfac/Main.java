package interfac;

import interfac.impl.Ocean;
import interfac.interf.Swiming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ЗВЕРЬ-МАШИНА on 07.07.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Ocean ocean = new Ocean();
        Swiming fish = new Fish();
        Swiming turtels = new Turtells();
//        ocean.goingOcean(fish);
//        ocean.goingOcean(turtels);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i;
        while (true) {
            i = Integer.parseInt(reader.readLine());
            if (i == 0) {
                ocean.goingOcean(fish);
            }
            if (i == 1) {
                ocean.goingOcean(turtels);
            }
            if (i == 9) {
                break;
            }
        }


//        Street street = new Street();
//        Running dog = new Dog();
//        street.goingStreet(dog);


    }
}
