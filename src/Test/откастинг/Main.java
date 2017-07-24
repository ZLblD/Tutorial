package Test.откастинг;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.Paws();

        Dog dog2 = (Dog) dog;
        Cat cat2 = (Cat) cat;

        dog2.voit2();
        cat2.vote();

        Dog dog3 = new Dog();
        dog3.voit2();
        dog3.Paws();
    }
}
