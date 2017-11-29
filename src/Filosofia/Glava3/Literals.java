package Filosofia.Glava3;

public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f; // Шестнацдатеричное (нижний регистр)
        System.out.println("i1: " + Integer.toBinaryString(i1));
        int i2 = 0X2f; // Шестнацдатеричное (верхний регистр)
        System.out.println("i2: " + Integer.toBinaryString(i2));
//        int i10= 0x2f; // Шестнацдатеричное (нижний регистр)
        int i3 = 0177;   // Восьмимеричное (начинается с нуля)
        System.out.println("i3: " + Integer.toBinaryString(i3));
        char c = 0xffff; // макс. шестнадцатеричное знач. char
        System.out.println("c: " + Integer.toBinaryString(c));
        byte b = 0x7f; // макс. шестнадцатеричное знач. byte
        System.out.println("b: " + Integer.toBinaryString(b));
        short s = 0x7fff; // макс. шестнадцатеричное знач. short
        System.out.println("s: " + Integer.toBinaryString(s));
        long n1 = 200L; // суффикс, обозначающий long
        long n2 = 200l; // суффикс, обозначающий long (можно запутаться)
        long n3 = 200;
        float f1 = 1;
        float f2 = 1F; // суффикс, обозначающий float
        float f3 = 1f; // суффикс, обозначающий float
        double d1 = 1d; // суффикс, обозначающий double
        double d2 = 1D; // суффикс, обозначающий double
        System.out.println(n1 + n2 + n3 + f1 + f2 + f3 + d1 + d2);

        long l1 = 0177;   // Восьмимеричное (начинается с нуля)
        long l2 = 0x2f; // Шестнацдатеричное (нижний регистр)
        System.out.println("l1: " + Long.toBinaryString(l1));
        System.out.println("l2: " + Long.toBinaryString(l2));
        float k;
        double p;
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);


        for (int i = 0; i < 10; i++) {
            int abc;
            String text = (i % 2 == 0) ? "четное" : "нечетное";
            System.out.println("Число " + i + " - " + text);
            abc = (i % 2 == 0) ? 555 : 777;

            System.out.println("Число " + i + " - " + abc);
        }
    }
}
