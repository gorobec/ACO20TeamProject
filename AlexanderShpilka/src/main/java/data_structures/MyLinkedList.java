package data_structures;

import java.util.Iterator;

public class MyLinkedList implements MyList {
    private MyNode head;
    private MyNode tail;
    private int size;

    public MyLinkedList() {}

    @Override
    public boolean add(Object o) {
        MyNode node = new MyNode(o);
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

    private MyNode findNode(Object o) {
        MyNode node = head;
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

    private MyNode findNode(int index) {
        MyNode toFind = head;
        for (int i = 0; i < index; i++) {
            toFind = toFind.next;
        }
        return toFind;
    }

    @Override
    public void clear() {
        MyNode node = head;
        for (int i = 0; i < size; i++) {
            MyNode tmp = node.next;
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
    public boolean add(Object o, int index) {
        if (index < 0 || index > size) return false;
        if (size == 0 || index == size) add(o);

        MyNode node = new MyNode(o);
        MyNode tmp = findNode(index);

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
    public Object get(int index) {
        if (index < 0 || index >= size) return null;
        MyNode toReturn = findNode(index);
        return toReturn.value;
    }

    @Override
    public Object remove(int index) {
        if (index < 0 || index >= size) return null;
        MyNode toRemove = findNode(index);
        removeNode(toRemove);
        size--;
        return toRemove.value;
    }

    @Override
    public boolean remove(Object o) {
        MyNode toRemove = findNode(o);
        if (toRemove == null) return false;
        removeNode(toRemove);
        size--;
        return true;
    }

    private void removeNode(MyNode toRemove) {
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
    public boolean set(Object o, int index) {
        if (index < 0 || index >= size) return false;
        MyNode toSet = new MyNode(o);
        MyNode toReset = findNode(index);
        toReset = toSet;
        return true;
    }

    @Override
    public Iterator iterator() {
        return new MyIterator();
    }

    private static class MyNode {
        private MyNode next;
        private MyNode previous;
        private Object value;

        public MyNode(){};
        public MyNode(Object value) {
            this.value = value;
        }

    }

    private class MyIterator implements Iterator {

        MyNode cursor;

        public MyIterator() {
            cursor = new MyNode();
            cursor.next = head;
        }

        @Override
        public boolean hasNext() {
            return cursor.next != null;
        }

        @Override
        public Object next() {
            cursor = cursor.next;
            return cursor.value;
        }
    }
}
