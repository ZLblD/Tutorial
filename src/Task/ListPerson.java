package Task;

import java.util.ArrayList;

public class ListPerson {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList();
        ArrayList<Thing> things = new ArrayList();

        Person person1 = new Person("Olya", 20);
//        person1.said();
        Person person2 = new Person("Kolya", 30);
//        person2.said();
        Person person3 = new Person("Ilya", 25);

//        person1.setThings("Рубашка");+

        person1.setName("Olya");
        person2.setName("Petya");
        person3.setName("Valya");

        person1.setAge(20);
        person2.setAge(30);
        person3.setAge(40);

        Thing thing1 = new Thing("Рубашка");
        Thing thing2 = new Thing("Кеды");
        Thing thing3 = new Thing("Куртка");

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        things.add(thing1);
        things.add(thing2);
        things.add(thing3);
        person1.setThings(things);

        System.out.println(persons);
//       person.get(1);
//        System.out.println(persons.get(1)+things.get(0));
        System.out.println();

        System.out.println(person1);
        System.out.println(person1.getThings());
    }
}
