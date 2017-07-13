package Shild.Interface;

/**
 * Created by TEHOTD7 on 13.07.2017.
 */
public class SeriesDemo2 {
    public static void main(String[] args) {
        ByTwos twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();
        Series ob; // переменная ob объявляется как ссылка на интерфейс Series

        for (int i = 0; i < 5; i++) {
            ob = twoOb;     // в переменной ob сохраняется ссылка на объект twoOb
            System.out.println("Следующее значение ByTwos: " + ob.getNext());

            ob = threeOb;   // в переменной ob сохраняется ссылка на объект threeOb
            System.out.println("Следующее значение ByTwos: " + ob.getNext());

        }
    }
}
