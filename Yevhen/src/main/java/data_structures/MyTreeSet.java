package data_structures;

import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by gorobec on 18.06.17.
 */
public class MyTreeSet<T> implements MySet<T> {

    private MyNode<T> root;
    private int size;

    private Comparator<T> comparator;

    public MyTreeSet() {
    }

    public MyTreeSet(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    @Override
    public boolean add(T o) {

        if(root == null){
            root = new MyNode<>(o);
            size++;
            return true;
        }

        if(comparator == null){

            Comparable comparable = (Comparable) o;
            MyNode<T> iter = root;
            MyNode<T> iterParent = null;

            int result = 0;

            while (iter != null){
                iterParent = iter;
                result = comparable.compareTo(iter.value);
                if(result < 0) iter = iter.leftChild;
                else if(result > 0) iter = iter.rightChild;
                else return false;
            }
            if(result < 0) iterParent.leftChild = new MyNode<>(o, iterParent);
            else if(result > 0) iterParent.rightChild = new MyNode<>(o, iterParent);

            size++;
            return true;
        } else {

        }

        return false;
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
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    private static class MyNode<T>{

        MyNode<T> parent;
        MyNode<T> leftChild;
        MyNode<T> rightChild;

        T value;

        public MyNode(T value) {
            this.value = value;
        }

        public MyNode(T value, MyNode<T> parent) {
            this.parent = parent;
            this.value = value;
        }
    }
}
