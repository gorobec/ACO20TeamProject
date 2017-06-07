package data_structure;

/**
 * Created by macbook on 07.06.17.
 */
public interface MyQueue<E> extends MyCollection<E> {
    boolean add(E e);
    boolean offer(E e);
    E remove();
    E poll();
    E element();
    E peek();
}
