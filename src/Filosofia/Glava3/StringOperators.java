package Filosofia.Glava3;

public class StringOperators {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int z = 2;
        String s = "x, y, z ";
        System.out.println(s + x + y + z);
        System.out.println(x + " " + s); // преобразует х в String
        s += "(summed) = "; // оператор конкатенации
        System.out.println(s + (x+y+z));
        System.out.println("" + x);  // Сокращения klz Integer.toString();
    }
}
