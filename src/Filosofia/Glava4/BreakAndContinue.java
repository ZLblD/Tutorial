package Filosofia.Glava4;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 74) break;   // выход из цикла
            if (i % 9 != 0) continue;  // следующая итерация
            System.out.println(i + "");
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) continue;
            if (i == 18) break;
            System.out.print(i + ", ");
        }
        System.out.println();
//        бесконечный цикл
        int i = 0;
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269) break;       // выход из цикла
            if (i % 10 != 0) continue;  // возврат в начало цикла
            System.out.print(i + " ");
        }
        System.out.println();
        // тоже самое через foreach
//        for (String arg : args) {
        for (int j = 0; j < 200; j++) {
            if (j == 99) break;
            if (j % 9 != 0) continue;
            System.out.println(j + " ");   // будет вывдодить только 0 из за !!!return!!!
            System.out.println("далее return");
            return;
        }
        System.out.println();
        System.out.println("Упражнение 23");
        int n = 11;
        int a = 1, b = 1;
        System.out.print(a + " " + b);
        int fib = 2, j = 2;
        while (j<n){
            fib = a + b;
            a = b;
            b = fib;
            System.out.println(" " + fib);
            j++;
        }
    }
}

