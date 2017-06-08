package utils;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayUtilsTest {
   private String[] array;
    private static Comparator<String> comparator;


    @BeforeClass
    public static void setComparator(){
        comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };
    }

    @Before
    public void setUp() {
        array = new String[10];
        array[0] = "One";
        array[1] = "Two";
        array[2] = "Three";
        array[3] = "Four";
        array[4] = "Five";
        array[5] = "Six";
        array[6] = "Seven";
        array[7] = "Eight";
        array[8] = "Nine";
        array[9] = "Ten";
        Arrays.sort(array);

    }

    @After
    public void tearDown() {
        array = null;
    }

    @Test
    public void test_binarySearch_when_present_at_the_beginning() {

        assertTrue(ArrayUtils.binarySearch(array, "Eight"));
    }

    @Test
    public void test_binarySearch_when_present_at_the_end() {
        assertTrue(ArrayUtils.binarySearch(array, "Two"));
    }

    @Test
    public void test_binarySearch_when_present_in_the_middle() {
        assertTrue(ArrayUtils.binarySearch(array, "One"));
    }

    @Test
    public void test_binarySearch_when_not_present() {
        assertFalse(ArrayUtils.binarySearch(array, "Fifty"));
    }

    @Test
    public void test_binarySearch_when_same_elements() {
        assertTrue(ArrayUtils.binarySearch(array, "Two"));
    }

    @Test
    public void test_binarySearch_when_present_at_the_beginning_with_comparator() {

        assertTrue(ArrayUtils.binarySearch(array, "Eight", comparator));
    }

    @Test
    public void test_binarySearch_when_present_at_the_end_with_comparator() {
        assertTrue(ArrayUtils.binarySearch(array, "Two", comparator));
    }

    @Test
    public void test_binarySearch_when_present_in_the_middle_with_comparator() {
        assertTrue(ArrayUtils.binarySearch(array, "One", comparator));
    }

    @Test
    public void test_binarySearch_when_not_present_with_comparator() {
        assertFalse(ArrayUtils.binarySearch(array, "Fifty", comparator));
    }

    @Test
    public void test_binarySearch_when_same_elements_with_comparator() {
        assertTrue(ArrayUtils.binarySearch(array, "Two", comparator));
    }
}
