package ex1_j1;

import java.util.Random;

/**
 * Created by ЗВЕРЬ-МАШИНА on 30.05.2017.
 */
public class Main1 {
    public static void main(String[] args) {
        Cat[] nayanCats = new Cat[15];
        Cat[] cats;
        cats = new Cat[3];
        new Cat(); // создали кошку, но GC ее сьест
        Cat asdf = new Cat(); //asdf хранит только адрес нашей кошки в памяти
        asdf.name = "Tom";

        cats[0] = asdf;
        cats[1] = new Cat();
        cats[2] = new Cat();

//        System.out.println(cats[0].name);

        for (int i = 0; i < cats.length; i++) {
            Cat cat = cats[i];
            System.out.println(cat.name);
        }

        for (int i = 0; i < nayanCats.length; i++) {
            nayanCats[i] = new Cat();
            nayanCats[i].name = "Наян_" + i;
            nayanCats[i].age = new Random().nextInt(10);
        }
        for (Cat nayanCat : nayanCats) {
            System.out.println(nayanCat.name + " age: " +nayanCat.age);
        }
    }
}
