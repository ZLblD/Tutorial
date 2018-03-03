package Filosofia.Glava3;

public class PassObject {
    static void f(Letter y){
        y.c = 'z';
    }
    static void m(Journal y){
        y.а = 2.7f;
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c: " + x.c);
        f(x);
        System.out.println("2: x.c: " + x.c);

        Journal u = new Journal();
        u.а = 3.14f;
        System.out.println("1: u.a: " + u.а);
        m(u);
        System.out.println("2: u.a: " + u.а);
    }
}
