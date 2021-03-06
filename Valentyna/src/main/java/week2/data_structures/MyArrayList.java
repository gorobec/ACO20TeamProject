package week2.data_structures;

import java.util.Iterator;


/**
 * Created by valentina on 31.05.17.
 */
public class MyArrayList implements MyList{

    private static final int DEFAULT_CAPACITY = 10;
    private  Object[] elementData;
    private int size;

    public MyArrayList() {
//        this.elementData = new Object[DEFAULT_CAPACITY];
        this(DEFAULT_CAPACITY);
    }

    public MyArrayList(int capacity) {
        this.elementData = new Object[capacity];
    }

    @Override
    public boolean add(Object o) {
        if(size == elementData.length) increaseCapacity();
        elementData[size++] = o;
        return true;
    }

    private void increaseCapacity() {
        Object[] newElementData = new Object[(elementData.length * 3) / 2 + 1];
        System.arraycopy(elementData, 0, newElementData, 0, size);
        elementData = newElementData;
    }

    @Override
    public boolean add(Object o, int index) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public boolean set(Object o, int index) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public boolean remove(Object o) {

        if(o == null){
            for (int i = 0; i < size; i++) {
                if (o == elementData[i]) {
                    System.arraycopy(elementData, i + 1, elementData, i, size - i - 1);
                    elementData[size--] = null;
                    return true;
                }
            }
            return false;
        }

        for (int i = 0; i < size; i++) {
            if(o.equals(elementData[i])) {
                System.arraycopy(elementData, i + 1, elementData, i, size - i -1);
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
    public Iterator iterator() {
        return null;
    }
}
