package data_structures;

public interface MyQueue<T> extends MyCollection<T> {
    boolean add(T o);
    boolean offer(T o);
    T remove();
    T poll();
    T element(); // ok
    T peek();
}
