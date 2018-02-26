package Horstmann.Glava4;

import java.time.LocalDate;

//    изменили под static, убрали hariDay
class Employee {
    private String name;    // поле экземпляра класса
    private double salary;
    //    private LocalDate hariDay;
    private int id;
    private static int nextId = 1;

//    public Employee(String name, double salary, int year, int month, int day) {
//        this.name = name;
//        this.salary = salary;
//        hariDay = LocalDate.of(year, month, day);
//    }


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
//        id = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    //    public LocalDate getHariDay() {
//        return hariDay;   // дата приема
//    }

    public void setId() {
        id = nextId;  // установить следующий достпуный идентификатор
        nextId++;
    }

    public static int getNextId() {
        return nextId;  // возвратить статическое поле
    }

    public void raiseSalary(double byPercent) {   // raise = поднимать Salary = зарплата
        double raise = salary * byPercent / 100;
        salary += raise;

    }

    public static void tripleSalary(Employee x){
        x.raiseSalary(200);
    }


    //    проверка на работоспособность клааса
    public static void main(String[] args) {
    Employee e = new Employee("Harry",50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
