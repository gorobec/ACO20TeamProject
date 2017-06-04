package data_structures;

/**
 * Created by gorobec on 21.05.17.
 */
public interface MyList<T> extends MyCollection<T> {

    boolean add(T o, int index);
    T get(int index);
    T remove(int index);
    boolean set(T o, int index);
}
