package utils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gorobec on 04.06.17.
 */
public class ArrayUtilsTest {


    private Object[] array;
    private Object object;

    @Before
    public void setUp(){
        array = new Object[]{1, 2, 3, 4, 5, 6};
    }


    @Test
    public void test_BinarySearch_empty_array(){
        array = new Object[0];

        assertFalse(ArrayUtils.binarySearch(array, object));
    }

    @Test
    public void test_BinarySearch_element_not_present(){

        assertFalse(ArrayUtils.binarySearch(array, 8));
    }

    @Test
    public void test_BinarySearch_element_present(){

        assertTrue(ArrayUtils.binarySearch(array, 3));
    }

    @Test
    public void test_BinarySearch_element_present_first(){

        assertTrue(ArrayUtils.binarySearch(array, 1));
    }

    @Test
    public void test_BinarySearch_element_present_last(){

        assertTrue(ArrayUtils.binarySearch(array, 6));
    }
    @Test
    public void test_BinarySearch_element_present_array_one_cell(){

        array = new Object[]{6};

        assertTrue(ArrayUtils.binarySearch(array, 6));
    }

    @Test (expected = NullPointerException.class)
    public void test_BinarySearch_null_array(){

        ArrayUtils.binarySearch(null, object);
    }


    @Test (expected = NullPointerException.class)
    public void test_BinarySearch_null_object(){
        array = new Object[]{1, 2, 3};
        assertFalse(ArrayUtils.binarySearch(array, null));
    }


}
