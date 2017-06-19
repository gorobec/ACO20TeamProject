package datastructures;

import org.junit.Assert;
import org.junit.Test;
import datastructures.MyLinkedList.Pointer;

import java.util.Iterator;

/**
 * checking of parametrized LinkedList
 */
public class MyLinkedListTest {
    @Test
    public void addContainsRemoveClearItems() {
        MyLinkedList<String> ll = new MyLinkedList<>();
        ll.add("AAA");
        ll.add("BBB");

        Assert.assertEquals(ll.size(), 2);
        Assert.assertTrue(ll.contains("AAA"));

        ll.clear();
        Assert.assertTrue(ll.size() == 0);
        Assert.assertFalse(ll.contains("AAA"));

        ll.add("AAA2");
        ll.add("BBB2");
        Assert.assertTrue(ll.size() == 2);
        Assert.assertTrue(ll.contains("AAA2"));

        Assert.assertFalse(ll.remove(null));
        ll.remove("CCC");
        Assert.assertTrue(ll.size() == 2);
        Assert.assertFalse(ll.contains("CCC"));

        Assert.assertTrue(ll.remove("AAA2"));
        Assert.assertTrue(ll.remove("BBB2"));
        Assert.assertFalse(ll.contains("AAA2"));
        Assert.assertTrue(ll.isEmpty());
    }

    @Test
    public void getSetItems(){
        MyLinkedList<String> ll = new MyLinkedList<>();
        ll.add("AAA");
        ll.add("BBB");

        Assert.assertTrue(ll.get(0).equals("AAA"));
        Assert.assertTrue(ll.get(1).equals("BBB"));
        Assert.assertTrue(ll.get(2)==null);
    }
}
