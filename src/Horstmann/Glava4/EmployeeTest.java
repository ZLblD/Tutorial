package Horstmann.Glava4;

public class EmployeeTest {
    public static void main(String[] args) {
//        заполнить массив staff тремя объектами типа Employee
        Employee[] staff = new Employee[3];   // массивв персонала, типа служащих

//        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);  // персонал
//        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
//        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        staff[0] = new Employee("Tom", 40000);
        staff[1] = new Employee("Dick", 60000);
        staff[2] = new Employee("Harry", 65000);

//        поднять всем работникам зарпату на 5%
        for (Employee employee : staff) {
            employee.raiseSalary(5);
        }
        for (Employee employee : staff) {
            employee.setId();
            System.out.println("name= " + employee.getName() + " ,id= " + employee.getId() + " , salary= " + employee.getSalary());
        }

        int n = Employee.getNextId(); // вызвать статический метод
        System.out.println("Next available id=" + n);




//        staff[2].raiseSalary(100);

//      вывести данные обо всех объектах типа Employee
//        for (Employee employee : staff) {
//            System.out.println("Name = " + employee.getName() + ", salary= " + employee.getSalary() +
//            ", hireDay = " + employee.getHariDay());
//        }

//        for (Employee employee : staff) {
//            employee.setId();
//            System.out.println();
//
//        }
    }
}
