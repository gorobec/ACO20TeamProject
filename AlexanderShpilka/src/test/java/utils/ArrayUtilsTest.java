package utils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayUtilsTest {
    String[] array;

    @Before
    public void setUp() {
        array = new String[10];
    }

    @After
    public void tearDown() {
        array = null;
    }

    @Test
    public void test_binarySearch_when_present_at_the_beginning() {
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
        assertTrue(ArrayUtils.binarySearch(array, "Eight"));
    }

    @Test
    public void test_binarySearch_when_present_at_the_end() {
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
        assertTrue(ArrayUtils.binarySearch(array, "Two"));
    }

    @Test
    public void test_binarySearch_when_present_in_the_middle() {
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
        assertTrue(ArrayUtils.binarySearch(array, "One"));
    }

    @Test
    public void test_binarySearch_when_not_present() {
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
        assertFalse(ArrayUtils.binarySearch(array, "Fifty"));
    }

    @Test
    public void test_binarySearch_when_same_elements() {
        array[0] = "One";
        array[1] = "Two";
        array[2] = "Three";
        array[3] = "One";
        array[4] = "Two";
        array[5] = "Three";
        array[6] = "One";
        array[7] = "Two";
        array[8] = "Three";
        array[9] = "One";
        Arrays.sort(array);
        assertTrue(ArrayUtils.binarySearch(array, "Two"));
    }
}
