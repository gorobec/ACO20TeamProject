package week4.day2.shop;

import java.util.ArrayList;
import java.util.List;

public class Container<T extends Comparable<Product>> {
    private List<T> items;

    public Container() {
        items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    @Override
    public String toString() {
        return "Container{" +
                "items=" + items +
                '}';
    }
}
