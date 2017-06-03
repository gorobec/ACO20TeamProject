package design_patterns.iterator;

import java.util.Iterator;

/**
 * Created by gorobec on 28.05.17.
 */
public class RozetkaIterator implements Iterator<Product> {
    private Product[] products;
    private int currentPosition;

    private int size;

    public RozetkaIterator(Product[] products, int size) {
        this.products = products;
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < size;
    }

    @Override
    public Product next() {
        return products[currentPosition++];
    }
}
