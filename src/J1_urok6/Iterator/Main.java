package J1_urok6.Iterator;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by ЗВЕРЬ-МАШИНА on 02.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
//        List<Person> persons = new CopyOnWriteArrayList<>();  // 4 способ сортировки, можно удалять по 1 способоу
        Person tomPerson = new Person();
        tomPerson.age = 30;
        tomPerson.name = "Tom";
        persons.add(tomPerson);

        persons.add(new Person("Jerry", 20));
        persons.add(new Person("Adam", 10));
        persons.add(new Person("Ilya", 10));
        persons.add(new Person("Mary", 10));

//        for (Person person : persons) {     // нельзя пробегаться по коллекции
//            if(person == tomPerson){        // и изменять ее одновременно
//                persons.remove(person);
//            }
//        }


        // работает, но каждый раз создает новые ArrayList, расходует память
//        for (Person person : new ArrayList<Person>(persons)) {
//            if (person==tomPerson){
//                persons.remove(person);
//            }
//        }
                //itco
        for (Iterator<Person> iterator = persons.iterator(); iterator.hasNext(); ) {
            Person person = iterator.next();  // next ~ getNextElement лучше бы назавли
            if (person == tomPerson){
//                persons.remove(person);
                iterator.remove();
            }

        }

        for (Person person : persons) {
            System.out.println(person.name + " " + person.age);
        }

    }
}
