package tests;

import utils.ArrayUtils;
import utils.TimeAction;
import utils.TimeUtils;

/**
 * Created by macbook on 13.06.17.
 */
public class SortTests {
    public static void main(String[] args) {
        Integer[] array1 = new Integer[100_000];
        Integer[] array2 = new Integer[100_000];
        Integer[] array3 = new Integer[100_000];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = array2[i] = array3[i] = (int) (Math.random() * 100);
        }
        System.out.println("Buble");
        TimeUtils.countTime(() ->
                ArrayUtils.bubbleSort(array1));
        System.out.println("Select");
        TimeUtils.countTime(() ->
                ArrayUtils.selectionSort(array2));
        System.out.println("Insert");
        TimeUtils.countTime(() ->
                ArrayUtils.insertSort(array3));
    }

}
