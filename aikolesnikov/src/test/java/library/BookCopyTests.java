package library;

import org.junit.Before;
import org.junit.Test;

import static library.LIB_SETTINGS.DEFAULT_CLIENT_NAME;
import static org.junit.Assert.*;

/**
 *
 */


public class BookCopyTests {
    @Before
    public void prepareLibraryTest(){
        Client.setClientCounter(0);
    }

    @Test
    public void checkBookCopy() {
        BookCopy b1 = new BookCopy();
        BookCopy b2 = new BookCopy();

        b2.setName("Book_name");
        // System.out.println(b2);
    }
}
