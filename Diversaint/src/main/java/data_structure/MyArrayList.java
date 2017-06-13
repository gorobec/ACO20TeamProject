package data_structure;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by macbook on 25.05.17.
 */
public class MyArrayList<T> implements MyList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] elementData;
    private int size;


    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }
    @SuppressWarnings(value = "unchecked")
    public MyArrayList(int capacity) {
        elementData = (T[]) new Object[capacity];
    }

    @Override
    public boolean add(T o) {
        if(size == elementData.length) ensureCapacity();
        elementData[size++] = o;
        return true;
    }
    @SuppressWarnings(value = "unchecked")
    private void ensureCapacity() {
        T[] newElementData = (T[]) new Object[(elementData.length * 3 )/ 2 + 1];
        System.arraycopy(elementData, 0, newElementData, 0, size);
        elementData = newElementData;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (o == null ? elementData[i] == null : o.equals(elementData[i]))
                return true;
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
        size = 0;

    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean remove(Object o) {


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
        if (index < 0 || index > size) return false;
        if(size == elementData.length) ensureCapacity();
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = o;
        return true;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index > size) return null;
            return elementData[index];
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index > size) return null;
        T temp = elementData[index];
        System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
        if (size != elementData.length)
        elementData[size--] = null;
        else {
            elementData[index] = null;
            size--;
        }
        return temp;
    }

    @Override
    public boolean set(T o, int index) {
        if (index < 0 || index >= size) return false;
        elementData[index] = o;
        return true;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {
        private int currentPosition;
        @Override
        public boolean hasNext() {
            return currentPosition < size;
        }

        @Override
        public T next() {
            return elementData[currentPosition++];
        }
    }
}
