package data_structures;

import java.util.Iterator;

/**
 * Created by gorobec on 27.05.17.
 */
public class MyLinkedList implements MyList{

    private MyNode head;

    private MyNode tail;

    private int size;


    public MyLinkedList() {
    }

    @Override
    public boolean add(Object o) {

        MyNode node = new MyNode(o);

        if(size == 0) {
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
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean remove(Object o) {

        MyNode forRemove = findNode(o);

        if(forRemove == null) return false;

//        if(size == 1){
        if(head == tail){
            head = tail = null;
        } else if(forRemove == head){
            forRemove.next.previous = null;
            head = forRemove.next;

        } else if (forRemove == tail){
            forRemove.previous.next = null;
            tail = forRemove.previous;
        } else {
            forRemove.previous.next = forRemove.next;
            forRemove.next.previous = forRemove.previous;
        }

        forRemove.next = null;
        forRemove.previous = null;
        forRemove.value = null;

        size--;

        return true;
    }

    private MyNode findNode(Object o) {

        MyNode iterator = head;
        if(o == null){
            for (int i = 0; i < size; i++) {
                if(o == iterator.value){
                    return iterator;
                }
                iterator = iterator.next;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if(o.equals(iterator.value)){
                    return iterator;
                }
                iterator = iterator.next;
            }
        }

        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(Object o, int index) {
        return false;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public boolean set(Object o, int index) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    private static class MyNode {
        private MyNode next;
        private MyNode previous;
        private Object value;

        public MyNode(Object value) {
            this.value = value;
        }
    }

}
