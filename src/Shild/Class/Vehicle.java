package Shild.Class;

public class Vehicle {
    int passengers;  // кол-во пасажиров
    int fuelcap;    // емпоксть топливного бака
    int mpg;        // расход топлива

//    конструктор класса Vehicle
    public Vehicle(int passengers, int fuelcap, int mpg) {
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }

    //    Отобразить дальность поезкди транспортного средства
//    void range() {
//        System.out.println("Дальность - " + fuelcap * mpg + " миль");
//    }
//    опеределяем дальность поездки транспортного средства
    int range() {
        return mpg * fuelcap;
    }

//    рассчитываем объем топлива, необходимого транспортному
//    средству для преодоления заданного расстояния
    double fuelneeded(int miles){
        return (double) miles / mpg;
    }


// тестировачный метод
    void myMeth() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) return;
            System.out.println(i);
        }
    }
}
