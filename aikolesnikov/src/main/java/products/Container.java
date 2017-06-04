package products;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by kaim on 6/4/17.
 */
// T
// T extends Product
// extends Comparable<Product>
public class Container<T extends Product>  {
    private final List<T> items;


    public Container() {
        this.items = new LinkedList<>();
    }

    @Override
    public String toString() {
        return "Container{" +
                "items=" + items +
                '}';
    }

    void add(T item) {
        items.add(item);
    }
}
