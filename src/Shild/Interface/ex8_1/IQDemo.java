package Shild.Interface.ex8_1;

public class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(10);
        CicrcularQueue q3 = new CicrcularQueue(10);

        ICharQ iQ;
        char ch;
//        int i;

        iQ = q1;
        // Поместить ряд символов в очередь фиксированного размера
        for (int i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }
        // отобразить содержимое очереди
        System.out.print("Содержимое фиксированной очереди: ");
        for (int i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q2;
        // поместить ряд символов в динамическую очередь
        for (int i = 0; i < 10; i++) {
            iQ.put((char) ('Z' - i));
        }
        // отобразить содержимое очереди
        System.out.print("Содержимое динамической очереди: ");
        for (int i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q3;
        // поместить ряд символов в кольцевую очередь
        for (int i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }
        // отобразить содержимое очереди
        System.out.print("Содержимое кольцевой очереди: ");
        for (int i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();

        // Поместить больше символов в кольцевую очередь
        for (int i = 10; i < 20; i++) {
            iQ.put((char) ('A' + i));
        }

        // отобразить содержимое очереди
        System.out.println("Содержимое кольцевой очереди: ");
        for (int i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println("\nСохранение и использование данных" + "кольцевой очереди");

        // поместить символы в кольцевую очередь и извлечь их оттуда
        for (int i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }
    }
}
