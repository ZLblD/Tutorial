package Shild.Package;

import Shild.Package.bookpackext.ExtBook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Настя on 12.07.2017.
 */
public class MainPackage {
    public static void main(String[] args) {
        ExtBook extBook = new ExtBook("Заголовок", "Автор", 4120, "Публикатор");
        ExtBook extBook1 = new ExtBook("Заголовок", "Автор1", 4120, "Публикатор");
        ExtBook extBook2 = new ExtBook("Заголовок", "Автор2", 4120, "Публикатор");

        String author = extBook.getAuthor();

        MainPackage mainPackage = new MainPackage();


        try {
            mainPackage.getString();
            System.out.println("СЮюда не попадем");
        } catch (IOException e) {
            System.out.println("У вас ошибка");
        } finally {
            System.out.println("Я работаю всегда");
        }
    }

    public String getString() throws IOException {
        System.out.println("Введите число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.close();
        return reader.readLine();
    }

}
