package week4.classwork;

import java.util.List;

/**
 * Created by macbook on 04.06.17.
 */
public class Container<T> {
    private List<T> list;

    public Container(List<T> list) {
        this.list = list;
    }
    public void add(T item){
        list.add(item);
    }

}
