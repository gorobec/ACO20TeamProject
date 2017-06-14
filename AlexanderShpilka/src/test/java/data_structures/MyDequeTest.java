package data_structures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyDequeTest {
    protected MyLinkedList myList;

    @Before
    public void setUp() {
        myList = new MyLinkedList();
    }

    @After
    public void tearDown(){
        myList = null;
    }

    @Test
    public void test_offer_when_empty(){
        assertTrue(myList.offer("One"));
        assertEquals(1, myList.size());
    }

    @Test
    public void test_offer_null_when_empty(){
        assertTrue(myList.offer(null));
        assertEquals(1, myList.size());
    }

    @Test
    public void test_offer_more_than_start_size(){
        assertTrue(myList.offer("One"));
        assertTrue(myList.offer("Two"));
        assertTrue(myList.offer("Three"));
        assertTrue(myList.offer("Four"));
        assertTrue(myList.offer("Five"));
        assertTrue(myList.offer("Six"));
        assertTrue(myList.offer("Seven"));
        assertTrue(myList.offer("Eight"));
        assertTrue(myList.offer("Nine"));
        assertTrue(myList.offer("Ten"));
        assertTrue(myList.offer("Eleven"));
        assertEquals(11, myList.size());
    }

    @Test
    public void test_removeFirst_when_not_empty() {
        assertTrue(myList.offer("One"));
        assertTrue(myList.offer("Two"));
        assertTrue(myList.offer("Three"));
        assertEquals("One", myList.removeFirst());
        assertEquals(2, myList.size());
    }

    @Test
    public void test_removeFirst_when_one_element_only() {
        assertTrue(myList.offer("One"));
        assertEquals("One", myList.removeFirst());
        assertEquals(0, myList.size());
    }

    @Test (expected = NoSuchElementException.class)
    public void test_removeFirst_when_empty() {
        myList.removeFirst();
    }

    @Test
    public void test_remove_when_not_empty() {
        assertTrue(myList.offer("One"));
        assertTrue(myList.offer("Two"));
        assertTrue(myList.offer("Three"));
        assertEquals("One", myList.remove());
        assertEquals(2, myList.size());
    }

    @Test
    public void test_remove_when_one_element_only() {
        assertTrue(myList.offer("One"));
        assertEquals("One", myList.remove());
        assertEquals(0, myList.size());
    }

    @Test
    public void test_removeLast_when_one_element_only() {
        assertTrue(myList.offer("One"));
        assertEquals("One", myList.removeLast());
        assertEquals(0, myList.size());
    }

    @Test
    public void test_removeLast_when_not_empty() {
        assertTrue(myList.offer("One"));
        assertTrue(myList.offer("Two"));
        assertTrue(myList.offer("Three"));
        assertEquals("Three", myList.removeLast());
        assertEquals(2, myList.size());
    }

    @Test (expected = NoSuchElementException.class)
    public void test_removeLast_when_empty() {
        myList.removeLast();
    }

    @Test
    public void test_poll_when_empty() {
        assertEquals(null, myList.poll());
    }

    @Test
    public void test_poll_when_first_element_null() {
        assertTrue(myList.offer(null));
        assertEquals(1, myList.size());
        assertEquals(null, myList.poll());
        assertEquals(0, myList.size());
    }

    @Test
    public void test_poll_when_one_element_only() {
        assertTrue(myList.offer("One"));
        assertEquals(1, myList.size());
        assertEquals("One", myList.poll());
        assertEquals(0, myList.size());
    }

    @Test
    public void test_poll_when_not_empty() {
        assertTrue(myList.offer("One"));
        assertTrue(myList.offer("Two"));
        assertTrue(myList.offer("Three"));
        assertTrue(myList.offer("Four"));
        assertTrue(myList.offer("Five"));
        assertEquals(5, myList.size());
        assertEquals("One", myList.poll());
        assertEquals(4, myList.size());
    }

    @Test
    public void test_addFirst_when_empty() {
        assertEquals(0, myList.size());
        myList.addFirst("One");
        assertEquals(1, myList.size());
        assertEquals("One", myList.get(0));
    }

    @Test
    public void test_addFirst_when_not_empty() {
        assertTrue(myList.offer("One"));
        assertTrue(myList.offer("Two"));
        assertTrue(myList.offer("Three"));
        assertEquals(3, myList.size());
        myList.addFirst("Zero");
        assertEquals(4, myList.size());
        assertEquals("Zero", myList.get(0));
    }

    @Test
    public void test_addLast_when_empty() {
        assertEquals(0, myList.size());
        myList.addLast("Zero");
        assertEquals(1, myList.size());
        assertEquals("Zero", myList.get(0));
    }

    @Test
    public void test_addLast_when_not_empty() {
        assertTrue(myList.offer("One"));
        assertTrue(myList.offer("Two"));
        assertTrue(myList.offer("Three"));
        assertEquals(3, myList.size());
        myList.addLast("Four");
        assertEquals(4, myList.size());
        assertEquals("Four", myList.get(3));
    }

    @Test
    public void test_getFirst_when_one_element_only() {
        assertTrue(myList.offer("One"));
        assertEquals("One", myList.getFirst());
    }

    @Test
    public void test_getFirst_when_several_elements() {
        assertTrue(myList.offer("One"));
        assertTrue(myList.offer("Two"));
        assertTrue(myList.offer("Three"));
        assertEquals("One", myList.getFirst());
    }

    @Test (expected = NoSuchElementException.class)
    public void test_getFirst_when_empty() {
        myList.getFirst();
    }

    @Test
    public void test_getLast_when_one_element_only() {
        assertTrue(myList.offer("One"));
        assertEquals("One", myList.getLast());
    }

    @Test
    public void test_getLast_when_several_elements() {
        assertTrue(myList.offer("One"));
        assertTrue(myList.offer("Two"));
        assertTrue(myList.offer("Three"));
        assertEquals("Three", myList.getLast());
    }

    @Test (expected = NoSuchElementException.class)
    public void test_getLast_when_empty() {
        myList.getLast();
    }

    @Test
    public void test_offerFirst_when_empty() {
        assertEquals(0, myList.size());
        assertTrue(myList.offerFirst("Zero"));
        assertEquals(1, myList.size());
        assertEquals("Zero", myList.getFirst());
    }

    @Test
    public void test_offerFirst_not_empty() {
        assertTrue(myList.offer("One"));
        assertTrue(myList.offer("Two"));
        assertTrue(myList.offer("Three"));
        assertEquals(3, myList.size());
        assertTrue(myList.offerFirst("Zero"));
        assertEquals(4, myList.size());
        assertEquals("Zero", myList.getFirst());
        assertEquals("Three", myList.getLast());
    }

    @Test
    public void test_offerLast_when_empty() {
        assertTrue(myList.offerLast("Last"));
        assertEquals(1, myList.size());
        assertEquals("Last", myList.getLast());
    }

    @Test
    public void test_offerLast_when_not_empty() {
        assertTrue(myList.offer("One"));
        assertTrue(myList.offer("Two"));
        assertTrue(myList.offer("Three"));
        assertEquals(3, myList.size());
        assertTrue(myList.offerLast("Last"));
        assertEquals("Last", myList.getLast());
        assertEquals("Last", myList.get(3));
    }

    @Test
    public void test_peekFirst_when_empty() {
        assertEquals(null, myList.peekFirst());
    }

    @Test
    public void test_peekFirst_when_one_element() {
        assertTrue(myList.offer("One"));
        assertEquals("One", myList.peekFirst());
        assertEquals(1, myList.size());
    }

    @Test
    public void test_peekFirst_when_several_elements() {
        assertTrue(myList.offer("One"));
        assertTrue(myList.offer("Two"));
        assertTrue(myList.offer("Three"));
        assertEquals(3, myList.size());
        assertEquals("One", myList.peekFirst());
        assertEquals(3, myList.size());
    }

    @Test
    public void test_peekFirst_when_everything_is_difficult() {
        assertTrue(myList.offer("One"));
        assertTrue(myList.offer("Two"));
        assertTrue(myList.offer("Three"));
        assertEquals(3, myList.size());
        assertEquals("One", myList.peekFirst());
        assertTrue(myList.offerFirst("Zero"));
        assertEquals("Zero", myList.peekFirst());
        assertEquals(4, myList.size());
    }

    @Test
    public void test_peekLast_when_empty() {
        assertEquals(null, myList.peekLast());
    }

    @Test
    public void test_peekLast_when_one_element() {
        assertTrue(myList.offer("One"));
        assertEquals("One", myList.peekLast());
        assertEquals(1, myList.size());
    }

    @Test
    public void test_peekLast_when_several_elements() {
        assertTrue(myList.offer("One"));
        assertTrue(myList.offer("Two"));
        assertTrue(myList.offer("Three"));
        assertEquals(3, myList.size());
        assertEquals("Three", myList.peekLast());
        assertEquals(3, myList.size());
    }

    @Test
    public void test_peekLast_when_everything_is_difficult() {
        assertTrue(myList.offer("One"));
        assertTrue(myList.offer("Two"));
        assertTrue(myList.offer("Three"));
        assertEquals(3, myList.size());
        assertEquals("Three", myList.peekLast());
        assertTrue(myList.offer("Last"));
        assertEquals("Last", myList.peekLast());
        assertEquals(4, myList.size());
    }

    @Test
    public void test_pollFirst_when_empty() {
        assertEquals(null, myList.pollFirst());
    }

    @Test
    public void test_pollFirst_when_one_element_only() {
        assertTrue(myList.offer("One"));
        assertEquals(1, myList.size());
        assertEquals("One", myList.pollFirst());
        assertEquals(null, myList.pollFirst());
        assertEquals(0, myList.size());
    }

    @Test
    public void test_pollFirst_when_several_elements() {
        assertTrue(myList.offer("One"));
        assertTrue(myList.offer("Two"));
        assertTrue(myList.offer("Three"));
        assertEquals(3, myList.size());
        assertEquals("One", myList.pollFirst());
        assertEquals(2, myList.size());
        assertEquals("Two", myList.pollFirst());
        assertEquals(1, myList.size());
        assertEquals("Three", myList.pollFirst());
        assertEquals(0, myList.size());
    }

    @Test
    public void test_pollLast_when_empty() {
        assertEquals(null, myList.pollLast());
    }

    @Test
    public void test_pollLast_when_one_element_only() {
        assertTrue(myList.offer("One"));
        assertEquals(1, myList.size());
        assertEquals("One", myList.pollLast());
        assertEquals(null, myList.pollLast());
        assertEquals(0, myList.size());
    }

    @Test
    public void test_pollLast_when_several_elements() {
        assertTrue(myList.offer("One"));
        assertTrue(myList.offer("Two"));
        assertTrue(myList.offer("Three"));
        assertEquals(3, myList.size());
        assertEquals("Three", myList.pollLast());
        assertEquals(2, myList.size());
        assertEquals("Two", myList.pollLast());
        assertEquals(1, myList.size());
        assertEquals("One", myList.pollLast());
        assertEquals(0, myList.size());
        assertEquals(null, myList.pollLast());
    }

    @Test
    public void test_element_when_one_element_only() {
        assertTrue(myList.offer("One"));
        assertEquals("One", myList.element());
        assertEquals(1, myList.size());
    }

    @Test
    public void test_element_when_several_elements() {
        assertTrue(myList.offer("One"));
        assertTrue(myList.offer("Two"));
        assertTrue(myList.offer("Three"));
        assertEquals("One", myList.element());
        assertEquals(3, myList.size());
    }

    @Test (expected = NoSuchElementException.class)
    public void test_element_when_empty() {
        myList.element();
    }

    @Test
    public void test_peek_when_empty() {
        assertEquals(null, myList.peek());
    }

    @Test
    public void test_peek_when_one_element_only() {
        assertTrue(myList.offer("One"));
        assertEquals("One", myList.peek());
        assertEquals(1, myList.size());
    }

    @Test
    public void test_peek_when_several_elements() {
        assertTrue(myList.offer("One"));
        assertTrue(myList.offer("Two"));
        assertTrue(myList.offer("Three"));
        assertEquals("One", myList.peek());
        assertEquals(3, myList.size());
    }

    @Test
    public void test_push_when_empty() {
        assertEquals(0, myList.size());
        myList.push("One");
        assertEquals(1, myList.size());
        assertEquals("One", myList.getFirst());
    }

    @Test
    public void test_push_when_not_empty() {
        assertTrue(myList.offer("One"));
        assertTrue(myList.offer("Two"));
        assertTrue(myList.offer("Three"));
        assertEquals(3, myList.size());
        myList.push("Zero");
        assertEquals(4, myList.size());
        assertEquals("Zero", myList.getFirst());
    }

}