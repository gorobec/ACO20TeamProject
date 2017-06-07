package data_structure;

/**
 * Created by macbook on 25.05.17.
 */
public interface MyList<E> extends MyCollection<E> {
    boolean add(E o, int index);
    E get(int index);
    Object remove(int index);
    boolean set(E o, int index);
}
