package Filosofia.Glava4;

import java.util.Random;

public class ListCharacters {
    public static void main(String[] args) {
        for (char i = 0; i < 128; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
        for (char i = 0; i < 128; i++) {
            if (Character.isLowerCase(i)) {
                System.out.println("Значение: " + (int) i + " символ: " + i);
            }
        }

        System.out.println("Упражнение 15");
        for (int i = 1; i < 101; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("Упражнение 16");
        Random random = new Random();
//        for (int i = 0; i <= 25; i++) {
//            int q = random.nextInt(100);
//            int z = random.nextInt(100);
//            if (q > z) {
//                System.out.println("Переменная q: " + q + " больше переменной z: " + z);
//            }
//            if (q < z) {
//                System.out.println("Переменная q: " + q + " меньше переменной z: " + z);
//            }
//            if (q==z){
//                System.out.println("Переменная q: " + q + " равна переменной z: " + z);
//            }
//        }
        int a = 0;
        for (int i = 0; i <= 25; i++) {
            int b = random.nextInt(100);
//            System.out.println("b: " + b + " a: " + a);
            if (a > b) {
                System.out.println("a: " + a + " больше b: " + b);
            }
            if (a < b) {
                System.out.println("a: " + a + " меньше b: " + b);
            }
            if (a == b) {
                System.out.println("a: " + a + " равно b: " + b);

            }
            a = b;
        }
        System.out.println("Упражнение 17");  // смотри  в WhileTest
//        int aa = 0;
//        int b = 10;      // для цикла while b++
//        while (true) {
//            int x = random.nextInt(100);
//            if (aa > x) {
//                System.out.println("aa: " + aa + " больше x: " + x);
//            }
//            if (aa< x) {
//                System.out.println("aa: " + aa + " меньше x: " + x);
//            }
//            if (aa == x) {
//                System.out.println("aa: " + aa + " равно x: " + x);
//            }
//            b++;
//        }
        System.out.println("Упражнение 18");
        int numb;
        boolean simpl = false;
        System.out.println("2 is prime number.");
        for (numb = 2; numb < 100; numb++) {
            for (int j = 2; j < numb; j++) {
                if (numb%j!=0){
                    simpl = true;
                } else {
                    simpl = false;
                    break;
                }
            }
            if (simpl){
                System.out.println(numb + " простое число");
            }
        }
    }


}

