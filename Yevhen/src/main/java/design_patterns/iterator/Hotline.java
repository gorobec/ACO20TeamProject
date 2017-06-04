package design_patterns.iterator;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by gorobec on 30.10.16.
 */
public class Hotline {
    private List<Product> productList = new LinkedList<>();


    public void addProducts(Iterable<Product> iterable){

        /*Iterator<Product> iterator = iterable.iterator();

        while (iterator.hasNext()){
            productList.add(iterator.next());
        }*/

        for (Product product : iterable) {
            productList.add(product);
        }
    }

    @Override
    public String toString() {
        return "Hotline{" +
                "productList=" + productList +
                '}';
    }
}
