package Test_;

public class Test1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int t;
        System.out.println("a= " + a + " b= " + b );

        t = a;
        System.out.println("a= " + a + " b= " + b + " t= " + t);
        a = b;
        System.out.println("a= " + a + " b= " + b + " t= " + t);
        b = t;
        System.out.println("a= " + a + " b= " + b + " t= " + t);
    }
}
