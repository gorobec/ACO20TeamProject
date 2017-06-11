package data_structures;

import data_structures.exceptions.MyIndexOutOfBoundsException;

import java.util.Iterator;

/**
 * Created by gorobec on 21.05.17.
 */
public class MyArrayList<T> implements MyList<T>{

    private static final int DEFAULT_CAPACITY = 10;
    private T[] elementData;
    private int size;


    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings(value = "unchecked")
    public MyArrayList(int capacity) {
        elementData = (T[])new Object[capacity];
    }

    @Override
    public boolean add(T o) {
        if(size == elementData.length) ensureCapacity();
        elementData[size++] = o;
        return true;
    }

    @SuppressWarnings(value = "unchecked")
    private void ensureCapacity() {
        T[] newElementData = (T[])new Object[(elementData.length * 3 )/ 2 + 1];
        System.arraycopy(elementData, 0, newElementData, 0, size);
        elementData = newElementData;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean remove(T o) {


        if(o == null){
            for (int i = 0; i < size; i++) {
                if(o == elementData[i]) {
                    System.arraycopy(elementData, i + 1, elementData, i, size - i - 1);
                    elementData[size--] = null;
                    return true;
                }
            }
            return false;
        }

        for (int i = 0; i < size; i++) {
            if(o.equals(elementData[i])) {
                System.arraycopy(elementData, i + 1, elementData, i, size - i - 1);
                elementData[size--] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(T o, int index) {
        return false;
    }

    @Override
    public T get(int index) {

            if (index < 0 || index >= size){ throw new MyIndexOutOfBoundsException("Index: " + index);}

        return elementData[index];
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public boolean set(T o, int index) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
