package data_structures;

public interface MyList extends MyCollection {
    boolean add(Object o, int index);
    Object get(int index);
    Object remove(int index);
    boolean set(Object o, int index);
}
