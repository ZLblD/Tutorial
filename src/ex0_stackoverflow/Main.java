package ex0_stackoverflow;

/**
 * Created by ЗВЕРЬ-МАШИНА on 27.05.2017.
 */
public class Main {
    private static int i;

    public static void main(String[] args) {
        test();
        }

    private static void test() {
        System.out.println("testing " + i++);
        test();
    }


}
