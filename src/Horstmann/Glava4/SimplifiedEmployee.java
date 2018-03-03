package Horstmann.Glava4;

public class SimplifiedEmployee {
    private String name;
    private double salary;

    public SimplifiedEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }
}
