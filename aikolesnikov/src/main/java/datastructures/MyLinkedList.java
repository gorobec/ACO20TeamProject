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
            newNode.prev = last;
            last.next = newNode;
            last = newNode;
        }
        size++;

        return true;
    }

    @Override
    public boolean contains(T o) {
        for (T t : this)
            if (t.equals(o)) return true;
        return false;
    }

    @Override
    public void clear() {
        if (size == 0) {
            return;
        }
        if (size == 1) {
            first = last = null;
            size = 0;
            return;
        }

        Node<T> iter = new Node<>(null);
        iter.next = first;
        while (iter != last) {
            iter.next.value = null;
            iter = iter.next;
        }
        first = last = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean remove(T o) {
        if (size == 0) {
            return false;
        } else if (size == 1) {
            first = last = null;
            size = 0;
            return true;
        } else {
            Node<T> iter = new Node<>(null);
            iter.next = first;
            while (iter != last) {
                if (iter.next.value.equals(o)) {
                    System.out.println(iter.next.value);
                    return true;
                } else {
                    System.out.println(iter.value);
                    iter = iter.next;
                }
            }
        }

        return false;
    }

    @Override
    public int size() {
        return size;
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
