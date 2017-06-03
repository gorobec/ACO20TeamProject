package data_structures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by gorobec on 27.05.17.
 */
public abstract class MyListTest {
    protected MyList myList;

    @Before
    public abstract void setUp();

    @After
    public void tearDown(){
        myList = null;
    }

    @Test
    public void test_add_when_empty(){
        assertTrue(myList.add("One"));
    }

    @Test
    public void test_add_null_when_empty(){
        assertTrue(myList.add(null));
    }


    @Test
    public void test_add_more_than_start_size(){
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Two"));
        assertTrue(myList.add("Three"));
        assertTrue(myList.add("Four"));
        assertTrue(myList.add("Five"));
        assertTrue(myList.add("Six"));
        assertTrue(myList.add("Seven"));
        assertTrue(myList.add("Eight"));
        assertTrue(myList.add("Nine"));
        assertTrue(myList.add("Ten"));
        assertTrue(myList.add("Eleven"));
    }

    @Test
    public void test_isEmpty_when_empty(){
        assertTrue(myList.isEmpty());
    }

    @Test
    public void test_isEmpty_when_add_one_element(){
        assertTrue(myList.add("One"));
        assertFalse(myList.isEmpty());

    }

    @Test
    public void test_size_when_empty(){
        assertEquals(0, myList.size());
    }

    @Test
    public void test_size_when_add_one_element(){
        assertTrue(myList.add("One"));
        assertEquals(1, myList.size());
    }


    @Test
    public void test_size_more_than_start_size(){
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Two"));
        assertTrue(myList.add("Three"));
        assertTrue(myList.add("Four"));
        assertTrue(myList.add("Five"));
        assertTrue(myList.add("Six"));
        assertTrue(myList.add("Seven"));
        assertTrue(myList.add("Eight"));
        assertTrue(myList.add("Nine"));
        assertTrue(myList.add("Ten"));
        assertTrue(myList.add("Eleven"));

        assertEquals(11, myList.size());
    }

    @Test
    public void test_size_when_remove_one_element(){
        assertTrue(myList.add("One"));
        assertEquals(1, myList.size());
        assertTrue(myList.remove("One"));
        assertEquals(0, myList.size());
    }


    @Test
    public void test_remove_obj_when_empty(){
        assertFalse(myList.remove("One"));
    }

    @Test
    public void test_remove_obj_when_not_empty_and_element_not_present(){
        assertTrue(myList.add("Five"));
        assertTrue(myList.add("Six"));
        assertTrue(myList.add("Seven"));
        assertFalse(myList.remove("One"));
    }

    @Test
    public void test_remove_obj_when_not_empty_and_element_present(){
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Six"));
        assertTrue(myList.add("Seven"));
        assertTrue(myList.remove("One"));
    }

    @Test
    public void test_remove_obj_when_not_empty_and_element_present_in_last_position(){
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Six"));
        assertTrue(myList.add("Seven"));
        assertTrue(myList.remove("Seven"));
    }

    @Test
    public void test_remove_null_when_empty(){
        assertFalse(myList.remove(null));
    }

    @Test
    public void test_remove_null_when_not_empty_and_element_not_present(){
        assertTrue(myList.add("Five"));
        assertTrue(myList.add("Six"));
        assertTrue(myList.add("Seven"));
        assertFalse(myList.remove(null));
    }

    @Test
    public void test_remove_null_when_not_empty_and_element_present(){
        assertTrue(myList.add(null));
        assertTrue(myList.add("Six"));
        assertTrue(myList.add("Seven"));
        assertTrue(myList.remove(null));
    }

}
