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
        Node<T> iter = first;
        while (iter != null) {
            if ((iter.value != null) && (iter.value.equals(o))) return true;
            iter = iter.next;
        }
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
        if (o == null) return false;
        if (size == 0) return false;

        if (size == 1) {
            first.value = null;
            first = last = null;
            size = 0;
            return true;
        }


        Node<T> iter = new Node<>(null);
        iter.next = first;
        while (iter.next != null) {
            if ((iter.next.value != null) && (iter.next.value.equals(o))) {
                if (iter.next == first) {
                    (iter.next.next).prev = null;
                    first.value = null;
                    first = iter.next.next;
                    size--;
                    return true;
                } else if (iter.next == last) {
                    last.value = null;
                    last.prev.next=null;
                    last=last.prev;
                    size--;
                } else {
                    iter.next.next.prev = iter.next.prev;
                    iter.next.value = null;
                    iter.next = iter.next.next;
                    size--;
                    return true;
                }
            } else
                iter = iter.next;
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
        if ((index < 0) || (index >= size)) return null;
        Node<T> ptr = first;
        while (index-- > 0) ptr = ptr.next;

        return ptr.value;
    }

    @Override
    public T remove(int index) {
        if ((index < 0) || (index >= size)) return null;

        Node<T> ptr = first;
        while (index-- > 0) ptr = ptr.next;

        if (remove(ptr.value)) return ptr.value;
        else return null;
    }

    @Override
    public boolean set(T o, int index) {
        if ((index < 0) || (index >= size)) return false;

        Node<T> ptr = first;
        while (index-- > 0) ptr = ptr.next;

        ptr.value = o;
        return true;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyLinkedList{");
        for (T s : this)
            sb.append(s).append(';');
        sb.append('}');

        return sb.toString();
    }
}
