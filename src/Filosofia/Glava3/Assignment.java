package Filosofia.Glava3;

public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1 = t2;
        System.out.println("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1.level = 27;
        System.out.println("3: t1.level: " + t1.level + ", t2.level: " + t2.level);

        Car car1 = new Car();
        Car car2 = new Car();
        car1.ob = 4.5f;
        car2.ob = 3.16f;
        System.out.println("1: car1.ob: " + car1.ob + ", car2.ob: " + car2.ob);
        car1 = car2;
        System.out.println("2: car1.ob: " + car1.ob + ", car2.ob: " + car2.ob);
        car1.ob = 6.8f;
        System.out.println("2: car1.ob: " + car1.ob + ", car2.ob: " + car2.ob);
    }
}
