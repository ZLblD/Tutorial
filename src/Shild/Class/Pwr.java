package Shild.Class;

public class Pwr {
    double b;   // число которое хотим взвести в степень
    int e;      // степень
    double val; // значение

    public Pwr(double b, int e) {
        this.b = b;
        this.e = e;

        this.val = 1;
        if (e == 0) return;
        for (; e > 0; e--) {
            this.val = this.val * b;
        }
    }

    public double get_pwr() {
        return this.val;
    }
}

class DemoPwr{
    public static void main(String[] args) {
        Pwr x = new Pwr(4.0,2);
        Pwr y = new Pwr(2.5,1);
        Pwr z = new Pwr(5.7,0);

        System.out.println(x.b + " в степени " + x.e + " равно " + x.get_pwr());
        System.out.println(y.b + " в степени " + y.e + " равно " + y.get_pwr());
        System.out.println(z.b + " в степени " + z.e + " равно " + z.get_pwr());
    }
}

