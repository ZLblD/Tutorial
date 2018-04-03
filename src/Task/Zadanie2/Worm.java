package Task.Zadanie2;


public class Worm extends Animal implements Creeping {
    public Worm(String name, int age) {
        super(name, age);
    }

    @Override
    public void Creeping() {
        System.out.println("ползаю и живу в земле");
    }
}
