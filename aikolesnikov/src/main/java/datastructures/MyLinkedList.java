package datastructures;

import java.util.Iterator;

/**
 *
 */
//public class MyLinkedList implements MyList {
public class MyLinkedList<T> implements MyList<T> {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyLinkedList{");


        /*
        Iterator<T> pointer = iterator();
        while (pointer.hasNext()) {
            ???? sb.append(").append(pointer.);
            ?????? pointer = pointer.next();
        }
        */

        sb.append('}');
        return sb.toString();
    }

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
            newNode.prev = last;
            last.next = newNode;
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

    public Iterator<T> iterator() {
        return new Pointer();
    }

    public class Pointer implements Iterator<T> {
        Node<T> pointer;

        public Pointer() {
            pointer = new Node<>(null);
            pointer.next = first;
        }

        public T next() {
            pointer = pointer.next;

            return pointer.value;
        }

        public boolean hasNext() {
            return (pointer.next != null);
        }
    }

}
