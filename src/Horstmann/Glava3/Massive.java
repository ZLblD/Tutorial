package Horstmann.Glava3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Massive {
    public static void main(String[] args) {
        int mass[] = new int[10];
        int a[] = new int[10];
        int b[] = new int[10];
//        заполнение массива
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i;
        }
        System.out.println("Основной массив mass");
        System.out.println(Arrays.toString(mass));
        System.out.println("разделение массива на четный и не четный");
//        разделение массива на четный и не четный
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 != 0) {
                a[i] = mass[i];
            } else {
                b[i] = mass[i];
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println("разделение массива по полам");
        int[] mass1 = Arrays.copyOfRange(mass, 0, mass.length / 2);
        int[] mass2 = Arrays.copyOfRange(mass, mass.length / 2, mass.length);
        int[] mass3 = Arrays.copyOfRange(mass, 2, 8);
        System.out.println(Arrays.toString(mass1));
        System.out.println(Arrays.toString(mass2));
        System.out.println(Arrays.toString(mass3));

        System.out.println("Сумма элементов массива и его средрнее значение mass");
        double average;
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            sum += mass[i];   // сумма чисел массива
        }
        average = (double) sum / mass.length;       // среднее значение суммы чисел массива
        System.out.println("Сумма " + sum + ", Среднее значение " + average);

        System.out.println("Количество повторений в массиве");
        int mass4[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 5};
        int element = 5;
        int count = 0;
        for (int i = 0; i < mass4.length; i++) {
            if (mass4[i] == element)
                count++;
        }
        System.out.println(Arrays.toString(mass4));
        System.out.println("Элемент массива " + element + " повторяется " + count + " раз");

        System.out.println("foreach");
        int[] mass5 = new int[10];
        Random random = new Random();
        for (int i : mass5) {
            i = random.nextInt(10);
            mass5[i] = i;
        }
        System.out.println(Arrays.toString(mass5));

        System.out.println("break в массиве ");
        for (int i : mass) {
            if (i % 2 != 0) break;
            System.out.println(i);
        }
        System.out.println("Сортировка в порядке возрастания");
        Arrays.sort(mass5);
        System.out.println(Arrays.toString(mass5));

        System.out.println("Сортировка в порядке возрастания в заданном интервале");
        for (int i : mass5) {
            i = random.nextInt(10);
            mass5[i] = i;
        }
        Arrays.sort(mass5, 0, 4);
        System.out.println(Arrays.toString(mass5));

        System.out.println("Сортировка в порядке убывания");
        Integer[] mass6 = {13, 6, 7, 45, 24, 32, 2};
        Arrays.sort(mass6, Collections.reverseOrder());
        System.out.println(Arrays.toString(mass6));

        System.out.println("Максимальное и минимальное число в массиве");

        int Max, Min;
        Min = mass5[0];
        Max = mass5[0];
        for (int i = 0; i < mass5.length; i++) {
            if (Min < mass5[i]) {
                Min = mass5[i];
            }
            if (Max > mass5[i]) {
                Max = mass5[i];
            }
        }
        System.out.println("Min= " + Min + ", Max= " + Max);  /// чето на оборот выдад
    }
}
