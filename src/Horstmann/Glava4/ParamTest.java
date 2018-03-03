package Horstmann.Glava4;


public class ParamTest {
    public static void main(String[] args) {
        /**
         * Тест 1: методы не могут видоизменять числовые параметры
         */
        System.out.println("Тестирование метода tripleValue:");
        double percent = 10;
        System.out.println("До выполнения: percent=" + percent);
        tripleValue(percent);
        System.out.println("После выполнения: percent=" + percent);

        /**
         * Тест 2: методы могут изменять состояние объектов
         * передаваемых в качестве параметров
         */
        System.out.println("\nТестирование метода tripleSalary:");
        Employee harry = new Employee("Harry", 50000);
        System.out.println("До выполнения: salary= " + harry.getSalary());
        tripleSalary(harry);
        System.out.println("После выполнения: salary= " + harry.getSalary());

        /**
         * Тест 3: методы не могут присоединять новые объекты
         * к объектным параметрам
         */
        System.out.println("\nТестирование метода swap:");
        Employee a = new Employee("Alice", 70000);
        Employee b = new Employee("Bod", 60000);
        System.out.println("До выполнения: а= " + a.getName());
        System.out.println("До выполнения: b= " + b.getName());
        swap(a, b);
        System.out.println("После выполнения: а= " + a.getName());
        System.out.println("После выполнения: b= " + b.getName());

    }

    public static void tripleValue(double x) {   // не сработает
        x = 3 * x;
        System.out.println("В конце метода: х= " + x);
    }

    public static void tripleSalary(Employee x) {   // сработает
        x.raiseSalary(200);
        System.out.println("В конце метода: salary= " + x.getSalary());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("В конце метода: х= " + x.getName());
        System.out.println("В конце метода: y= " + y.getName());
    }
}
