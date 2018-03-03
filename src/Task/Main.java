package Task;

class Main {
    public static void main(String[] args) {
        Person vasya = new Person(100, "Vasya");
        Person nikita = new Person(200, "Nikita");

        vasya.infoMoney();      // показать сколько денег у Васи
        nikita.infoMoney();     // показать сколько денег у Никиты

        vasya.divMoney(nikita, 10);  // Вася взял у Никиты 10 денег
        nikita.infoMoney();     // показать сколько денег у Никиты

        nikita.divMoney(vasya, 20);  // Никита взял у Васи 20 денег
        vasya.infoMoney();      // показать сколько денег у Васи


    }
}
