package TestCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistLinkedlist {
    public static void main(String[] args) {
        List<Person> list = new ArrayList();

        Person person1 = new Person("White");
        Person person2 = new Person("Rabbit");
//        Person person3 = new Person("Rabbit2");

        list.add(person1);
        list.add(person2);


//        Person person1FromCollection = list.get(0);
//        Person person2FromCollection = list.get(1);
//        System.out.println(person1FromCollection);
//        System.out.println(person2FromCollection);

//        boolean remove = list.remove(person1);

//        list.add(500, person2); очень долго идет смещение

//        Person person = list.get(0);
//        System.out.println(person);

//        list.size();
//        System.out.println(list.size());
//        Object[] objects = list.toArray();
//        System.out.println(objects);


    }
}
