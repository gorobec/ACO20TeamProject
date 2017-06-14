package utils;

import java.util.Comparator;

/**
 * Created by macbook on 04.06.17.
 */
public class ArrayUtils {


    public static <T extends Comparable<T>> void bubbleSort(T[] array){
        T temp;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0){
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static <T extends Comparable<T>> void selectionSort(T[] array){
        int minEl;
        for (int curEl = 0; curEl < array.length; curEl++) {
            minEl = curEl;
            for (int i = curEl + 1; i < array.length; i++) {
                if (array[minEl].compareTo(array[i]) > 0){
                    minEl = i;
                }
            }
            swap(array, curEl, minEl);
        }
    }

    public static <T extends  Comparable<T>> void insertSort(T[] array){
        for (int curEl = 1; curEl < array.length; curEl++) {
            int i = curEl;
            while (i > 0 && array[i - 1].compareTo(array[curEl]) >= 0){
                    swap(array, curEl, i - 1);
                    i--;
                    curEl--;

                }

        }
    }

    private static <T extends Comparable<T>> void swap(T[] array, int left, int right) {
        T temp;
        temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static <T extends Comparable<T>> boolean binarySearch(T[] array, T object){
        int start = 0;
        int end = array.length - 1;
        int middle;
        int result;
        while (start <= end){
            middle = (start + end) >> 1;
            result = object.compareTo(array[middle]);
            if (result > 0)
                start = middle + 1;
            else if (result < 0)
                end = middle - 1;
            else return true;
        }
        return false;
    }
    public static <T> boolean binarySearch(T[] array, T object, Comparator<T> comparator){
        int start = 0;
        int end = array.length - 1;
        int middle;
        int result;
        while (start <= end){
            middle = (start + end) >> 1;
            result = comparator.compare(object, array[middle]);
            if (result > 0)
                start = middle + 1;
            else if (result < 0)
                end = middle - 1;
            else return true;
        }
        return false;
    }


}
