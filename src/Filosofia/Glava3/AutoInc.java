package Filosofia.Glava3;

public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);
        System.out.println("++i = " + ++i);  // Префиксный инкремент
        System.out.println("i++ = " + i++);  // Постфиксный инкремент
        System.out.println("i = " + i);
        System.out.println("--i = " + --i);  // Префиксный инкремент
        System.out.println("i-- = " + i--);  // Постфиксный инкремент
        System.out.println("i = " + i);

//        Проверка объектов на равенство

        Integer n1 = new Integer(47);  // n1 = 47
        Integer n2 = new Integer(47);  // n2 = 47
        System.out.println(n1 == n2);   // будет false, т.к. == сравнивает только ссылки, а
                                        // n1 и n2 разные ссылки для объекта Integer
        System.out.println(n1 != n2);   // будет true
//        если нужно сравнить действительное содержимое объектов,
//        то нужно воспользоваться методом equals() кроме примитивов;
        System.out.println(n1.equals(n2));
    }
}
