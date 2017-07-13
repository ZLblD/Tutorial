package Shild.Package.bookpackext;

/**
 * Created by TEHOTD7 on 13.07.2017.
 */
public class ProtectDemo {
    public static void main(String[] args) {
        ExtBook books[] = new ExtBook[5];

        books[0] = new ExtBook("Java: для начинающих", "Шилд", 2007, "Вильямс");

        books[1] = new ExtBook("Java: продвинутый курс", "Шилд", 2007, "Вильямс");

        books[2] = new ExtBook("The Art of Java", "Шилд и Ризинг", 2003,"Осборн");

        books[3] = new ExtBook("Red Storm Rising", "Clancy", 1986, "Putham");

        books[4] = new ExtBook("On the Road", "Kerouac", 1955, "Viking");

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }

        // Поиск по автору
        System.out.println("Показать все книги Шилда");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor() == "Шилд")
                System.out.println(books[i].getTitle());
        }
    }
}
