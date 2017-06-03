package design_patterns.iterator;

import java.util.Iterator;

/**
 * Created by gorobec on 30.10.16.
 */
public class Rozetka implements Iterable<Product>{
    private Product[] products = new Product[10];

    private int size;

    public boolean addProduct(Product product){
        if(product == null || products.length == size) return false;
        products[size++] = product;
        return true;
    }



    @Override
    public Iterator<Product> iterator() {
        return new RozetkaIterator();
    }


    private class RozetkaIterator implements Iterator<Product> {
        private int currentPosition;

        @Override
        public boolean hasNext() {
            return currentPosition < size;
        }

        @Override
        public Product next() {
            return products[currentPosition++];
        }
    }
}
