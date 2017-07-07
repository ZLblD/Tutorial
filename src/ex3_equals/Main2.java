package ex3_equals;

/**
 * Created by ЗВЕРЬ-МАШИНА on 27.05.2017.
 */
public class Main2 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom");
        Cat cat2 = new Cat("Tom");


//        String string1 = "hello";
////        String string2 = "hello";
//        String string2 = new String("hello") ;

        if (cat1 == cat2) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }

        if (cat1.equals(cat2)){
            System.out.println("equals");
        }else{
            System.out.println("not equals");
        }


    }
}
