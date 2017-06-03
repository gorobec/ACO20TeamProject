package week2.day2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gorobec on 21.05.17.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);
        System.out.println(list.size());
        list.add(5);
//        list.add("D");
        list.add(3);
        list.add(null);
        list.add(null);
        list.add(null);
        list.add(null);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list.remove(null));
        System.out.println(list.size());
    }
}
