package utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

/**
 * Created by macbook on 13.06.17.
 */
public class ArrayUtilsTest {
    private String[] array;
    private String[] arrayEmpty;
    private String[] sortedArray;
    private Comparator<String> comparator;
    @Before
    public void setUp() throws Exception {
        array = new String[10];
        array[8] = "1";
        array[2] = "2";
        array[1] = "3";
        array[7] = "4";
        array[4] = "5";
        array[9] = "6";
        array[6] = "7";
        array[3] = "8";
        array[0] = "9";
        array[5] = "99";
        arrayEmpty = new String[]{};
        sortedArray = new String[]{ "1", "2", "3", "4", "5",
                                    "6", "7", "8", "9", "99"};
        comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
    }


    @After
    public void tearDown() throws Exception {
        array = null;
        arrayEmpty = null;
    }

    @Test
    public void test_bubbleSort_empty() throws Exception {
        ArrayUtils.bubbleSort(arrayEmpty);
        assertEquals(0, arrayEmpty.length);
    }
    @Test
    public void test_bubbleSort() throws Exception {
        ArrayUtils.bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            assertEquals(array[i], sortedArray[i]);
        }
    }
    @Test
    public void test_selSort_empty() throws Exception {
        ArrayUtils.selectionSort(arrayEmpty);
        assertEquals(0, arrayEmpty.length);
    }
    @Test
    public void test_selSort() throws Exception {
        ArrayUtils.selectionSort(array);
        for (int i = 0; i < array.length; i++) {
            assertEquals(array[i], sortedArray[i]);
        }
    }
    @Test
    public void test_insSort_empty() throws Exception {
        ArrayUtils.insertSort(arrayEmpty);
        assertEquals(0, arrayEmpty.length);
    }
    @Test
    public void test_insSort() throws Exception {
        ArrayUtils.insertSort(array);
        for (int i = 0; i < array.length; i++) {
            assertEquals(array[i], sortedArray[i]);
        }
    }

    @Test (expected = NullPointerException.class)
    public void test_binarySearch_null_array(){
        ArrayUtils.binarySearch(null, " ");
    }
    @Test (expected = NullPointerException.class)
    public void test_binarySearch_null_object(){
        ArrayUtils.binarySearch(new String[2], null);
    }

    @Test
    public void test_binarySearch_empty_array(){
        assertFalse(ArrayUtils.binarySearch(new String[0], " "));
    }
    @Test
    public void test_binarySearch_el_notpresent(){
        assertFalse(ArrayUtils.binarySearch(sortedArray, " "));
    }
    @Test
    public void test_binarySearch_firs_el_present(){
        assertTrue(ArrayUtils.binarySearch(sortedArray, "1"));
    }
    @Test
    public void test_binarySearch_last_el_present(){
        assertTrue(ArrayUtils.binarySearch(sortedArray, "99"));
    }
    @Test
    public void test_binarySearch_midle_el_present(){
        assertTrue(ArrayUtils.binarySearch(sortedArray, "6"));
    }
    @Test
    public void test_binarySearch(){
        assertTrue(ArrayUtils.binarySearch(sortedArray, "7"));
    }

    @Test
    public void test_binarySearch_first_el_with_comparator() {

        assertTrue(ArrayUtils.binarySearch(sortedArray, "1", comparator));
    }

    @Test
    public void test_binarySearch_last_el_with_comparator() {
        assertTrue(ArrayUtils.binarySearch(sortedArray, "99", comparator));
    }

    @Test
    public void test_binarySearch_middle_el_with_comparator() {
        assertTrue(ArrayUtils.binarySearch(sortedArray, "6", comparator));
    }

    @Test
    public void test_binarySearch_el_notpresent_with_comparator() {
        assertFalse(ArrayUtils.binarySearch(sortedArray, " ", comparator));
    }

    @Test
    public void test_binarySearch_with_comparator() {
        assertTrue(ArrayUtils.binarySearch(sortedArray, "7", comparator));
    }


}