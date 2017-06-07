package data_structure;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by macbook on 07.06.17.
 */
public abstract class MyDequeTest {
    protected MyLinkedList myList;
    @Before
    public abstract void setUp();

    @Test
    public void addFirst_getFirst(){
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
        myList.addFirst("Eleven");
        assertEquals(11, myList.size());
        assertEquals("Eleven", myList.getFirst());

    }
    @Test
    public void addFirst_getFirst_null(){
        assertTrue(myList.add("Nine"));
        assertTrue(myList.add("Ten"));
        myList.addFirst(null);
        assertEquals(3, myList.size());
        assertNull(myList.getFirst());

    }
    @Test
    public void addFirst_getFirst_empty(){
        myList.addFirst("First");
        assertEquals(1, myList.size());
        assertEquals("First", myList.getFirst());

    }
    @Test
    public void addLast_getLast(){
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
        myList.addLast("Eleven");
        assertEquals(11, myList.size());
        assertEquals("Eleven", myList.getLast());

    }
    @Test
    public void addLast_getLast_null(){
        assertTrue(myList.add("Nine"));
        assertTrue(myList.add("Ten"));
        myList.addLast(null);
        assertEquals(3, myList.size());
        assertNull(myList.getLast());

    }
    @Test
    public void offerFirst_peekFirst_empty(){
        assertTrue(myList.offerFirst("First"));
        assertEquals(1, myList.size());
        assertEquals("First", myList.peekFirst());

    }
    @Test
    public void offerLast_peekLast_empty(){
        assertTrue(myList.offerLast("First"));
        assertEquals(1, myList.size());
        assertEquals("First", myList.peekLast());

    }

    @Test
    public void offerFirst_peekFirst_null(){
        assertTrue(myList.add("Nine"));
        assertTrue(myList.add("Ten"));
        myList.offerFirst(null);
        assertEquals(3, myList.size());
        assertNull(myList.peekFirst());

    }

    @Test
    public void offerLast_peekLast_null(){
        assertTrue(myList.add("Nine"));
        assertTrue(myList.add("Ten"));
        myList.offerLast(null);
        assertEquals(3, myList.size());
        assertNull(myList.peekLast());

    }

    @Test
    public void pollFirst(){
        assertTrue(myList.add("Nine"));
        assertTrue(myList.add("Ten"));
        assertEquals("Nine", myList.pollFirst());
        assertEquals(1, myList.size());
    }
    @Test
    public void pollLast(){
        assertTrue(myList.add("Nine"));
        assertTrue(myList.add("Ten"));
        assertEquals("Ten", myList.pollLast());
        assertEquals(1, myList.size());
    }
    @Test
    public void pollFirst_empty(){
        assertNull(myList.pollFirst());
    }

    @Test
    public void pollLast_empty() {
        assertNull(myList.pollLast());
    }
    @Test
    public void removeFirst(){
        assertTrue(myList.add("Nine"));
        assertTrue(myList.add("Ten"));
        assertEquals("Nine", myList.removeFirst());
        assertEquals(1, myList.size());
    }
    @Test
    public void removeLast(){
        assertTrue(myList.add("Nine"));
        assertTrue(myList.add("Ten"));
        assertEquals("Ten", myList.removeLast());
        assertEquals(1, myList.size());
    }
    @Test
    public void removeFirst_empty(){
        assertNull(myList.removeFirst());
    }

    @Test
    public void removeLast_empty() {
        assertNull(myList.removeLast());
    }



    @Test
    public void push(){
    }


}