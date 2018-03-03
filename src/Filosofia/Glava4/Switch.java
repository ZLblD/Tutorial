package Filosofia.Glava4;

public class Switch {
    public static void main(String[] args) {
        int month = 3;
        String monthString;

        switch (month) {
            case 1:
                monthString = "Январь";
                break;
            case 2:
                monthString = "Февраль";
                break;
            case 3:
                monthString = "Март";
                break;
            case 4:
                monthString = "Апрель";
                break;
            case 5:
                monthString = "Май";
                break;
            case 6:
                monthString = "Июнь";
                break;
            case 7:
                monthString = "Июль";
                break;
            case 8:
                monthString = "Август";
                break;
            case 9:
                monthString = "Сентябрь";
                break;
            case 10:
                monthString = "Октябрь";
                break;
            case 11:
                monthString = "Ноябрь";
                break;
            case 12:
                monthString = "Декабрь";
                break;
            default:
                monthString = "не знаем такого";
                break;
        }
        System.out.println(monthString);

        int month2 = 2;
        int years = 2012;
        int numDays = 0;
        switch (month2) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if ((years % 4 == 0) && !(years % 100 == 0) || (years % 400 == 0)) {
                    numDays = 29;
                } else {
                    numDays = 28;
                }
                break;
            default:
                System.out.println("не существующий месяц");
                break;
        }
        System.out.println("Число дней = " + numDays);

        for (int i = 1; i <= 11; i++) {
            switch (i) {
                case 1:
                    System.out.println("Выводим 1");
                    break;
                case 2:
                    System.out.println("Выводим 2");
                    break;
                case 3:
                    System.out.println("Выводим 3");
                    break;
                case 4:
                    System.out.println("Выводим 4");
                    break;
                case 5:
                    System.out.println("Выводим 5");
                    break;
                case 6:
                    System.out.println("Выводим 6");
                    break;
                case 7:
                    System.out.println("Выводим 7");
                    break;
                case 8:
                    System.out.println("Выводим 8");
                    break;
                case 9:
                    System.out.println("Выводим 9");
                    break;
                case 10:
                    System.out.println("Выводим 10");
                    break;
                default:
                    System.out.println("Вышли за пределы цикла ");
                    break;
            }
            System.out.println(i);
        }
    }
}
