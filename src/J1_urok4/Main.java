package J1_urok4;

/**
 * Created by TEHOTD7 on 19.06.2017.
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println(Cat.count);
        System.out.println(Cat.getCount());
        Cat cat1 = new Cat();
//        cat.age = 10000;
        cat1.setAge(10);
//        System.out.println(cat1.getAge());
        cat1.setAlive(true);

        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();

        System.out.println(Cat.getCount());

    }
}
