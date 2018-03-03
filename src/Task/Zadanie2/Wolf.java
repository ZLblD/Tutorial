package Task.Zadanie2;

public class Wolf extends Animal implements Walketh {
    public Wolf(String name, int age) {
        super(name, age);
    }

    @Override
    public void Walketh() {
        System.out.println("хожу и живу в лесу ");
    }
}
