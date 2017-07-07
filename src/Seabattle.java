import java.util.Scanner;

/**
 * Created by ЗВЕРЬ-МАШИНА on 21.05.2017.
 */
public class Seabattle {
    public static void main(String[] args) {
        char[] cells = new char[10];
        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }
        int position = 4;
        cells[position] = 'x';
        do {
            System.out.println(cells);
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            System.out.printf("Вы ввели: %s\n", s);
            int shoot = Integer.parseInt(s);
            switch (cells[shoot]) {
                case '.':
                    System.out.println("Промах");
                    cells[shoot] = '*';
                    break;
                case 'x':
                    System.out.println("Попал в коробль");
                    cells[shoot] = '-';
                    System.out.println(cells);
                    break;
                case '*':
                    System.out.println("Уже стрелял");
                    break;
                default:
                    System.out.println("ERROR");
            }
        } while (cells[position] == 'x');

    }
}
