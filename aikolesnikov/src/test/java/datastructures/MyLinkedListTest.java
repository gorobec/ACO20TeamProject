package datastructures;

import org.junit.Assert;
import org.junit.Test;

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

        System.out.println(ll);
    }
}
