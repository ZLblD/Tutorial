package ex1_arraylist;

import java.util.ArrayList;

/**
 * Created by ЗВЕРЬ-МАШИНА on 27.05.2017.
 */
public class Main2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(12);
        list.add("hello");
        list.add(8685);

        list.remove("hello");
        System.out.println(list);

        for (Object o : list) {
            System.out.println(o);

        }

    }
}
