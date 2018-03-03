package Test_;

public class Прогрессия {
    //    арифмитическая


    public static void main(String[] args) {

        sum(10);
        System.out.println(sum(10));
    }
    public static int sum(int n) {
        return n * (n + 1) / 2;
    }
}

