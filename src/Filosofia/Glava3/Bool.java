package Filosofia.Glava3;

import java.util.Random;

public class Bool {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Random rand2 = new Random();  // для эмуляции броска монеты
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);

        System.out.println("i= " + i);
        System.out.println("j= " + j);
        System.out.println("i > j is " + (i > j));
        System.out.println("i < j is " + (i < j));
        System.out.println("i >= j is " + (i >= j));
        System.out.println("i <= j is " + (i <= j));
        System.out.println("i == j is " + (i == j));
        System.out.println("i != j is " + (i != j));

//        В Java целои число (int) не может
//        интерпретироваться как лоический тип (boolean)
//        System.out.println("i && j is " + (i && j));
//        System.out.println("i || j is " + (i || j));
//        System.out.println("!i is " + !i);
        System.out.println("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
        System.out.println("(i < 10) || (j < 10) is " + ((i < 10) || (j < 10)));
        System.out.println();
//            моделирование браска монеты
        for (int k = 0; k < 10; k++) {
            int x = rand2.nextInt(2);
            System.out.print("x= " + x);
            if (x == 1) {
                System.out.println(" орел");
            } else {
                System.out.println(" решка");
            }
        }
    }
}
