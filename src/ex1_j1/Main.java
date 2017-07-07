package ex1_j1;

import java.sql.Date;

/**
 * Created by ЗВЕРЬ-МАШИНА on 21.05.2017.
 */
public class  Main {
    public static void main(String[] args) {
        String[] names = {"Kitty","Vasilina","Murka"};
        int[] ages = {3,5,6};
        int[] lives;
        lives = new int[3];
        lives[0] = 7;
        lives[1] = 7;
        lives[2] = 7;

        for (int i = 0; i <names.length ; i++) {
            String name = names[i];
            System.out.println(name);
        }

        for (int age : ages) {
            System.out.println(age);
        }
    }
}
