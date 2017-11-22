package Horstmann;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Цикл 1");
        for (int i = 1; i < 10; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Цикл 2");
        for (int i = 1; i < 5; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Цикл 3");
        for (int i = 1; i < 10; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("For1");
        int k=10;
        int n=3;
        for (int j = 0; j < n ; j++) {
            System.out.println(k);
        }
    }
}
