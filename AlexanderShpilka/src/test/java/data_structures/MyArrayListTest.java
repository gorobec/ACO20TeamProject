package data_structures;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyArrayListTest extends MyListTest {
    @Override
    public void setUp(){
        myList = new MyArrayList();
    }

}
