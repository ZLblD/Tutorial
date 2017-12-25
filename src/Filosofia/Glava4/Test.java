package Filosofia.Glava4;

public class Test {
    public static void main(String[] args) {
        int n = 10;
        int a = 1, b = 1;
        int fib;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            fib = a + b;
            a = b;
            b=fib;
            System.out.print(" " + fib);
        }
    }
}
