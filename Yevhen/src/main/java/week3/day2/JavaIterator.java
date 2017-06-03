package week3.day2;

import data_structures.MyLinkedList;
import data_structures.MyList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by gorobec on 28.05.17.
 */
public class JavaIterator {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator iterator = list.iterator();


        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Object o : list) {
            System.out.println(o);

        }

        MyList myList = new MyLinkedList();

        myList.add(1);
        myList.add(2);
        myList.add(3);

    }
}
