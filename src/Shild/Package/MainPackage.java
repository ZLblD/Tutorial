package Shild.Package;

import Shild.Package.bookpack.Book;
import Shild.Package.bookpackext.ExtBook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Настя on 12.07.2017.
 */
public class MainPackage {
    public static void main(String[] args) {
//        ExtBook extBook = new ExtBook("Заголовок", "Автор", 4120, "Публикатор");
//        ExtBook extBook1 = new ExtBook("Заголовок", "Автор1", 4120, "Публикатор");
//        ExtBook extBook2 = new ExtBook("Заголовок", "Автор2", 4120, "Публикатор");
//
//        String author = extBook.getAuthor();
//
//        MainPackage mainPackage = new MainPackage();


        List<String> list1 = new ArrayList<>();
        list1.add("Два");
        list1.add("Один");
        list1.add("Три");
        list1.add("Четыре");
        list1.add("Пять");
        list1.add("Один");
        list1.add("Три");
        list1.add("Три");

        for (String slovo : list1) {
            System.out.println(slovo);
        }

        List list2 = new LinkedList();


//        Set<String> set = new HashSet<String>(list1);
        // Set<String> set = new TreeSet<>(list1);
//        Set<String> set = new LinkedHashSet<>(list1);


//        Один.Четыре.Три.Пять.Два
//        Два. Один. Пять. Три.Четыре
        System.out.println();
        Map<String, ExtBook> map = new HashMap<>();
        ExtBook extBook = new ExtBook("Заголовок", "Иван", 4120, "Публикатор");
        ExtBook extBook2 = new ExtBook("Заголовок", "Вася", 4120, "Публикатор");
        ExtBook extBook3 = new ExtBook("Заголовок", "Петр", 4120, "Публикатор");
        ExtBook extBook4 = new ExtBook("Заголовок", "Илья", 4120, "Публикатор");


        map.put("Первый книга", extBook);
        map.put("Вторай книга", extBook2);
        map.put("Третия книга", extBook3);
        map.put("Четверт книга", extBook4);

        System.out.println(map.get("Третия книга"));

//        try {
//            mainPackage.getString();
//            System.out.println("СЮюда не попадем");
//        } catch (IOException e) {
//            System.out.println("У вас ошибка");
//        } finally {
//            System.out.println("Я работаю всегда");
//        }
    }

    public String getString() throws IOException {
        System.out.println("Введите число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.close();
        return reader.readLine();
    }

}
