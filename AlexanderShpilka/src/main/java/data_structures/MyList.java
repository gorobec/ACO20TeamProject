package data_structures;

public interface MyList<T> extends MyCollection<T> {
    boolean add(T o, int index);
    T get(int index);
    T remove(int index);
    boolean set(T o, int index);
}
