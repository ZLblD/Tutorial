package ex2_static;

/**
 * Created by ЗВЕРЬ-МАШИНА on 27.05.2017.
 */
public class Main1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 2);
        Cat cat2 = new Cat("Tom");

        System.out.println(cat1.name + " " + cat1.age);
        System.out.println(cat1.catsAmount);

        System.out.println(Cat.catsAmount);

        Cat.staticShowCatAmount();
    }
}
