package utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by macbook on 13.06.17.
 */
public class ArrayUtilsTest {
    protected String[] array;
    protected String[] arrayEmpty;
    protected String[] sortedArray;
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

}