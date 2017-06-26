package library;

import org.junit.Before;
import org.junit.Test;

import static library.LIB_SETTINGS.DEFAULT_CLIENT_NAME;
import static org.junit.Assert.*;

/**
 * check readers
 */
public class ClientTests {

    @Before
    public void prepareLibraryTest(){
        Client.setClientCounter(0);
    }

    @Test
    public void checkClient() {
        Client c1 = new Client();
        Client c2 = new Client();
        Client c3 = new Client(null);
        Client c4 = new Client("Name4");

        assertEquals(c1.getName(), DEFAULT_CLIENT_NAME);
        assertTrue(c2.getId() == 2);
        assertEquals(c3.getName(), DEFAULT_CLIENT_NAME);
        assertTrue(c3.getId() == 3);
        assertEquals(c4.getName(), "Name4");
        assertTrue(c4.getId() == 4);
    }

}