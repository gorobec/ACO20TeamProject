package data_structures;

import data_structures.exceptions.MyIndexOutOfBoundsException;
import org.junit.Test;

/**
 * Created by gorobec on 21.05.17.
 */
public class MyArrayListTest extends MyListTest{


    @Override
    public void setUp() {
        myList = new MyArrayList();
    }

    @Test(expected = MyIndexOutOfBoundsException.class)
    public void test_get_wrong_index(){
        myList.add("S");
        myList.get(0);
    }
}
