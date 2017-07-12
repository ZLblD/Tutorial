package Shild.Наследование_1;

/**
 //    простая иерахия классов
 //    Класс, описывающий двумерные объекты
 */


public class TwoDShape {
    private double width;
    private double height;

    // Параметризированный кснструктор
    TwoDShape(double w, double h){
        width = w;
        height = h;
    }

    /**
     // Конструктор по умолчанию
     TwoDShape() {width = height = О.О;}

     // Параметризированный конструктор
     TwoDShape(douЫe w, douЫe h) { width = w; height = h;}

     // Конструирование объекта с одинаковыми значениями
     // переменных экземпляра width и height
     TwoDShape(douЫe х) {width = height = х;}

     */

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    void showDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}
