package ex2_static;

/**
 * Created by ЗВЕРЬ-МАШИНА on 27.05.2017.
 */
public class Cat {
    String name;
    int age = 10; // =0 при создании очередной кошки
    static int catsAmount;  // не будет пересоздаваться

    { // блок инициализации
        age = 20;
        catsAmount = 100;
    }


    public Cat(String name){
        this.name = name;
        catsAmount++;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void about(){
        System.out.println(name);
    }
    void showCatAmount(){
        System.out.println(catsAmount);
    }

    static void staticShowCatAmount(){
        System.out.println(catsAmount);
    }
}
