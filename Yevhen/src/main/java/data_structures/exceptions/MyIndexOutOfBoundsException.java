package data_structures.exceptions;

/**
 * Created by gorobec on 10.06.17.
 */
public class MyIndexOutOfBoundsException extends RuntimeException {

    public MyIndexOutOfBoundsException() {
    }

    public MyIndexOutOfBoundsException(String message) {
        super(message);
    }
}
