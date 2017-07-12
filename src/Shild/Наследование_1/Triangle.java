package Shild.Наследование_1;

/**
 * //    Подкласс для представления треугольников
 * //    производных от класса TwoDShape
 */
public class Triangle extends TwoDShape {

    private String style;

    /**
     * //Конструктор по умолчанию
     * Triangle () {
     * super(); // вызвать конструктор суперкласса по умолчанию
     * style = "none";}
     * <p>
     * // Конструктор
     * Triangle(String s, double w, double h) {
     * super(w, h); // вызвать конструктор суперкласса с двумя аргументами
     * style = s ;}
     * <p>
     * // Конструктор с одним аргументом
     * Triangle(double х) {
     * super(x); // вызвать конструктор суперкласса с одним аргументом
     * style = "закрашенный";}
     */


    // Конструктор
    Triangle(String s, double w, double h) {
        super(w, h);
//        setHeight(h);
//        setWidth(w);
        style = s;
    }

    double area() {                  // Из класса Triangle можно обращаться к челанам
        return getWidth() * getHeight() / 2;   // класса TwoDShape так, как если бы это были его
    }                               // его собственные члены

    void showStyle() {
        System.out.println("Треугоьлник " + style);
    }
}
