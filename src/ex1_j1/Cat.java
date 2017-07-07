package ex1_j1;

/**
 * Created by ЗВЕРЬ-МАШИНА on 30.05.2017.
 */
public class Cat {
    // характеристики
    String name; //null
    int age;  // 0
    int lives; //0
    double weigth; //0
    String color; // null

    //методы
    Cat(){      //Конструктор
        System.out.println("Вызвали Cat(), тем самым создали кошку ");
    }

    void voice(){
        System.out.println("myau-myau");
    }
    void play(){
        System.out.println("cat playing");
    }
}
