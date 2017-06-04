package data_structures;

import java.util.Iterator;

public class MyArrayList implements MyList {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementData;
    private int size;

    public MyArrayList(int capacity) {
        elementData = new Object[capacity];
    }
    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    @Override
    public boolean add(Object o) {
        if(size == elementData.length) ensureCapacity();
        elementData[size++] = o;
        return true;
    }

    private void ensureCapacity() {
        Object[] newElementData = new Object[(elementData.length * 3 )/ 2 + 1];
        System.arraycopy(elementData, 0, newElementData, 0, size);
        elementData = newElementData;
    }

    @Override
    public boolean contains(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (o == elementData[i]) {
                    return true;
                }
            }
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i]))
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
    public boolean add(Object o, int index) {
        if (index < 0 || index > size) return false;
        if (size == elementData.length) ensureCapacity();
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = o;
        size++;
        return true;
    }

    /*@Override
    public Object get (int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        return elementData[index];
    }*/

    @Override
    public Object get (int index) {
        if (index < 0 || index > size) return null;
        return elementData[index];
    }

    @Override
    public Object remove(int index) {
        if (index < 0 || index > size - 1) return null;
        // if (size == 0) return null;

        Object toReturn = elementData[index];
        if (index == size - 1) {
            elementData[index] = null;
            size--;
            return toReturn;
        }

        System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
        /*elementData[size - 1] = null;
        size--;*/
        elementData[--size] = null;
        return toReturn;
    }


    @Override
    public boolean set(Object o, int index) {
        if (index < 0 || index > size - 1) return false;
        elementData[index] = o;
        return true;
    }

    @Override
    public Iterator iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator {

        private int currentPosition;

        @Override
        public boolean hasNext() {
            return currentPosition < size;
        }

        @Override
        public Object next() {
            return elementData[currentPosition++];
        }
    }
}