package Task.Zadanie2;

public class Main {
    public static void main(String[] args) {
        Worm worm = new Worm("Червяк", 1);
        Mouse mouse = new Mouse("Мышь ", 2);
        Shark shark = new Shark("Акула", 10);
        Man man = new Man("Человек", 35);
        Wolf wolf = new Wolf("Волк", 15);
        Bear bear = new Bear("Медведь", 20);


        System.out.println(worm);
        worm.Creeping();
        System.out.println(mouse);
        mouse.Creeping();
        mouse.breathe();
        System.out.println(shark);
        shark.Floating();
        System.out.println(man);
        man.Walketh();
        System.out.println(wolf);
        wolf.Walketh();
        System.out.println(bear);
        bear.Walketh();

    }
}
