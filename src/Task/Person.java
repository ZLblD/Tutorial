package Task;

import java.util.ArrayList;

public class Person {
    String name;
    int age;
    ArrayList<Thing> things;
    int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Person(int money) {
        this.money = money;
    }

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


    int giveMoney(int M) {
        return money - M;
    }

    int takeMoney(int N) {
        return money + N;
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
