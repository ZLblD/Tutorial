package Task;

import java.util.ArrayList;

public class Person {
    String name;
    int age;
    ArrayList<Thing> things;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    @Override
    public String toString() {
        return
                "Я " + name +
                ", и мне= " + age +
                '}';
    }

    public ArrayList<Thing> getThings() {
        return things;
    }



    public void setThings(ArrayList<Thing> things) {
        this.things = things;
    }



    //    ArrayList<String> clothes = new ArrayList();
// void said(){
//     System.out.println("Я " + name + " мне " + age + " лет");
// }

//    void thing(String cloth){
//        clothes.add(cloth);
//        System.out.println(cloth);
//    }
}
