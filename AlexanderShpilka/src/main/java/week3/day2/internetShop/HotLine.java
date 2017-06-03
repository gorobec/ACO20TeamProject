package week3.day2.internetShop;
import java.util.Iterator;
import java.util.List;

public class HotLine {
    private List<Object> products;

    public boolean add(Iterator iterator) {

        while (iterator.hasNext()) {
            products.add(iterator.next());
        }

        return true;
    }
}
