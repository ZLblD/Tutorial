package Шилд.Наследование_1;

/**
 * Created by TEHOTD7 on 04.07.2017.
 */
public class ColorTriangle extends Triangle {

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
     *
     * @param s
     * @param w
     * @param h
     */
    private String color;
    ColorTriangle(String c ,String s, double w, double h) {
        super(s, w, h);
        color = c;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void showColor(){
        System.out.println("Цвет - " + color);
    }
}
