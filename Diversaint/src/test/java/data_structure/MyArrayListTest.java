package data_structure;

/**
 * Created by macbook on 25.05.17.
 */
public class MyArrayListTest<T> extends MyListTest<T> {

    @Override
    public void setUp() {
        myList = new MyArrayList();
    }
}
