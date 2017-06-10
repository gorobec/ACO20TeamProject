package utils;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SortTest {
    private String[] array;

    @After
    public void tearDown() {
        array = null;
    }

    // one element tests
    @Test
    public void test_bubbleSort_one_element() {
        array = new String[] {"Apple"};
        Sort.bubbleSort(array);
        assertEquals("Apple", array[0]);
    }

    @Test
    public void test_selectionSort_one_element() {
        array = new String[] {"Apple"};
        Sort.selectionSort(array);
        assertEquals("Apple", array[0]);
    }

    @Test
    public void test_insertionSort_one_element() {
        array = new String[] {"Apple"};
        Sort.insertionSort(array);
        assertEquals("Apple", array[0]);
    }

    // two elements tests
    @Test
    public void test_bubbleSort_two_elements() {
        array = new String[] {"Microsoft", "Apple"};
        Sort.bubbleSort(array);
        assertEquals("Apple", array[0]);
        assertEquals("Microsoft", array[1]);
    }

    @Test
    public void test_selectionSort_two_elements() {
        array = new String[] {"Microsoft", "Apple"};
        Sort.selectionSort(array);
        assertEquals("Apple", array[0]);
        assertEquals("Microsoft", array[1]);
    }

    @Test
    public void test_insertionSort_two_elements() {
        array = new String[] {"Microsoft", "Apple"};
        Sort.insertionSort(array);
        assertEquals("Apple", array[0]);
        assertEquals("Microsoft", array[1]);
    }

    // several elements tests
    @Test
    public void test_bubbleSort_five_elements() {
        array = new String[] {"One", "Two", "Three", "Four", "Five"};
        Sort.bubbleSort(array);
        assertEquals("Five", array[0]);
        assertEquals("Four", array[1]);
        assertEquals("One", array[2]);
        assertEquals("Three", array[3]);
        assertEquals("Two", array[4]);
    }

    @Test
    public void test_selectionSort_five_elements() {
        array = new String[] {"One", "Two", "Three", "Four", "Five"};
        Sort.selectionSort(array);
        assertEquals("Five", array[0]);
        assertEquals("Four", array[1]);
        assertEquals("One", array[2]);
        assertEquals("Three", array[3]);
        assertEquals("Two", array[4]);
    }

    @Test
    public void test_insertionSort_five_elements() {
        array = new String[] {"One", "Two", "Three", "Four", "Five"};
        Sort.insertionSort(array);
        assertEquals("Five", array[0]);
        assertEquals("Four", array[1]);
        assertEquals("One", array[2]);
        assertEquals("Three", array[3]);
        assertEquals("Two", array[4]);
    }
}
