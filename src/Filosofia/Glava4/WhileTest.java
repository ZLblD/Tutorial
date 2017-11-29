package Filosofia.Glava4;

import java.util.Random;

public class WhileTest {
    static boolean condition() {
        boolean result = Math.random() < 0.99;
        System.out.print(result + ", ");
        return result;
    }

    public static void main(String[] args) {
        while (condition()) {
            System.out.println("Inside 'while'");
            System.out.println("Exited 'while'");
        }
        Random random = new Random();
        int i = 1;
        int a = 0;
        while (true) {
            int x = random.nextInt(100);
            if (a > x) {
                System.out.println("a: " + a + " больше x: " + x);
            }
            if (a < x) {
                System.out.println("a: " + a + " меньше x: " + x);
            }
            if (a == x) {
                System.out.println("a: " + a + " равно x: " + x);
            }
            a = x;
            i++;

        }
    }
}
