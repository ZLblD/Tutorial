package J1_urok6.comparator;

import java.util.Comparator;

/**
 * Created by ЗВЕРЬ-МАШИНА on 02.10.2017.
 */
public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
//        return o1.age - o2.age; сортировка по возрасту
        return o1.name.length() - o2.name.length();  // сортировка по имени
    }
}
