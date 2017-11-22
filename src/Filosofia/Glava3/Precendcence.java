package Filosofia.Glava3;

public class Precendcence {
    public static void main(String[] args) {
        int x = 1;      //1
        int y = 2;      //1
        int z = 3;      //1
        int a = x + y + z;
        int b = x + (y - 2) / (2 + z); // 2

        System.out.println("a= " +a + "; b= " + b);
    }
}
