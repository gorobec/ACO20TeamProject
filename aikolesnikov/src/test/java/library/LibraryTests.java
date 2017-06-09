package library;

import datastructures.MyArrayList;
import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

/**
 *
 */
public class LibraryTests {

    @Test
    public void checkLibrary() {
        Library lib = new Library();

        lib.getClients().clear();

        Client c1 = new Client();
        Client c2 = new Client();
        Client c3 = new Client(null);
        Client c4 = new Client("Name4");

        lib.getClients().add(c1);
        lib.getClients().add(c2);
        lib.getClients().add(c3);
        lib.getClients().add(c4);

        Assert.assertEquals(((Client) lib.getClients().get(0)).getName(),"_CLIENT_");
        Assert.assertEquals(((Client) lib.getClients().get(1)).getName(),"_CLIENT_");
        Assert.assertEquals(((Client) lib.getClients().get(1)).getId(),2);
        Assert.assertEquals(((Client) lib.getClients().get(2)).getName(),"_CLIENT_");
        Assert.assertEquals(((Client) lib.getClients().get(2)).getId(),3);
        Assert.assertEquals(((Client) lib.getClients().get(3)).getName(),"Name4");
        Assert.assertEquals(((Client) lib.getClients().get(3)).getId(),4);

        // System.out.println(Client.getClientCounter());
        // System.out.println(lib.printListOfClients());
    }
}
