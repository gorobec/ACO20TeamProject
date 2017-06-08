package week4.day2;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");
        linkedList.add("Four");
        System.out.println(Arrays.asList(linkedList));

        linkedList.offerLast("pop");

//        linkedList.offerFirst("Zero");
        System.out.println(Arrays.asList(linkedList));

//        System.out.println(linkedList.peekFirst());
    }
}
