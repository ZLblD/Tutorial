package Task.Zadanie2;

public class Shark extends Animal implements Floating {
    public Shark(String name, int age) {
        super(name, age);
    }

    @Override
    public void Floating() {
        System.out.println("плавую и живу в океане");
    }
}
