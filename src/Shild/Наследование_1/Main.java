package Shild.Наследование_1;

/**
 //    Подкласс для представления треугольников
 */
public class Main {
    public static void main(String[] args) {

//        Triangle t1 = new Triangle("закрашенный", 4.0, 4.0);
//        Triangle t2 = new Triangle("контурный", 8.0, 12.0);

        ColorTriangle t1 = new ColorTriangle("Синий", "контурный", 8.0, 12.0);
        ColorTriangle t2 = new ColorTriangle("Крансый", "закрашенный", 8.0, 12.0);

//        t1.setWidth(4.0);
//        t1.setHeight(4);
//        t1.setStyle("закрашенный");
//
//        t2.setWidth(8.0);
//        t2.setHeight(12.0);
//        t2.setStyle("контурный");

        System.out.println("Инфоромация о t1: ");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Площадь - " + t1.area());

        System.out.println();

        System.out.println("Инфоромация о t2: ");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Площадь - " + t2.area());

    }
}
