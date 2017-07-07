package J1_urok4;

/**
 * Created by TEHOTD7 on 19.06.2017.
 */
// Инкапсуляция
public class Cat {      //JavaBean
    // public private protected default (package - access)
    private int age;        // возможен вандализм
    private int weigth;     //
    private String name;
    private boolean sex;
    private boolean isAlive;
    static int count;

    Cat(){
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Cat.count = count;
    }

    public void setAge(int age) {
        if (age < 100) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
