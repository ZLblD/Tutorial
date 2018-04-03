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

        Map<Integer, Character> map;        //ключ -> значению
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

        System.out.println("-----SET-----");

        set = new HashSet();
//          set = new LinkedHashSet();
//          set = new TreeSet();

        set.add("asdf");
        // возвращает false при добалвение двойника
        System.out.println(set.add("hello"));
        System.out.println(set.add("hello"));
        set.add("hello");
        set.add("hello");
        set.add("hello");
        set.add("hel" + "lo");
        set.add("java");

        System.out.println(set);

        System.out.println("-----MAP-----");

        map = new HashMap<>();

        map.put(0, 'X');
        map.put(1, 'O');
        map.put(1, 'Y');
        map.put(2, 'X');

        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());

        Map<String, Person> mapName = new HashMap();
//        Map<String, Person> mapName2 = new LinkedHashMap<>();
        mapName.put("friend", new Person("Tom", 20));
//        mapName.put("friend", new Person("Tom2", 25));   // затрет Tom
        mapName.put("vip", new Person("Kitty", 35));

//        System.out.println(mapName.get("friend").name);

        for (Person person : mapName.values()) {
            System.out.println(person.name);
        }

        Map <Person, String> tagPerson = new HashMap<Person, String>();

        tagPerson.put(new Person("Tom", 20), "friend");
        tagPerson.put(new Person("Jerry", 22), "friend");
        tagPerson.put(new Person("Mary", 25), "friend");
        tagPerson.put(new Person("Kitty", 35), "vip");

        System.out.println(tagPerson);
        System.out.println(new HashSet<String>(tagPerson.values()));
        for (Map.Entry<Person, String> personStringEntry : tagPerson.entrySet()) {
            if (personStringEntry.getValue().equals("friend")){
                System.out.println(personStringEntry.getKey().name);
            }
        }
    }
}
