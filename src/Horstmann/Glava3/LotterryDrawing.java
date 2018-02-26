package Horstmann.Glava3;

import java.util.Arrays;
import java.util.Scanner;

public class LotterryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Сколько чисел вы хотите вывести  ");
        int k = in.nextInt();

        System.out.print("Какое наибольшее число вы хотите вывести  ");
        int n = in.nextInt();

//        заполнить массив числами 1 2 3 4 ... n
        int[] number = new int[n];
        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1;
        }
//        System.out.println(Arrays.toString(number));
//        выбрать k номеров и ввести их во торой массив
        int [] result = new int[k];
        for (int i = 0; i < result.length; i++) {

//            получить случайный индекс в пределах от 0 до n - 1
            int r = (int) (Math.random()*n);

//          выбрать элемент из проивольного места
            result[i] = number[r];

//          переместить послединй элемент в произольное место
            number[r] = number[n-1];
            n--;
        }

//        вывести отсортированный массив
        Arrays.sort(result);
        System.out.println("Ставьте сделющую кобинацию. Это сделает тебя богатым");
        for (int r : result) {
            System.out.println(r);
        }
    }
}
