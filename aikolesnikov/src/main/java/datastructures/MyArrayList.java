package datastructures;


import java.util.Iterator;

/**
 * MyArrayLisr Class
 */
public class MyArrayList implements MyList {

    private static final int INIT_SIZE = 10;

    private int size;
    Object[] ar;

    public MyArrayList() {
        this.size = INIT_SIZE;
        this.ar = new Object[INIT_SIZE];
    }

    public MyArrayList(MyArrayList o) {
        this.size = o.size;
        this.ar = o.ar;
    }

    public MyArrayList(Object[] ar) {
        this.size = ar.length;
        this.ar = ar;
    }

    public MyArrayList(int initialCapacity) {
        this.size = 0;
        this.ar = new Object[initialCapacity];
    }

    @Override
    public boolean add(Object o, int index) {

        if ((index < 0) || (index > ar.length - 1)) return false;

        if (size == ar.length) {
          ensureCapacity();
        }
        System.arraycopy(ar, index, ar, index + 1, ar.length - index - 1);
        ar[index] = o;
        size++;
        return true;
    }

    @Override
    public Object get(int index) {
        if ((index < 0) || (index > ar.length - 1)) return null;
        return ar[index];
    }

    @Override
    public Object remove(int index) {
        if ((index < 0) || (index > size - 1)) return null;

        Object tmpObj = ar[index];
        System.arraycopy(ar, index + 1, ar, index, size - index - 1);
        ar[--size] = null;
        return tmpObj;
    }

    @Override
    public boolean set(Object o, int index) {
        if ((index < 0) || (index > size - 1)) return false;
        ar[index] = o;
        return true;
    }

    @Override
    public boolean add(Object o) {
        if (size == ar.length) {
            ensureCapacity();
        }
        ar[size++] = o;
        return true;
    }

    private void ensureCapacity() {
        Object[] newAr = new Object[size * 15 / 10];
        System.arraycopy(ar, 0, newAr, 0, size);
        ar = newAr;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public void clear() {
        // not sure it was a good way
        // MyArrayList tmp = new MyArrayList();
        // size = tmp.size;
        // ar = tmp.ar;

        for (int i = 0; i < size; i++) {
            ar[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean remove(Object o) {
        int ind = indexOf(o);

        if (ind != -1) {
            remove(ind);
            return true;
        }

        return false;
    }

    @Override
    public int size() {
        return size;
    }
    public int indexOf(Object o) {
        if (o == null){
            for (int i = 0; i < size; i++) {
                if (ar[i]==null) return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(ar[i])) return i;
            }
        }
        return -1;
    }

    public Iterator iterator() {
        return null;
    }
}
