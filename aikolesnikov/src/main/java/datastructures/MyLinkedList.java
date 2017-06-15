package datastructures;

import java.util.Iterator;

/**
 *
 */
//public class MyLinkedList implements MyList {
public class MyLinkedList<T> implements MyList<T> {
    private static class Node<T> {
        private Node<T> next;
        private Node<T> prev;
        private T value;

        private Node(T value) {
            this.value = value;
        }
    }

    private Node<T> first;
    private Node<T> last;
    private int size;

    public MyLinkedList() {
    }


    @Override
    public boolean add(T o) {
        Node<T> newNode = new Node<>(o);
        if (size == 0) {
            first = last = newNode;
        } else {
            newNode.prev=last;
            last.next=newNode;
            last = newNode;
        }
        size++;

        return true;
    }

    @Override
    public boolean contains(T o) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean remove(T o) {
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean add(T o, int index) {
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public boolean set(T o, int index) {
        return false;
    }


    /*

    public boolean add(T o){
        Node<T> newNode = new Node(o);
        last = newNode;

        return true;
    }

*/
    public static void main(String[] args) {
        MyLinkedList<String> l = new MyLinkedList<>();

        // Node<String> node = new Node("AAA");

        System.out.println(l);
        l.add("AAA");
        System.out.println(l);

    }
}
