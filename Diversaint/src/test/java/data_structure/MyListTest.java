package data_structure;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by macbook on 06.06.17.
 */
public abstract class MyListTest {

    protected MyList<String> myList;

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
        assertTrue(myList.add("Fours"));
        assertTrue(myList.add("Five"));
        assertTrue(myList.add("Six"));
        assertTrue(myList.add("Seven"));
        assertTrue(myList.add("Eight"));
        assertTrue(myList.add("Nine"));
        assertTrue(myList.add("Ten"));
        assertTrue(myList.add("Eleven"));
    }

    //test isEmpty
    @Test
    public void test_isEmpty_when_empty(){
        assertTrue(myList.isEmpty());
    }
    //test size
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
        assertTrue(myList.add("Elevens"));
        assertEquals(11, myList.size());
    }

    @Test
    public void test_size_when_remove_one_element(){
        assertTrue(myList.add("One"));
        assertEquals(1, myList.size());
        assertTrue(myList.remove("One"));
        assertEquals(0, myList.size());
    }

    // tests for remove by object
    @Test(expected = NoSuchElementException.class)
    public void test_remove_obj_when_empty(){
        assertFalse(myList.remove("One"));
    }

    @Test(expected = NoSuchElementException.class)
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

    @Test(expected = NoSuchElementException.class)
    public void test_remove_null_when_empty(){
        assertFalse(myList.remove(null));
    }

    @Test(expected = NoSuchElementException.class)
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

    // tests for contains

    @Test
    public void test_contains_null_when_empty(){
        assertFalse(myList.contains(null));
    }

    @Test
    public void test_contains_null_when_not_empty(){
        assertTrue(myList.add("One"));
        assertFalse(myList.contains(null));
    }

    @Test
    public void test_contains_null_when_contains_null(){
        assertTrue(myList.add("One"));
        assertTrue(myList.add(null));
        assertTrue(myList.add("Two"));
        assertTrue(myList.contains(null));
    }

    @Test
    public void test_contains_when_el_in_list(){
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Two"));
        assertTrue(myList.add("Three"));
        assertTrue(myList.contains("Two"));
    }
    @Test
    public void test_contains_when_no_el_in_list(){
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Two"));
        assertTrue(myList.add("Three"));
        assertFalse(myList.contains("oops"));
    }

    //tests for clear

    @Test
    public void test_clear_list(){
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Two"));
        assertTrue(myList.add("Three"));
        myList.clear();
        assertTrue(myList.isEmpty());
    }

    //test add object in position

    @Test (expected = IndexOutOfBoundsException.class)
    public void test_add_in_position_more_than_size(){
        assertTrue(myList.add("One"));
        assertFalse(myList.add("Two", 2));
    }

    @Test
    public void test_add_into_list_null(){
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Two"));
        assertTrue(myList.add("Three"));
        assertTrue(myList.add("Four"));
        assertTrue(myList.add("Five"));
        assertTrue(myList.add("Six"));
        assertTrue(myList.add("Seven"));
        assertTrue(myList.add("Eight"));
        assertTrue(myList.add("Nine"));
        assertTrue(myList.add(null, 4));
    }
    @Test
    public void test_add_into_list_when_size_like_length(){
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
        assertTrue(myList.add("Between three and four", 3));
    }


    @Test
    public void test_add_object_in_correct_pos(){
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
        assertTrue(myList.add("Between 5 and 6", 4));

    }

    //test get o by position

    @Test(expected = IndexOutOfBoundsException.class)
    public void test_get_invalid_position(){
        assertTrue(myList.add("One"));
        assertNull(myList.get(2));
    }

    @Test
    public void test_get_null(){
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Two"));
        assertTrue(myList.add(null));
        assertTrue(myList.add("Four"));
        assertNull(myList.get(2));
    }
    @Test
    public void test_get_o_in_list(){
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Two"));
        assertTrue(myList.add("Three"));
        assertTrue(myList.add("Four"));
        assertNotNull(myList.get(2));
    }

    //remove o by position

    @Test(expected = IndexOutOfBoundsException.class)
    public void test_remove_invalid_position(){
        assertTrue(myList.add("One"));
        assertNull(myList.remove(2));
    }

    @Test
    public void test_remove_null(){
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Two"));
        assertTrue(myList.add(null));
        assertTrue(myList.add("Four"));
        assertNull(myList.remove(2));
    }
    @Test
    public void test_remove_o_in_list(){
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Two"));
        assertTrue(myList.add("Three"));
        assertTrue(myList.add("Four"));
        assertNotNull(myList.remove(2));
    }
    @Test
    public void test_remove_when_list_full(){
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
        assertNotNull(myList.remove(2));
    }

    //set in position

    @Test(expected = IndexOutOfBoundsException.class)
    public void test_set_invalid_position(){
        assertTrue(myList.add("One"));
        assertFalse(myList.set("Two", 2));
    }

    @Test
    public void test_set_o_in_list(){
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Two"));
        assertTrue(myList.add("Three"));
        assertTrue(myList.add("Four"));
        assertTrue(myList.set("2", 2));
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void test_set_in_last_when_list_full(){
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
        assertFalse(myList.set("Ten", 10));
    }

    @Test
    public void test_iterator_when_empty(){
        Iterator iterator = myList.iterator();
        assertFalse(iterator.hasNext());
    }
    @Test
    public void test_iterator(){
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Two"));
        assertTrue(myList.add("Three"));
        Iterator iterator = myList.iterator();
        assertTrue(iterator.hasNext());
        iterator.next();
        assertTrue(iterator.hasNext());
        iterator.next();
        assertTrue(iterator.hasNext());
        iterator.next();
        assertFalse(iterator.hasNext());

    }


}
