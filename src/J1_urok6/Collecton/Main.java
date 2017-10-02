package J1_urok6.Collecton;

/**
 * Коллекция - это динамический массив
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collections collections;
        List<String> list;      // упорядоченный, допускаются дубликаты
        Set set;        // неупорядоченный, дубликатов нет
//        Queue queue;

        Map map;        //ключ -> значению
        // cells[0] =  'X'; 0->'X'; нолику сопоставили Х

//        list = new ArrayList<>();
        list = new LinkedList<>();  // связанный список

        list.add("asdf");
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("java");
//        list.add(10);

        System.out.println(list);
        System.out.println(list.get(4));
        System.out.println(list.indexOf("hello"));
        System.out.println(list.lastIndexOf("hello"));

//        list.remove(0);
//        list.remove("asdf");
        Collections.sort(list);

        System.out.println(list);

    }
}
