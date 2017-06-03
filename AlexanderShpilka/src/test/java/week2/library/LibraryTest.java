package week2.library;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    private Library library;
    @Before
    public void setLibrary() {library = new Library("StateUkr");}
    @After
    public void tearDown() {library = null;}

    @Test
    public void add_null_Reader() {
        Reader nullReader = null;
        assertFalse(library.addReader(nullReader));
    }

    @Test
    public void add_new_reader() {
        Reader reader = new Reader("Andrew", "King", 6363636363L);
        assertTrue(library.addReader(reader));
    }

    @Test
    public void add_reader_same_idCode() {
        Reader reader1 = new Reader("Andrew", "King", 6363636363L);
        Reader reader2 = new Reader("Alex", "Evil", 6363636363L);
        assertTrue(library.addReader(reader1));
        assertFalse(library.addReader(reader2));
    }

    @Test
    public void add_two_different_readers() {
        Reader reader1 = new Reader("Andrew", "King", 6363636363L);
        Reader reader2 = new Reader("Alex", "Evil", 3636363636L);
        assertTrue(library.addReader(reader1));
        assertTrue(library.addReader(reader2));
    }

    @Test
    public void set_black_to_null_reader() {
        Reader nullReader = null;
        assertFalse(library.setBlackListStatus(nullReader, true));
    }

    @Test
    public void set_black_to_not_added_reader() {
        Reader reader = new Reader("Andrew", "King", 6363636363L);
        assertFalse(library.setBlackListStatus(reader, true));
    }

    @Test
    public void set_black_to_added_reader() {
        Reader reader = new Reader("Andrew", "King", 6363636363L);
        assertTrue(library.addReader(reader));
        assertTrue(library.setBlackListStatus(reader, true));
        assertEquals(true, reader.getInBlackList());
    }

    @Test
    public void add_null_edition_to_library() {
        Edition book1 = null;
        assertFalse(library.addEdition(book1));
    }

    @Test
    public void add_edition_to_library() {
        Edition book1 = new Book("War and Peace", 1869, "rus", false, 20,
                "Reading Club", "978-10-356-19", 10000,
                "Lev", "Tolstoy", 1500, Genre.NOVEL);
        assertTrue(library.addEdition(book1));
    }

    @Test
    public void add_same_edition_to_library() {
        Edition book1 = new Book("War and Peace", 1869, "rus", false, 20,
                "Reading Club", "978-10-356-19", 10000,
                "Lev", "Tolstoy", 1500, Genre.NOVEL);
        Edition book2 = new Book("War and Peace", 1869, "rus", false, 15,
                "Reading Club", "978-10-356-19", 10000,
                "Lev", "Tolstoy", 1500, Genre.NOVEL);
        assertTrue(library.addEdition(book1));
        assertTrue(library.addEdition(book2));
        assertEquals(35, book1.getQuantity());
    }

    @Test
    public void give_edition_all_present() {
        Edition book = new Book("War and Peace", 1869, "rus", false, 20,
                "Reading Club", "978-10-356-19", 10000,
                "Lev", "Tolstoy", 1500, Genre.NOVEL);
        Reader reader = new Reader("Andrew", "King", 6363636363L);
        assertTrue(library.addEdition(book));
        assertTrue(library.addReader(reader));
        assertTrue(library.giveEdition(book, reader));
        assertEquals(19, book.getQuantity());
    }

    @Test
    public void give_same_edition_twice() {
        Edition book = new Book("War and Peace", 1869, "rus", false, 20,
                "Reading Club", "978-10-356-19", 10000,
                "Lev", "Tolstoy", 1500, Genre.NOVEL);
        Reader reader = new Reader("Andrew", "King", 6363636363L);
        assertTrue(library.addEdition(book));
        assertTrue(library.addReader(reader));
        assertTrue(library.giveEdition(book, reader));
        assertFalse(library.giveEdition(book, reader));
    }

    @Test
    public void give_the_forth_edition() {
        Edition book1 = new Book("AAA", 1869, "ukr", false, 20,
                "Reading Club", "978-10-356-19", 10000,
                "DDD", "TTT", 1500, Genre.NOVEL);
        Edition book2 = new Book("BBB", 1500, "rus", false, 10,
                "Reading Club", "978-10-356-19", 10000,
                "EEE", "ZZZ", 800, Genre.NOVEL);
        Edition book3 = new Book("EEE", 2000, "eng", false, 15,
                "Reading Club", "978-10-356-19", 10000,
                "UUU", "OOO", 450, Genre.NOVEL);
        Edition book4 = new Book("YYY", 2010, "rus", false, 48,
                "Reading Club", "978-10-356-19", 10000,
                "HHH", "AAA", 357, Genre.NOVEL);
        Reader reader = new Reader("Andrew", "King", 6363636363L);
        assertTrue(library.addReader(reader));
        assertTrue(library.addEdition(book1));
        assertTrue(library.addEdition(book2));
        assertTrue(library.addEdition(book3));
        assertTrue(library.addEdition(book4));
        assertTrue(library.giveEdition(book1, reader));
        assertTrue(library.giveEdition(book2, reader));
        assertTrue(library.giveEdition(book3, reader));
        assertFalse(library.giveEdition(book4, reader));
    }

    @Test
    public void give_edition_when_in_black_list() {
        Reader reader = new Reader("Andrew", "King", 6363636363L);
        Edition book1 = new Book("AAA", 1869, "ukr", false, 20,
                "Reading Club", "978-10-356-19", 10000,
                "DDD", "TTT", 1500, Genre.NOVEL);
        Edition book2 = new Book("BBB", 1500, "rus", false, 10,
                "Reading Club", "978-10-356-19", 10000,
                "EEE", "ZZZ", 800, Genre.NOVEL);
        assertTrue(library.addReader(reader));
        assertTrue(library.addEdition(book1));
        assertTrue(library.setBlackListStatus(reader, true));
        assertFalse(library.giveEdition(book2, reader));
    }

    @Test
    public void give_edition_quantity_one_twice() {
        Edition book = new Book("AAA", 1869, "ukr", false, 1,
                "Reading Club", "978-10-356-19", 10000,
                "DDD", "TTT", 1500, Genre.NOVEL);
        Reader reader1 = new Reader("Andrew", "King", 6363636363L);
        Reader reader2 = new Reader("Alex", "Evil", 3636363636L);
        assertTrue(library.addEdition(book));
        assertTrue(library.addReader(reader1));
        assertTrue(library.addReader(reader2));
        assertTrue(library.giveEdition(book, reader1));
        assertFalse(library.giveEdition(book, reader2));
    }

    @Test
    public void give_edition_check_quantity() {
        Edition book = new Book("AAA", 1869, "ukr", false, 10,
                "Reading Club", "978-10-356-19", 10000,
                "DDD", "TTT", 1500, Genre.NOVEL);
        Reader reader1 = new Reader("Andrew", "King", 6363636363L);
        Reader reader2 = new Reader("Alex", "Evil", 3636363636L);
        assertTrue(library.addEdition(book));
        assertTrue(library.addReader(reader1));
        assertTrue(library.addReader(reader2));
        assertEquals(10, book.getQuantity());
        assertEquals(0, reader1.numberOfTakenBooks());
        assertEquals(0, reader2.numberOfTakenBooks());
        assertTrue(library.giveEdition(book, reader1));
        assertTrue(library.giveEdition(book, reader2));
        assertEquals(8, book.getQuantity());
        assertEquals(1, reader1.numberOfTakenBooks());
        assertEquals(1, reader2.numberOfTakenBooks());
    }

    @Test
    public void give_edition_not_present_in_library() {
        Edition book = new Book("AAA", 1869, "ukr", false, 10,
                "Reading Club", "978-10-356-19", 10000,
                "DDD", "TTT", 1500, Genre.NOVEL);
        Reader reader = new Reader("Andrew", "King", 6363636363L);
        assertTrue(library.addReader(reader));
        assertFalse(library.giveEdition(book, reader));
    }

    @Test
    public void give_edition_reader_not_present_in_library() {
        Edition book = new Book("AAA", 1869, "ukr", false, 10,
                "Reading Club", "978-10-356-19", 10000,
                "DDD", "TTT", 1500, Genre.NOVEL);
        Reader reader = new Reader("Andrew", "King", 6363636363L);
        assertTrue(library.addEdition(book));
        assertFalse(library.giveEdition(book, reader));
    }

    @Test
    public void set_black_to_added_reader_different_reference() {
        Reader reader = new Reader("Andrew", "King", 6363636363L);
        Reader reader2 = new Reader("Andrew", "King", 6363636363L);
        assertTrue(library.addReader(reader));
        assertTrue(library.setBlackListStatus(reader2, true));
        assertEquals(true, reader.getInBlackList());
    }

    @Test
    public void give_edition_all_present_different_reference() {
        Edition book = new Book("War and Peace", 1869, "rus", false, 20,
                "Reading Club", "978-10-356-19", 10000,
                "Lev", "Tolstoy", 1500, Genre.NOVEL);
        Edition bookCopy = new Book("War and Peace", 1869, "rus", false, 20,
                "Reading Club", "978-10-356-19", 10000,
                "Lev", "Tolstoy", 1500, Genre.NOVEL);
        Reader reader = new Reader("Andrew", "King", 6363636363L);
        Reader readerCopy = new Reader("Andrew", "King", 6363636363L);
        assertTrue(library.addEdition(book));
        assertTrue(library.addReader(reader));
        assertTrue(library.giveEdition(bookCopy, readerCopy));
        assertEquals(19, book.getQuantity());
        assertEquals(1, reader.getEditions().size());
    }

}
