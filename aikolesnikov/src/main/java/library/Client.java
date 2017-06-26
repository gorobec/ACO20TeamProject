package library;

import datastructures.MyArrayList;

import java.util.Arrays;
import java.util.Comparator;

import static library.LIB_SETTINGS.*;

/**
 * Client
 */
public class Client {

    private static long clientCounter;
    private long id;
    private String name;
    private MyArrayList readBooks;
    private boolean isBlocked;

    Client() {
        clientCounter++;
        this.id = clientCounter;
        this.name = DEFAULT_CLIENT_NAME;
        readBooks = new MyArrayList(BOOK_RENT_LIMIT);
    }

    Client(String name) {
        this.id = ++clientCounter;
        if (name == null) this.name = DEFAULT_CLIENT_NAME;
        else this.name = name;
        readBooks = new MyArrayList(BOOK_RENT_LIMIT);
    }

    public static long getClientCounter() {
        return clientCounter;
    }

    public static void setClientCounter(long clientCounter) {
        Client.clientCounter = clientCounter;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyArrayList getReadBooks() {
        return readBooks;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", readBooks=");
        for (int i = 0; i < readBooks.size(); i++) {
            sb.append(readBooks.get(i)).toString();
            sb.append(';');
        }
        sb.append(", isBlocked=").append(isBlocked);
        sb.append('}');
        return sb.toString();
    }

}
