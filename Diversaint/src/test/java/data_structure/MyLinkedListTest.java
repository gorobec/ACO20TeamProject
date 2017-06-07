package data_structure;

/**
 * Created by macbook on 06.06.17.
 */
public class MyLinkedListTest<T> extends MyListTest<T>{
    @Override
    public void setUp() {
        myList = new MyLinkedList<T>();
    }
}
