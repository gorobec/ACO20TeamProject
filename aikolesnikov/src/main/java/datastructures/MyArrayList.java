package datastructures;

import java.util.logging.Logger;

/**
 * MyArrayLisr Class
 */
public class MyArrayList implements MyList {

    private static final int initSize = 10;

    private int size;
    private Object[] ar;

    public MyArrayList() {
        this.size = initSize;
        this.ar = new Object[initSize];
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getAr() {
        return ar;
    }

    public void setAr(Object[] ar) {
        this.ar = ar;
    }

    @Override
    public boolean add(Object o, int index) {

        if ((index < 0) || (index > ar.length - 1)) return false;

        if (size == ar.length) {
            Object[] newAr = new Object[ar.length * 15 / 10];
            System.arraycopy(ar, index, newAr, index + 1, ar.length - index );
            System.arraycopy(ar, 0, newAr, 0, index);
            ar = newAr;
        } else {
            System.arraycopy(ar, index, ar, index + 1, ar.length - index -1 );
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
        int arEnd = ar.length - 1;

        if ((index < 0) || (index > arEnd)) return null;

        Object tmpObj = ar[index];
        System.arraycopy(ar, index + 1, ar, index, arEnd - index);
        ar[arEnd] = null;
        size--;

        return tmpObj;
    }

    @Override
    public boolean set(Object o, int index) {
        if ((index < 0) || (index > ar.length - 1)) return false;
        this.ar[index] = o;
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
    public int size() {
        return size;
    }

    public void resize(int newSize) {

        int actualSize = this.getSize();

        if (newSize == actualSize) {
            System.out.println("The same size. Resizing is skipped.");
            return;
        }
        actualSize = (this.getSize() > newSize) ? newSize : this.getSize();

        MyArrayList newMyArrayList = new MyArrayList(newSize);
        for (int i = 0; i < actualSize; i++) {
            newMyArrayList.getAr()[i] = this.getAr()[i];
        }

        this.setSize(newSize);
        this.setAr(newMyArrayList.getAr());
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean equals(MyArrayList o) {

        if ((this.ar == null) && (o == null)) return true;

        int actualSize = this.size;
        if (!(actualSize == o.size)) return false;

        for (int i = 0; i < actualSize; i++) {
            if ((this.getAr()[i] == null) && !(o.getAr()[i] == null)) return false;
            if (!(this.getAr()[i] == null) && (o.getAr()[i] == null)) return false;

            if (!((this.getAr()[i] == null) || (o.getAr()[i] == null))) {
                if (!(this.getAr()[i].equals(o.getAr()[i]))) return false;
            }
        }

        return true;
    }

    public boolean equals(Object o, int ind) {
        return ((o == null) ? (this.getAr()[ind] == null) : (this.getAr()[ind].equals(o)));
    }

    public void clear() {
        this.resize(initSize);
        for (int i = 0; i < initSize; i++) {
            this.getAr()[i] = null;
        }
    }

    public boolean contains(Object o) {
        for (int i = 0; i < this.size; i++) {
            if (this.equals(o, i)) {
                return true;
            }
        }
        return false;
    }

    public boolean remove(Object o) {

        int actualSize = this.size;

        for (int i = 0; i < actualSize; i++) {
            if (this.equals(o, i)) {
                for (int j = i; j < this.size - 1; j++) {
                    this.ar[j] = this.ar[j + 1];
                }
                this.setSize(actualSize - 1);
                return true;
            }
        }

        return false;
    }


    public int indexOf(Object o) {
        int ind = -1;

        int actualSize = this.getSize();
        for (int i = 0; i < actualSize; i++) {
            if (this.equals(o, i)) {
                ind = i;
                return ind;
            }
        }

        return ind;
    }


    public String print() {

        String str = "";
        for (int i = 0; i < this.size; i++) {
            str = (i < size - 1) ? (str + this.ar[i] + ", ") : (str + this.ar[i]);
        }

        return str;
    }

}
