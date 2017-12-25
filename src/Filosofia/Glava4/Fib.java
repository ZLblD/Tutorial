package Filosofia.Glava4;

public class Fib {
    public static void main(String[] args) {
        int n = 11;   // количество выводимых чисел Фибоначи
        int a = 1, b = 1;   // начальные числа ряда Фибоначи
        System.out.print(a + " " + b);  // вывод на экран первых чисел Фибоначи
        int fib, j = 2;         // начало итерации цикла, начинаем с 3 числа(2), чтобы было 11 значений
        while (j < n) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(" " + fib);
            j++;
        }
        System.out.println();
        int fib2;               // сумма ряда фибоначи
        int aa = 1, bb = 1;         // первые переменные ряда фибоначи
        System.out.print(aa + " " + bb);    // выводим на экран певые 2 значения ряда
        for (int i = 2; i < n; i++) {       // начало цикла
            fib2 = aa + bb;           // формула фибоначи Fn=F(n-1)+F(n-2)
            aa = bb;                  // делаем переменную F(n-1)
            bb = fib2;                // делаем переменную F(n-2)
            System.out.print(" " + fib2); // выводим на экран значение ряда фибоначи
        }
    }
}
