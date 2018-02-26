package Horstmann;

public class TestMethod {
    //    определине первого метода
    static void method1() {
        System.out.println("Method1");
    }

    //    определение второго метода
    static void method2() {
        System.out.println("Method2");
    }

    //    определиние третьего метода
    int factorial() {
        return 1;
    }

    //    определение четвертого метода
    String hello() {
        return "Hello to world";
    }

    //    определение пятого метода
    static void getSum() {
        int x = 2;
        int y = 5;
        System.out.printf("%d + %d = %d\n", x, y, x + y);
    }

    //    определение 6 метода
    private static String getMessage() {
        return "I am crazy";
    }

    /**
     * передача параметров в методы
     */

    static int getSum2(int x, int y) {
        return x + y;
    }

    /**
     * Перегрузка методов
     */

    static int getSum3(int x, int y) {
        return x + y;
    }

    static double getsum3(double x, double y, double z) {
        return x + y + z;
    }

    /**
     * Параметры переменной длинны
     */

    static int getSum4(int... nums) {
        int result = 0;
        for (int i : nums) {
            result += i;
        }
        return result;
    }

    static int getSum5(String message, int... nums) {
        System.out.println(message);
        int result = 0;
        for (int i : nums) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {

        method1(); // вызов 1 метода
        method2();  // вызов 2 метода
        TestMethod testMethod = new TestMethod();
        System.out.println(testMethod.factorial());  // вызов 3 метода
        System.out.println(testMethod.hello());      // вызов 4 метода
        getSum();  // вызов 5 метода
        String mes = getMessage();  //вызов 6 метода
        System.out.println(mes);
        int result = getSum2(10, 20); // вызов метода с параметрами
        System.out.println(result);
        int n1 = getSum3(150, 6);  // вызов перегружанных методов
        System.out.println(n1);
        double n2 = getsum3(20.3, 10.5, 5.7);
        System.out.println(n2);
        int n3 = getSum4(20, 10);
        System.out.println(n3);
        int n4 = getSum4(20, 10, 5, 9);
        System.out.println(n4);
        int n5 = getSum4();
        System.out.println(n5);
        int n6 = getSum5("Welcome!", 20, 10);
        System.out.println(n6);
        int n7 = getSum5("Go to home");
        System.out.println(n7);

    }

}
