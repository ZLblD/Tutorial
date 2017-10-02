package J1_urok6.Iterator;

import ex4_inc.Date;

public class Person implements Comparable<Person> {
    String name;
    int age;
    String contacts;
    Date birthday;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Person o) {
        if (age == o.age) {
            return name.compareTo(o.name);
        }
        return age - o.age;  // сортировка по возрасту
//        return  name.length() - o.name.length();  // сортировка по количеству букв в имени
    }
}
