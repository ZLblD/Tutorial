package Horstmann.Glava5.abstracClasses;

class PersonTest {

    public static void main(String[] args) {

        Person[] people = new Person[2];

//      заполнить массив people объектами типа Student и Employee
        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");

//        вывести менна и описания всех лиц,
//        представленных объектами типа Person

        for (Person person : people) {
            System.out.println(person.getName() + ", " + person.getDescription());
        }

//        for (Person person : people) {
//            System.out.println(people.getName() + ", " + people.getDescription());
//        }
    }
}
