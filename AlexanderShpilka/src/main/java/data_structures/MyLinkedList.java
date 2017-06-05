package data_structures;

import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T> {
    private MyNode<T> head;
    private MyNode<T> tail;
    private int size;

    public MyLinkedList() {}

    @Override
    public boolean add(T o) {
        MyNode<T> node = new MyNode<>(o);
        if (size == 0) {
            head = tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        size++;
        return true;
    }

    @Override
    public boolean contains(Object o) {
        return findNode(o) != null;
    }

    private MyNode<T> findNode(Object o) {
        MyNode<T> node = head;
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (o == node.value) return node;
                node = node.next;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(node.value)) return node;
                node = node.next;
            }
        }
        return null;
    }

    private MyNode<T> findNode(int index) {
        MyNode<T> toFind = head;
        for (int i = 0; i < index; i++) {
            toFind = toFind.next;
        }
        return toFind;
    }

    @Override
    public void clear() {
        MyNode<T> node = head;
        for (int i = 0; i < size; i++) {
            MyNode<T> tmp = node.next;
            node.value = null;
            node.next = null;
            node.previous = null;
            node = tmp;
        }
        head = tail = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(T o, int index) {
        if (index < 0 || index > size) return false;
        if (size == 0 || index == size) add(o);

        MyNode<T> node = new MyNode<>(o);
        MyNode<T> tmp = findNode(index);

        if (tmp == head) {
            node.next = head;
            head.previous = node;
            head = node;
        } else if (tmp == tail) {
            tail.previous.next = node;
            tail.previous = node;
        } else {
            node.previous = tmp.previous;
            node.next = tmp;
            tmp.previous.next = node;
            tmp.previous = node;
        }

        size++;
        return true;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) return null;
        MyNode<T> toReturn = findNode(index);
        return toReturn.value;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) return null;
        MyNode<T> toRemove = findNode(index);
        removeNode(toRemove);
        size--;
        return toRemove.value;
    }

    @Override
    public boolean remove(Object o) {
        MyNode<T> toRemove = findNode(o);
        if (toRemove == null) return false;
        removeNode(toRemove);
        size--;
        return true;
    }

    private void removeNode(MyNode<T> toRemove) {
        if (head == tail) {
            head = tail = null;
        } else if (toRemove == head) {
            head = head.next;
            head.previous = null;
        } else if (toRemove == tail) {
            tail = tail.previous;
            tail.next = null;
        } else {
            toRemove.previous.next = toRemove.next;
            toRemove.next.previous = toRemove.previous;
        }
    }

    @Override
    public boolean set(T o, int index) {
        if (index < 0 || index >= size) return false;
        MyNode<T> toSet = new MyNode<>(o);
        MyNode<T> toReset = findNode(index);
        toReset = toSet;
        return true;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private static class MyNode<T> {
        private MyNode<T> next;
        private MyNode<T> previous;
        private T value;

        public MyNode(){};
        public MyNode(T value) {
            this.value = value;
        }

    }

    private class MyIterator implements Iterator<T> {

        MyNode<T> cursor;

        public MyIterator() {
            cursor = new MyNode<>();
            cursor.next = head;
        }

        @Override
        public boolean hasNext() {
            return cursor.next != null;
        }

        @Override
        public T next() {
            cursor = cursor.next;
            return cursor.value;
        }
    }
}
