package Horstmann.Glava5;

class ManagerTest {

    public static void main(String[] args) {

//        построить объект типа Manager
        Manager boss = new Manager("Carl Craker", 80000, 1987, 12, 15);
        boss.setBonus(5000);
//
//        создаем массив работников
        Employee[] staff = new Employee[3];

//        заполняем массив работников объектами типа Manager и Employee
        staff[0]  = boss;
        staff[1]  = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2]  = new Employee("Tommy Tester", 40000, 1990, 3, 15);

//        вывести данные обо всех объектах типа Employee
        for (Employee employee : staff) {
            System.out.println("name=" + employee.getName()+ ", salary=" + employee.getSalary());
        }

//        if(staff[1] instanceof Manager){}

    }
}
