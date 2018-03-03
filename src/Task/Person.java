package Task;

class Person {

    private int money;
    private String name;

    public Person(int money, String name) {
        this.money = money;
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void divMoney(Person person, int money) {
        person.setMoney(person.getMoney() - money);
        System.out.println(name + " взял у " + person.getName() + " немного денег = " + money);
    }

    public void infoMoney(){
        System.out.println("У " + name + " осталось " + money);
    }

    @Override
    public String toString() {
        return "Person{" +
                "money=" + money +
                ", name='" + name + '\'' +
                '}';
    }
}
