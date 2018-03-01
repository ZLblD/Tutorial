package Test_;

public class Tool {
    public static void main(String[] args) {
        Hammer hammer1 = new Hammer("Молоток", 2, "Черная");
        Hammer hammer2 = new Hammer("Кувалда", 10, "Красная");
        Screwdriver screwdriver1 = new Screwdriver("Крестовая", 1, "Желтая" , "PH" );
        Screwdriver screwdriver2 = new Screwdriver("Крестовая", 2, "Красная" , "PZ" );
        Screwdriver screwdriver3 = new Screwdriver("Плоская", 3 , "Зеленая" );

        hammer1.getInfo();
        hammer2.getInfo();
        screwdriver1.getInfo();
        screwdriver2.getInfo();
        screwdriver3.getInfo();
    }
}
