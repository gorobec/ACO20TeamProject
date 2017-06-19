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
    public void additems(){
        MyLinkedList<String> ll = new MyLinkedList<>();
        ll.add("AAA");
        ll.add("BBB");

        Assert.assertEquals(ll.size(),2);
        Assert.assertTrue(ll.contains("AAA"));

        // ll.clear();
        // Assert.assertFalse(ll.contains("AAA"));
        // Assert.assertTrue(ll.size()==0);

        ll.remove("AAA");
/*        Iterator ptr = ll.iterator();
        while (ptr.hasNext()) {
            System.out.println(ll);
            ptr.next();
        }*/
        // for (String s:ll)
        // System.out.println(s);

    }
}
