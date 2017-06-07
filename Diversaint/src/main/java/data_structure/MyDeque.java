package data_structure;

/**
 * Created by macbook on 07.06.17.
 */
public interface MyDeque<E> extends MyQueue<E> {
    void addFirst(E e);
    void addLast(E e);
    E getFirst();
    E getLast();
    boolean offerFirst(E e);
    boolean offerLast(E e);
    E peekFirst();
    E peekLast();
    E pollFirst();
    E pollLast();
    void push(E e);
    E removeFirst();
    E removeLast();
}
