package week3.day2.internetShop;
import java.util.Iterator;

public class Repka implements Iterator, IShop {

    private Product[] products = new Product[25];
    private int size;
    private int currentPosition = 0;

    @Override
    public boolean hasNext() {
        /*if (currentPosition < size) return true;
        return false;*/
        return currentPosition < size;
    }

    @Override
    public Object next() {
        return products[currentPosition++];
    }

    @Override
    public boolean add(Product o) {
        if (size < products.length) {
            products[size++] = o;
            return true;
        }
        return false;
    }
}
