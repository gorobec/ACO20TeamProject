package datastructures;

/**
 * base template interface for MyList
 */
interface MyList<T> extends MyCollection<T> {
    boolean add(T o, int index);
    T get(int index);                //  Returns the element at the specified position in this list.
    T remove(int index);             //  Removes the element at the specified position in this list (optional operation).
    boolean set(T o, int index);     //  Replaces the element at the specified position in this list with the specified element (optional operation).
}



// void resize(int newSize);
// int indexOf(Object o);                          //  Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
// Object subList(int fromIndex, int toIndex);     //  Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
// int lastIndexOf(Object o);                   //  Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
