package Task.Zadanie2;

public class Bear extends Animal implements Walketh {
    public Bear(String name, int age) {
        super(name, age);
    }

    @Override
    public void Walketh() {
        System.out.println("хожу и люблю мед");
    }
}
