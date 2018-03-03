package Filosofia.Glava4;

public class IfElse {
    static int result = 0;

    //    static void test(int testval, int target) {
//        if (testval > target) {
//            result = +1;
//        }else if (testval<target){
//            result = -1;
//        } else {
//            result = 0; // равные числа
//        }
//    }
    static void test(int testval, int target) {
        if (testval > target) {
            System.out.println("Число " + testval + " больше числа " + target);
        }
        if (testval < target) {
            System.out.println("Число " + testval + " меньше числа " + target);
        }
        if (testval == target) {
            System.out.println("Число " + testval + " равно числу " + target);

        }
    }

    static int test2(int testval, int target, int begin, int end) {
        if (testval > target && testval <= end && testval >= begin) {
            return +1;
        }
        if (testval < target && testval <= end && testval >= begin){
            return -1;
        }
        else return 0;
    }

    public static void main(String[] args) {
        test(10, 5);
//        System.out.println(result);
        test(5, 10);
//        System.out.println(result);
        test(5, 5);
//        System.out.println(result);
//        test2(10,5,0,11);
        System.out.println(test2(10,5,0,11));
        System.out.println(test2(10,5,11,20));
        System.out.println(test2(5,10,0,11));
        System.out.println(test2(5,10,11,20));
        System.out.println(test2(5,5,0,20));
        System.out.println(test2(5,5,11,20));

    }
}
