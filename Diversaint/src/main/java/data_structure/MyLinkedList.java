package data_structure;

import java.util.Iterator;

/**
 * Created by macbook on 27.05.17.
 */
public class MyLinkedList<E> implements MyList<E>, MyDeque<E> {

    private MyNode<E> head;

    private MyNode<E> tail;

    private int size;


    public MyLinkedList() {
    }

    @Override
    public boolean add(E o) {

        MyNode<E> node = new MyNode<>(o);

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

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }
    /** Find node by position
     * Check position near head or tail*/
    private MyNode<E> node(int index) {
/* check before!
        if (!isElementIndex(index))
            return null;
*/
        MyNode<E> node;
        if (index < (size / 2)) {
            node = head;
            for (int i = 0; i < index; i++)
                node = node.next;
            return node;
        } else {
            node = tail;
            for (int i = size - 1; i > index; i--)
                node = node.previous;
            return node;
        }
    }


    /**
     *
     * @param o
     * @return the index of node. Searching for a node by object.
     * return -1 if list doesnt contain el
     */
    public int indexOf (Object o){
        int index = 0;
        if (o == null){
            for (MyNode<E> thisNode = head; thisNode.next != null; thisNode = thisNode.next) {
                if(thisNode.value == null)
                    return index;
                index++;
            }
        } else {
            for (MyNode<E> thisNode = head; thisNode.next != null; thisNode = thisNode.next) {
                if(o.equals(thisNode.value))
                    return index;
                index++;
            }

        }
        return -1;
    }

    @Override
    public boolean contains(Object o) {
        return findNode(o) != null;
    }

    @Override
    public void clear() {
        MyNode<E> temp = head;
        MyNode<E> forRemove = temp;
        for (int i = 0; size != 0; i++) {
            temp = forRemove.next;
            removeCurrentNode(forRemove);
            forRemove = temp;
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean remove(Object o) {

        MyNode<E> forRemove = findNode(o);
        if (forRemove == null) return false;
        removeCurrentNode(forRemove);
        return true;
    }

    private E removeCurrentNode(MyNode<E> forRemove) {
        if(forRemove == null) return null;
        E temp;
        if(head == tail) head = tail = null;
        else if(forRemove == head) {
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
        temp = forRemove.value;
        forRemove.value = null;

        size--;
        return temp;
    }

    private MyNode<E> findNode(Object o) {

        MyNode<E> iterator = head;
        if(o == null){
            for (int i = 0; i < size; i++) {
                if(iterator.value == null) return iterator;
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
    public boolean add(E element, int index) {
        if (!isPositionIndex(index)) return false;
        if (index == 0) addFirst(element);
        if (index == size) addLast(element);
        MyNode<E> node = new MyNode<>(element);
        MyNode<E> shiftNode = node(index);
        node.previous = shiftNode.previous;
        shiftNode.previous = node;
        node.next = shiftNode;
        return true;
    }

    @Override
    public E get(int index) {
        if (!isElementIndex(index)) return null;
        return node(index).value;
    }

    @Override
    public E remove(int index) {
        if (!isElementIndex(index)) return null;
        if (index == 0) return removeFirst();
        if (index == size - 1) return removeLast();
        return removeCurrentNode(node(index));
    }

    @Override
    public boolean set(E o, int index) {
        if (!isElementIndex(index)) return false;
        node(index).value = o;
        return true;
    }

    @Override
    public void addFirst(E e) {
        MyNode<E> node = new MyNode<>(e);

        if(size == 0) {
            head = tail = node;
        } else {
            head.previous = node;
            node.next = head;
            head = node;
        }
        size++;

    }

    @Override
    public void addLast(E e) {
        add(e);
    }

    @Override
    public E getFirst() {
        if (size == 0) return null;
        final MyNode<E> node = head;
        return node.value;
    }

    @Override
    public E getLast() {
        if (size == 0) return null;
        final MyNode<E> node = tail;
        return node.value;

    }

    @Override
    public boolean offer(E e) {
        return add(e);
    }

    @Override
    public E remove() {
        return removeFirst();
    }

    @Override
    public E poll() {
        return size == 0 ? null : removeFirst();
    }

    @Override
    public E element() {
        return getFirst();
    }

    @Override
    public E peek() {
        return getFirst();
    }

    @Override
    public boolean offerFirst(E e) {
        addFirst(e);
        return true;
    }

    @Override
    public boolean offerLast(E e) {
        addLast(e);
        return true;
    }

    @Override
    public E peekFirst() {
        return getFirst();
    }

    @Override
    public E peekLast() {
        return getLast();
    }

    @Override
    public E pollFirst() {
        return removeFirst();
    }

    @Override
    public E pollLast() {
        return removeLast();
    }

    @Override
    public void push(E e) {
        addFirst(e);
    }

    @Override
    public E removeFirst() {
        return removeCurrentNode(head);
    }

    @Override
    public E removeLast() {
        return removeCurrentNode(tail);
    }

    @Override
    public Iterator<E> iterator() {

        return new MyIterator();
    }

    private static class MyNode<E> {

        MyNode<E> next;
        MyNode<E> previous;
        E value;

        public MyNode() {
        }

        MyNode(E value) {
            this.value = value;
        }

    }

    private class MyIterator implements Iterator<E> {
        MyNode<E> currentNode;
        int currentPosition;

        public MyIterator() {
            currentNode = new MyNode();
            currentNode.next = head;
        }

        @Override
        public boolean hasNext() {
            return currentPosition < size;
        }

        @Override
        public E next() {
            currentNode = currentNode.next;
            currentPosition++;
            return currentNode.value;
        }
    }

}
