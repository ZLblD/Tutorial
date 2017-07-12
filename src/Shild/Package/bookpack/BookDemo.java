package Shild.Package.bookpack;

/**
 * Created by TEHOTD7 on 12.07.2017.
 */
public class BookDemo {
    public static void main(String[] args) {
        Book books[] = new Book[5];

        books[0] = new Book("Java: для начинающих", "Shild", 2014);
        books[1] = new Book("Java: продвинутый курс", "Shild", 2014);
        books[2] = new Book("The Art of Java", "Shild и Ризинг", 2003);
        books[3] = new Book("Red Storm Rising", "Clancy", 1986);
        books[4] = new Book("On the Road", "Kerouac", 1955);

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }
    }
}
