package J1_urok6.comparator;

import java.util.*;

/**
 * Created by ЗВЕРЬ-МАШИНА on 02.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Person person = new Person();
        person.age = 30;
        person.name = "Tom";
        persons.add(person);

        persons.add(new Person("Jerry", 20));
        persons.add(new Person("Adam", 10));
        persons.add(new Person("Ilya", 10));
        persons.add(new Person("Mary", 10));

//        Collections.sort(persons);
//        Collections.sort(persons, new PersonComparator());  сортировка классов PersonComparator
        Collections.sort(persons, new Comparator<Person>() {    // анонимный внутрений класс
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name.length() - o2.name.length();
            }
        });                                                     // анонимный внутрений класс конец

        for (Person person1 : persons) {
            System.out.println(person1.name + " " + person1.age);
        }

        System.out.println("-----");

        TreeSet <Person> treeSet = new TreeSet<Person>(persons);
        for (Person person1 : treeSet) {
            System.out.println(person1.name + " " + person1.age);

        }
    }
}
