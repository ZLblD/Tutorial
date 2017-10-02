package Shild.While_For;
// не работает должно быть на убывание
public class Comma {
    public static void main(String[] args) {
        int i, j;
        for (i = 0, j = 0; i < j; i++, j--) {
            System.out.println("i и j" + i + " " + j);
        }
    }
}
