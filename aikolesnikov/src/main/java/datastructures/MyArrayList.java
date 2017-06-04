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

    public boolean add(Object o) {
        if (size == ar.length) {
            Object[] newAr = new Object[ar.length * 15 / 10];
            System.arraycopy(ar, 0, newAr, 0, ar.length);
            ar = newAr;
            ar[size++] = o;
            return true;
        } else {
            ar[size++] = o;
            return true;
        }
    }

    public Object get(int index) {
        if ((index < 0) || (index > size - 1)) return null;
        return ar[index];
    }


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
    /*
    public boolean	remove(int ind){
        int actualSize = this.getSize();

        if ((ind < 0) || (ind > actualSize)) {
            System.out.println("Index is out of range.");
            return false;
        }

        for (int j=ind; j<actualSize-1;j++){
            this.getAr()[j]=this.ar[j+1];
        }
        this.setSize(actualSize-1);

        return true;
    }
    */

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

    public boolean set(int index, Object o) {
        if ((index < 0) || (index > this.size)) {
            System.out.println("Index is out of range.");
            return false;
        }

        this.ar[index] = o;

        return true;
    }

    public String print() {

        String str = "";
        for (int i = 0; i < this.size; i++) {
            str = (i < size - 1) ? (str + this.ar[i] + ", ") : (str + this.ar[i]);
        }

        return str;
    }

}


    /*
    int lastIndexOf(Object o){
        int ind = -1;

        int actualSize = this.getSize();
        for (int i=actualSize-1; i>=0 ; i--){
            if (this.equals(o, i)){
                ind = i;
                return ind;
            }
        }

        return ind;
    }
*/