package library;

import datastructures.MyArrayList;
import org.junit.Assert;

import static library.LIB_SETTINGS.BOOK_RENT_LIMIT;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class LibraryTests {
    Library lib = new Library();

    @Before
    public void prepareLibraryTest() {
        lib.getClients().clear();
        Client.setClientCounter(0);
        lib.getBooks().clear();
        BookCopy.setBookCounter(0);
    }


    @Test
    public void checkLibrary() {

        Client c1 = new Client();
        Client c2 = new Client();
        Client c3 = new Client(null);
        Client c4 = new Client("Name4");

        lib.getClients().add(c1);
        lib.getClients().add(c2);
        lib.getClients().add(c3);
        lib.getClients().add(c4);

        Assert.assertEquals(((Client) lib.getClients().get(0)).getName(), "_CLIENT_");
        Assert.assertEquals(((Client) lib.getClients().get(1)).getName(), "_CLIENT_");
        Assert.assertEquals(((Client) lib.getClients().get(1)).getId(), 2);
        Assert.assertEquals(((Client) lib.getClients().get(2)).getName(), "_CLIENT_");
        Assert.assertEquals(((Client) lib.getClients().get(2)).getId(), 3);
        Assert.assertEquals(((Client) lib.getClients().get(3)).getName(), "Name4");
        Assert.assertEquals(((Client) lib.getClients().get(3)).getId(), 4);

        // System.out.println(Client.getClientCounter());
        // System.out.println(lib.printListOfClients());
    }

    @Test
    public void addClient() {
        Client c1 = new Client();
        Client c2 = new Client();

        assertTrue(lib.addReader(c1));
        assertFalse(lib.addReader(c1));
        assertTrue(lib.addReader(c2));
        assertFalse(lib.addReader(c2));
        assertFalse(lib.addReader(null));

        assertEquals(lib.getClients().size(), 2);
    }

    @Test
    public void addBook() {
        BookCopy b1 = new BookCopy();
        BookCopy b2 = new BookCopy();

        assertTrue(lib.addBook(b1));
        assertFalse(lib.addBook(b1));
        assertTrue(lib.addBook(b2));
        assertFalse(lib.addBook(b2));
        assertFalse(lib.addBook(null));

        assertEquals(lib.getBooks().size(), 2);
    }

    @Test
    public void getBookByClient() {

        Client client = new Client();
        lib.addReader(client);

        BookCopy book = null;
        for (int i = 0; i < BOOK_RENT_LIMIT + 1; i++) {
            book = new BookCopy();
            book.setName("Book" + book.getId());
            lib.addBook(book);
            lib.getBook(book, client);
        }

        assertEquals(lib.getBooks().size(), 1);
        assertEquals(client.getReadBooks().size(), BOOK_RENT_LIMIT);

        lib.returnBook(client, (BookCopy) client.getReadBooks().get(2));

        assertEquals(lib.getBooks().size(), 2);
        assertEquals(client.getReadBooks().size(), BOOK_RENT_LIMIT - 1);

        System.out.println(lib.getReadingBooksListAll());

        Client client2 = new Client();
        lib.addReader(client2);
        lib.getBook(book, client2);
    }
}
