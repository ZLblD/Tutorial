package DZ1;

/**
 * Created by TEHOTD7 on 01.06.2017.
 */
public class J2_DZ2 {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать");  // 1.Приветствуем игрока
        System.out.println("Введите Имя:"); // Запрашиваем его имя

        // создаем константы, которые в будущем могут пригодиться для игры

        int p1 = 4;
        int p2 = 3;
        int p3 = 2;
        int p4 = 1;
        int vsegoKorab = 10;

        // Создаем нужное количество объектов-кораблей

        Ship ship1_1 = new Ship();
        Ship ship1_2 = new Ship();
        Ship ship1_3 = new Ship();
        Ship ship1_4 = new Ship();
        Ship ship2_1 = new Ship();
        Ship ship2_2 = new Ship();
        Ship ship2_3 = new Ship();
        Ship ship3_1 = new Ship();
        Ship ship3_2 = new Ship();
        Ship ship4_1 = new Ship();

        // сообщение о победителе
        System.out.println("Победитель !");
    }
}
