package Shild.Package.bookpackext;

import Shild.Package.bookpack.Book;

/**
 * Created by TEHOTD7 on 12.07.2017.
 */
public class ExtBook extends Book {
    private String publisher;


    public ExtBook(String title, String author, int pubDate, String publisher) {

        super(title, author, pubDate);
        this.publisher = publisher;
    }

    public void method(){
        getAuthor();
    }
    @Override
    public void show(){
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


}
