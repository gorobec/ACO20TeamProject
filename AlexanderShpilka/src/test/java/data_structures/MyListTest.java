package data_structures;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
    public void test_contains_when_element_is_present() {
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Two"));
        assertTrue(myList.add("Three"));
        assertTrue(myList.add("Four"));
        assertTrue(myList.add("Five"));
        assertTrue(myList.contains("Three"));
    }

    @Test
    public void test_contains_when_element_is_not_present() {
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Two"));
        assertTrue(myList.add("Four"));
        assertTrue(myList.add("Five"));
        assertFalse(myList.contains("Three"));
    }

    @Test
    public void test_contains_when_element_is_null() {
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Two"));
        assertTrue(myList.add(null));
        assertTrue(myList.add("Four"));
        assertTrue(myList.contains(null));
    }

    @Test
    public void test_contains_when_element_is_null_not_present() {
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Two"));
        assertTrue(myList.add("Four"));
        assertFalse(myList.contains(null));
    }

    @Test
    public void test_clear_when_is_not_empty() {
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Two"));
        assertTrue(myList.add("Three"));
        assertTrue(myList.add("Four"));
        assertTrue(myList.add("Five"));
        assertEquals(5, myList.size());
        myList.clear();
        assertEquals(0, myList.size());
        assertFalse(myList.contains("Two"));
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

    @Test
    public void test_remove_by_index_when_not_empty_wrong_index() {
        assertTrue(myList.add("Five"));
        assertTrue(myList.add("Six"));
        assertTrue(myList.add("Seven"));
        assertEquals(null, myList.remove(3));
    }

    @Test
    public void test_remove_by_index_when_not_empty_right_index() {
        assertTrue(myList.add("Five"));
        assertTrue(myList.add("Six"));
        assertTrue(myList.add("Seven"));
        assertEquals("Six", myList.remove(1));
        assertEquals("Seven", myList.get(1));
    }

    @Test
    public void test_remove_by_index_when_is_empty() {
        assertEquals(null, myList.remove(0));
    }

    @Test
    public void test_remove_by_index_first_element_not_empty() {
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
        assertEquals("One", myList.remove(0));
        assertEquals("Ten", myList.get(8));
        assertEquals(null, myList.get(9));
    }

    @Test
    public void test_remove_by_index_last_element_not_empty() {
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Two"));
        assertTrue(myList.add("Three"));
        assertTrue(myList.add("Four"));
        assertTrue(myList.add("Five"));
        assertEquals("Five", myList.remove(4));
        assertEquals(null, myList.remove(4));
    }

    @Test
    public void test_set_when_empty() {
        assertFalse(myList.set("One", 0));
    }

    @Test
    public void test_set_when_not_empty_wrong_index() {
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Two"));
        assertTrue(myList.add("Three"));
        assertTrue(myList.add("Four"));
        assertFalse(myList.set("Five", 4));
    }

    @Test
    public void test_set_when_not_empty_correct_index() {
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Two"));
        assertTrue(myList.add("Three"));
        assertTrue(myList.add("Five"));
        assertTrue(myList.set("Four", 3));
    }

    @Test
    public void test_add_by_index_when_empty_index_zero() {
        assertTrue(myList.add("One", 0));
        assertEquals("One", myList.get(0));
    }

    @Test
    public void test_add_by_index_when_empty_index_one() {
        assertFalse(myList.add("One", 1));
    }

    @Test
    public void test_add_by_index_when_not_empty_wrong_index() {
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Two"));
        assertTrue(myList.add("Three"));
        assertFalse(myList.add("Four", 4));
    }

    @Test
    public void test_add_by_index_when_not_empty_index_zero() {
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Two"));
        assertTrue(myList.add("Three"));
        assertTrue(myList.add("Zero", 0));
        assertEquals("Zero", myList.get(0));
        assertEquals("Three", myList.get(3));
    }

    @Test
    public void test_add_by_index_when_not_empty_index_middle() {
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Two"));
        assertTrue(myList.add("Three"));
        assertTrue(myList.add("Five"));
        assertTrue(myList.add("Six"));
        assertTrue(myList.add("Four", 3));
        assertEquals("Four", myList.get(3));
    }

    @Test
    public void test_add_by_index_when_not_empty_after_last_element() {
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Two"));
        assertTrue(myList.add("Three"));
        assertTrue(myList.add("Four"));
        assertTrue(myList.add("Five"));
        assertTrue(myList.add("Six", 5));
        assertEquals("Six", myList.get(5));
    }

    @Test
    public void test_iterator_when_empty() {
        Iterator myIterator = myList.iterator();
        assertFalse(myIterator.hasNext());
    }

    @Test
    public void test_iterator_when_not_empty() {
        assertTrue(myList.add("One"));
        assertTrue(myList.add("Two"));
        assertTrue(myList.add("Three"));
        Iterator myIterator = myList.iterator();
        assertTrue(myIterator.hasNext());
        assertEquals("One", myIterator.next());
        assertTrue(myIterator.hasNext());
        assertEquals("Two", myIterator.next());
        assertTrue(myIterator.hasNext());
        assertEquals("Three", myIterator.next());
        assertFalse(myIterator.hasNext());
    }


}
