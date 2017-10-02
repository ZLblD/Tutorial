package J1_urok6.Test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> persons = new ArrayList<>();
        List<Person> persons = new ArrayList<>();
        Person person = new Person();
        person.age = 1000;
        person.name = "Tom";
        persons.add(person);

//        persons.add("Monkey");
//        persons.add(1000);

        persons.add(new Person("Jerry", 3));
        persons.add(new Person("Mary", 13));
    }
}
