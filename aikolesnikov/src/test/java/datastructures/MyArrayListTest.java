package datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

/**
 * self ArrayList
 */
public class MyArrayListTest {

    private MyArrayList<Object> myArList;

    @Before
    public void setUp() {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6};
        myArList = new MyArrayList<>(array);
    }

    @Test
    public void addObjectIndex() {
        // add with nonexistent index
        assertFalse(myArList.add(88, -1));
        assertFalse(myArList.add(99, 6));

        // add at the end
        assertTrue(myArList.add(100, 5));
        assertEquals(myArList.ar[5], 100);
        assertEquals(myArList.ar[6], 6);
        assertEquals(myArList.size(), 7);

        // add at the start
        assertTrue(myArList.add(200, 0));
        assertEquals(myArList.ar[0], 200);
        assertEquals(myArList.ar[1], 1);
        assertEquals(myArList.size(), 8);

        // add at the middle
        assertTrue(myArList.add(300, 2));
        assertEquals(myArList.ar[2], 300);
        assertEquals(myArList.ar[3], 2);
        assertEquals(myArList.size(), 9);
        // System.out.println(myArList.print() + "; size=" + myArList.size() +
        //        " length=" + myArList.ar.length);
    }

    @Test
    public void getArListObject() {
        assertTrue(myArList.get(-1) == null);
        assertTrue(myArList.get(6) == null);
        assertTrue(myArList.get(5) == myArList.ar[5]);
    }

    @Test
    public void checkSize() {
        assertTrue(myArList.size() == 6);
    }

    @Test
    public void checkAddObject() {
        assertTrue(myArList.add(null));
        assertNull(myArList.ar[6]);
        assertTrue(myArList.add(7));
        assertEquals(myArList.ar[7], 7);
        assertTrue(myArList.size() == 8);
    }

    @Test
    public void checkRemoveObjIndex() {

        // remove nonexistent
        assertNull(myArList.remove(-1));
        assertNull(myArList.remove(6));

        // remove last
        assertEquals(myArList.size(), 6);
        assertEquals(myArList.ar[5], myArList.remove(5));
        assertNull(myArList.ar[5]);
        assertEquals(myArList.ar[4], 5);

        assertEquals(myArList.size(), 5);

        // remove first
        assertEquals(myArList.ar[0], myArList.remove(0));
        assertEquals(myArList.ar[0], 2);
        assertEquals(myArList.size(), 4);

        // remove second
        assertEquals(myArList.ar[1], myArList.remove(1));
        assertEquals(myArList.ar[1], 4);
        assertEquals(myArList.size(), 3);
    }

    @Test
    public void checkRemoveObj() {

        Integer val;

        // remove nonexistent
        val = -1;
        assertFalse(myArList.remove(val));
        val = 7;
        assertFalse(myArList.remove(val));

        // remove last
        val = 6;
        assertEquals(myArList.size(), 6);
        assertTrue(myArList.remove(val));
        assertNull(myArList.ar[5]);
        assertEquals(myArList.ar[4], 5);

        assertEquals(myArList.size(), 5);

        // remove first
        val = 1;
        assertTrue(myArList.remove(val));
        assertEquals(myArList.ar[0], 2);
        assertEquals(myArList.size(), 4);

        // remove second
        val = 3;
        assertTrue(myArList.remove(val));
        assertEquals(myArList.ar[1], 4);
        assertEquals(myArList.size(), 3);

        myArList.ar[1]=null;
        assertTrue(myArList.remove(null));
        assertFalse(myArList.remove(null));
    }

    @Test
    public void checkObjectSet() {
        assertFalse(myArList.set(1, -1));
        assertFalse(myArList.set(1, 6));

        assertTrue(myArList.set(11, 1));
        assertEquals(myArList.ar[1], 11);

    }

    @Test
    public void checkContainsObject() {
        assertFalse(myArList.contains(null));
        assertFalse(myArList.contains(7));
        assertFalse(myArList.contains("sss"));

        assertTrue(myArList.contains(1));
        assertTrue(myArList.contains(3));
        assertTrue(myArList.contains(6));

        assertTrue(myArList.contains(myArList.ar[1]));

        MyArrayList myArList2 = new MyArrayList<>(myArList);
        myArList2.ar[1] = null;
        assertTrue(myArList.contains(null));
        assertFalse(myArList == myArList2);
    }

    @Test
    public void checkClear() {
        myArList.clear();
        assertTrue(myArList.size() == 0);
        assertTrue(myArList.ar[0] == null);
        assertTrue(myArList.ar[myArList.ar.length - 1] == null);
    }

    @Test
    public void checkIsEmpty() {
        assertFalse(myArList.isEmpty());
        myArList.clear();
        assertTrue(myArList.isEmpty());
    }

    @Test
    public void checkIndexOf(){
        assertTrue(myArList.indexOf(-1)==-1);
        assertTrue(myArList.indexOf(7)==-1);
        assertTrue(myArList.indexOf(null)==-1);

        assertTrue(myArList.indexOf(1)==0);
        assertTrue(myArList.indexOf(6)==5);
        assertTrue(myArList.indexOf(3)==2);

        myArList.ar[2]=null;
        assertTrue(myArList.indexOf(null)==2);
    }

    @Test
    public void checkIterator() {
        final StringBuilder sb = new StringBuilder("MyArrayList{");
        for (Iterator i = myArList.iterator(); i.hasNext(); ) {
            sb.append(i.next()).append((';'));
        }
        sb.append('}');

        Assert.assertEquals(sb.toString(),"MyArrayList{1;2;3;4;5;6;}");
    }
    /*    @After
    public void tearDown(){
    }*/

}
