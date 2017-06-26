package datastructures;

import java.util.Iterator;

/**
 *  base template interface for MyDataStructures
 */
interface MyCollection<T> extends Iterable<T>{

    boolean	add(T o);                  // Ensures that this collection contains the specified element (optional operation).
    boolean	contains(T o);             // Returns true if this collection contains the specified element.
    void	clear();                        // Removes all of the elements from this collection (optional operation).
    boolean	isEmpty();                      // Returns true if this collection contains no elements.
    boolean	remove(T o);               // Removes a single instance of the specified element from this collection, if it is present (optional operation).
    int	size();                             // Returns the number of elements in this collection.

    /*
    // Iterator<T> iterator();                 // Returns an iterator over the elements in this collection.
    // boolean	equals(Object o);               // Compares the specified object with this collection for equality.
    //Object[] toArray();                   // Returns an array containing all of the elements in this collection.
    boolean	containsAll(Collection<?> c);   Returns true if this collection contains all of the elements in the specified collection.
    int	hashCode();                         Returns the hash code value for this collection.
    boolean	removeAll(Collection<?> c);     Removes all of this collection's elements that are also contained in the specified collection (optional operation).
    boolean	retainAll(Collection<?> c);     Retains only the elements in this collection that are contained in the specified collection (optional operation).
    <T> T[]	toArray(T[] a);     Returns an array containing all of the elements in this collection; the runtime type of the returned array is that of the specified array.
*/




}
