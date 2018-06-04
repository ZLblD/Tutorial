package Test_;

class StaticDynamicLinking {

    public static void main(String[] args) {

//        Пример статического и динамического связывания в Java
        Animal ovchrka = new Dog();

//        Динамического связывание на основе объекта
        int premium = ovchrka.premium();

//        Статического связывание на основе класса
        String category = ovchrka.category();

        System.out.println("premium: " + premium);
        System.out.println("category: " + category);
    }

}

class Animal {
    public static final int LOW = 100;

    public int premium() {
        return LOW;
    }

    public static String category() {
        return "Animal";
    }
}

class Dog extends Animal {

    public static final int LOW = 200;

    public int premium() {
        return LOW;
    }

    public static String category() {
        return "Dog";
    }
}
