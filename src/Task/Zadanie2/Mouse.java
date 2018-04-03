package Task.Zadanie2;

public class Mouse extends Animal implements Creeping {
    public Mouse(String name, int age) {
        super(name, age);
    }

    @Override
    public void Creeping() {
        System.out.println("ползаю и люблю сыр ");
    }


}
