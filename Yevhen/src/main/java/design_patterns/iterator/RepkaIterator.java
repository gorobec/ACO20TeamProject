package design_patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by gorobec on 28.05.17.
 */
public class RepkaIterator implements Iterator<Product> {
    private List<Product> products;
    private int currentPosition;

    public RepkaIterator(List<Product> products) {
        this.products = products;
    }
    @Override
    public boolean hasNext() {
        return currentPosition < products.size();
    }

    @Override
    public Product next() {
        return products.get(currentPosition++);
    }
}
