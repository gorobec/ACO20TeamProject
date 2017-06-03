package week3.day2.internetShop;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Rozetka implements Iterator, IShop {

    private List<Product> products = new ArrayList<>();
    //private int size;
    private int currentPosition = 0;

    @Override
    public boolean hasNext() {
        /*if (currentPosition < products.size()) return true;
        return false;*/
        return currentPosition < products.size();
    }

    @Override
    public Object next() {
        return products.get(currentPosition++);
    }

    @Override
    public boolean add(Product o) {
        products.add(o);
        return true;
    }
}
