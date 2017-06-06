package datastructures;

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
        this.size = initialCapacity;
        this.ar = new Object[initialCapacity];
    }


    @Override
    public boolean add(Object o, int index) {

        if ((index < 0) || (index > ar.length - 1)) return false;

        if (size == ar.length) {
            Object[] newAr = new Object[ar.length * 15 / 10];
            System.arraycopy(ar, index, newAr, index + 1, ar.length - index);
            System.arraycopy(ar, 0, newAr, 0, index);
            ar = newAr;
        } else {
            System.arraycopy(ar, index, ar, index + 1, ar.length - index - 1);
        }

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
        ar[size - 1] = null;
        size--;

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
        int arEnd = ar.length;
        if (size == arEnd) {
            Object[] newAr = new Object[arEnd * 15 / 10];
            System.arraycopy(ar, 0, newAr, 0, arEnd);
            ar = newAr;
        }
        ar[size++] = o;
        return true;
    }

    @Override
    public boolean contains(Object o) {

        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (ar[i] == null) return true;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(ar[i])) return true;
            }
        }

        return false;
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


    public boolean equals(Object o, int ind) {
        return ((o == null) ? (ar[ind] == null) : (ar[ind].equals(o)));
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o==null){
                if (ar[i]==null) return i;
            } else {
                if (o.equals(ar[i])) return i;
            }
        }

        return -1;
    }


    /*
    public String print() {

        String str = "";
        for (int i = 0; i < size; i++) {
            str = (i < size - 1) ? (str + ar[i] + ", ") : (str + ar[i]);
        }

        return str;
    }
*/
}
