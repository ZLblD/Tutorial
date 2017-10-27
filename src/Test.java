import static java.lang.Integer.MAX_VALUE;

public class Test {
    public static void main(String[] args) {
        Object object = new Object();
        int hCode;
        int hCode3;
        Integer var;
        Integer var2;

        var = 1 + 2;
        var2 = 2 + 1;

        String hCode2;
        hCode = object.hashCode();
        hCode3 = object.hashCode();
        hCode2 = String.valueOf(object.hashCode());
        System.out.println(hCode);
        System.out.println(hCode2);
        var.equals(var2);
        System.out.println(var.equals(var2));
    }
}
