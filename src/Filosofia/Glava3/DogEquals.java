package Filosofia.Glava3;

public class DogEquals {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Spot";
        dog1.says = "Gav-Gav";
        Dog dog2 = new Dog();
        dog2.name = "Scruffy";
        dog2.says = "Av-Av";
        Dog dog3 = new Dog();
        dog3 = dog1;

        System.out.println("Dog1 name = " + dog1.name);
        System.out.println("Dog2 name = " + dog2.name);
        System.out.println("Dog1 says = " + dog1.says);
        System.out.println("Dog2 says = " + dog2.says);

        System.out.println(dog3==dog1);
        System.out.println(dog3.equals(dog1));


    }
}
