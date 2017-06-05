package datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

/**
 * self ArrayList
 */
public class MyArrayListTest {

    private Object[] array;
    private Object object;
    private MyArrayList myArList;

    @Before
    public void setUp() {
        array = new Object[]{1, 2, 3, 4, 5, 6};
        myArList = new MyArrayList(array);
    }


    @Test
    public void addObjectIndex() {
        // add with nonexistent index
        assertFalse(myArList.add(88, -1));
        assertFalse(myArList.add(99, 6));

        // add at the end
        assertTrue(myArList.add(100, 5));
        assertEquals(myArList.getAr()[5], 100);
        assertEquals(myArList.getAr()[6], 6);
        assertEquals(myArList.size(), 7);

        // add at the start
        assertTrue(myArList.add(200, 0));
        assertEquals(myArList.getAr()[0], 200);
        assertEquals(myArList.getAr()[1], 1);
        assertEquals(myArList.size(), 8);

        // add at the middle
        assertTrue(myArList.add(300, 2));
        assertEquals(myArList.getAr()[2], 300);
        assertEquals(myArList.getAr()[3], 2);
        assertEquals(myArList.size(), 9);
        // System.out.println(myArList.print() + "; size=" + myArList.size() +
        //        " length=" + myArList.getAr().length);
    }

    @Test
    public void getArListObject() {
        assertTrue(myArList.get(-1) == null);
        assertTrue(myArList.get(6) == null);
        assertTrue(myArList.get(5) == myArList.getAr()[5]);
    }

    @Test
    public void checkSize() {
        assertTrue(myArList.size() == 6);
    }

    @Test
    public void checkAddObject() {
        assertTrue(myArList.add(null));
        assertNull(myArList.getAr()[6]);
        assertTrue(myArList.add(7));
        assertEquals(myArList.getAr()[7], 7);
        assertTrue(myArList.size() == 8);
    }

    @Test
    public void checkRemoveObjIndex() {

        // remove nonexistent
        assertNull(myArList.remove(-1));
        assertNull(myArList.remove(6));

        // remove last
        assertEquals(myArList.size(), 6);
        assertEquals(myArList.getAr()[5], myArList.remove(5));
        assertNull(myArList.getAr()[5]);
        assertEquals(myArList.getAr()[4], 5);

        assertEquals(myArList.size(), 5);

        // remove first
        assertEquals(myArList.getAr()[0], myArList.remove(0));
        assertEquals(myArList.getAr()[0], 2);
        assertEquals(myArList.size(), 4);

        // remove second
        assertEquals(myArList.getAr()[1], myArList.remove(1));
        assertEquals(myArList.getAr()[1], 4);
        assertEquals(myArList.size(), 3);
    }

    @Test
    public void checkObjectSet() {
        assertFalse(myArList.set(1, -1));
        assertFalse(myArList.set(1, 6));

        assertTrue(myArList.set(11, 1));
        assertEquals(myArList.getAr()[1], 11);

    }

/*    @After
    public void tearDown(){
    }*/

}
