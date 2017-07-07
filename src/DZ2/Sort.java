package DZ2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by ЗВЕРЬ-МАШИНА on 07.06.2017.
 */
public class Sort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите любых 10 чисел ");
        System.out.println();
        Integer[] mass = new Integer[10];
        for (int i = 0; i < mass.length; i++) {
            System.out.print("mass[" + i + "] = ");
            mass[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("Вывод получившегося массива");
        System.out.println(Arrays.toString(mass));
        System.out.println("Сортировка массива на увиличение");
        Arrays.sort(mass);
        System.out.println(Arrays.toString(mass));


        System.out.println("Сортировка массива на убывание");
        Arrays.sort(mass, Collections.reverseOrder());
        System.out.println(Arrays.toString(mass));

    }
}



