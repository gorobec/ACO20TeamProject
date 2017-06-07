package library;

import java.util.ArrayList;
import java.util.Date;

/**
 * Edition
 */
public class Edition extends Book {
    private Publisher publisher;
    private Date date;
    private int qty;
    private char[] ISBN; // ? is it good

    Edition(){

    }
    public Edition(String name, ArrayList<Author> authors) {
        this.name = name;
        this.authors = authors;
    }
}
