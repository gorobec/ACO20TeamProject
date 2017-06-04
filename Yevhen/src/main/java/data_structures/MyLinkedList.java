package data_structures;

import java.util.Iterator;

/**
 * Created by gorobec on 27.05.17.
 */
public class MyLinkedList<T> implements MyList<T>{

    private MyNode<T> head;

    private MyNode<T> tail;

    private int size;


    public MyLinkedList() {
    }

    @Override
    public boolean add(T o) {

        MyNode<T> node = new MyNode<>(o);

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
    public boolean remove(T o) {

        MyNode<T> forRemove = findNode(o);

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

    private MyNode<T> findNode(T o) {

        MyNode<T> iterator = head;
        if(o == null){
            for (int i = 0; i < size; i++) {
                if(null == iterator.value){
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

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    private static class MyNode<T> {
        private MyNode<T> next;
        private MyNode<T> previous;
        private T value;

        private MyNode(T value) {
            this.value = value;
        }
    }

}
