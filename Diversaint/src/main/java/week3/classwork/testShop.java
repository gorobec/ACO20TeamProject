package week3.classwork;

import data_structure.MyLinkedList;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by macbook on 28.05.17.
 */
public class testShop {
    public static void main(String[] args) {
        Product xbox = new Product("xbox", 5999);
        Product ps4 = new Product("ps4", 6999);
        Product sega = new Product("sega", 1999);
        Product[] products = new Product[]{xbox, ps4, sega};
        MyLinkedList<Product> list = new MyLinkedList<>();
        list.add(xbox);
        list.add(null);
        list.add(ps4);
        list.add(sega, 0);
        int i = list.indexOf(ps4);
        boolean i1 = list.contains(null);
        list.contains(ps4);
        for (Product nodeList : list) {

        }


    }


    }
