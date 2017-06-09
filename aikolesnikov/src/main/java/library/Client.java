package library;

import java.util.Arrays;

/**
 * Client
 */
public class Client {
    public static final String DEFAULT_CLIENT_NAME = "_CLIENT_";
    private static long clientCounter;

    private long id;

    private String name;
    private BookCopy[] readBooks;
    private boolean isBlocked;

    Client() {
        clientCounter++;
        this.id = clientCounter;
        this.name = DEFAULT_CLIENT_NAME;
        readBooks = new BookCopy[]{};
    }
    Client(String name) {
        clientCounter++;
        this.id = clientCounter;
        if (name == null) this.name = DEFAULT_CLIENT_NAME;
        else this.name = name;
        readBooks = new BookCopy[]{};
    }

    public static long getClientCounter() {
        return clientCounter;
    }
    public long getId() {return id;}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public BookCopy[] getReadBooks() {
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
        sb.append(", readBooks=").append(Arrays.toString(readBooks));
        sb.append(", isBlocked=").append(isBlocked);
        sb.append('}');
        return sb.toString();
    }
}
