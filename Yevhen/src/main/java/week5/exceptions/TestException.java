package week5.exceptions;

import data_structures.MyArrayList;
import data_structures.MyList;
import data_structures.exceptions.MyArrayIndexOutOfBoundsException;
import data_structures.exceptions.MyIndexOutOfBoundsException;

/**
 * Created by gorobec on 10.06.17.
 */
public class TestException {
    public static void main(String[] args) {

        try {
            System.out.println("Inside try");
            throw new Exception();
        } catch (Exception e){
            System.out.println("Inside catch");
        } finally {
            System.out.println("Inside finally");
        }
    }
}
