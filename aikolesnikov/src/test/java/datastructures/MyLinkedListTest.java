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
    public void testRemoveItems(){
        MyLinkedList<String> ll = new MyLinkedList<>();

        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");

        Assert.assertTrue(ll.toString().equals("MyLinkedList{A;B;C;D;}"));
        ll.remove(null);
        Assert.assertTrue(ll.toString().equals("MyLinkedList{A;B;C;D;}"));
        ll.remove("A");
        Assert.assertTrue(ll.toString().equals("MyLinkedList{B;C;D;}"));
        ll.remove("C");
        Assert.assertTrue(ll.toString().equals("MyLinkedList{B;D;}"));
        ll.remove("D");
        Assert.assertTrue(ll.toString().equals("MyLinkedList{B;}"));
        ll.remove("B");
        Assert.assertTrue(ll.toString().equals("MyLinkedList{}"));

        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        Assert.assertTrue(ll.toString().equals("MyLinkedList{A;B;C;D;}"));
        ll.remove(-1);
        Assert.assertTrue(ll.toString().equals("MyLinkedList{A;B;C;D;}"));
        ll.remove(10);
        Assert.assertTrue(ll.toString().equals("MyLinkedList{A;B;C;D;}"));
        ll.remove(0);
        Assert.assertTrue(ll.toString().equals("MyLinkedList{B;C;D;}"));
        ll.remove(1);
        Assert.assertTrue(ll.toString().equals("MyLinkedList{B;D;}"));
        ll.remove(1);
        Assert.assertTrue(ll.toString().equals("MyLinkedList{B;}"));
        ll.remove(0);
        Assert.assertTrue(ll.toString().equals("MyLinkedList{}"));
    }

    @Test
    public void testGetSetItems(){
        MyLinkedList<String> ll = new MyLinkedList<>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");

        Assert.assertTrue(ll.get(0).equals("A"));
        Assert.assertTrue(ll.get(1).equals("B"));
        Assert.assertTrue(ll.get(5)==null);
        Assert.assertTrue(ll.toString().equals("MyLinkedList{A;B;C;D;}"));

        ll.set("X",-1);
        Assert.assertTrue(ll.toString().equals("MyLinkedList{A;B;C;D;}"));
        ll.set("X",10);
        Assert.assertTrue(ll.toString().equals("MyLinkedList{A;B;C;D;}"));
        ll.set("X",0);
        Assert.assertTrue(ll.toString().equals("MyLinkedList{X;B;C;D;}"));
        ll.set("X",2);
        Assert.assertTrue(ll.toString().equals("MyLinkedList{X;B;X;D;}"));
        ll.set("X",3);
        Assert.assertTrue(ll.toString().equals("MyLinkedList{X;B;X;X;}"));
    }
}
