package data_structures;

public interface MyDeque<T> extends MyQueue<T> {
    void addFirst(T o);
    void addLast(T o);
    T getFirst();
    T getLast();
    boolean offerFirst(T o); // ok
    boolean offerLast(T o); // ok
    T peekFirst(); // ok
    T peekLast(); // ok
    T pollFirst(); // ok
    T pollLast(); // ok
    void push(T o); // ok
    T removeFirst();
    T removeLast();
}
