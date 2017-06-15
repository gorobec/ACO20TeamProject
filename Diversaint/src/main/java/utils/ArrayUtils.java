package utils;


import java.util.ArrayList;
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


    public static <T extends Comparable<T>> void mergeSort(T[] array) {
        if (array.length < 2) throw new IndexOutOfBoundsException("Length of array is 0 ro 1");
        int leftFrom = 0;
        int leftTo = array.length / 2;
        int rightFrom = leftTo + 1;
        int rightTo = array.length - 1;
        mergeSort(array, leftFrom, leftTo);
        mergeSort(array, rightFrom, rightTo);


    }
    private static <T extends Comparable<T>> void mergeSort(T[] array, int from, int to) {
        int leftFrom = from;
        int leftTo;
        int rightFrom;
        int rightTo = to;
        if (to > from) {
            leftTo = (from + to) / 2;
            rightFrom = leftTo + 1;
            mergeSort(array, leftFrom, leftTo);
            mergeSort(array, rightFrom, rightTo);

            T[] tempArray;
            tempArray = (T[]) new Object[to - from + 1];
            int curPosition = leftFrom;
            while ((leftFrom - leftTo) * (rightFrom - rightTo) != 0){
                if (array[leftFrom].compareTo(array[rightFrom]) < 0)
                    tempArray[curPosition++] = array[leftFrom++];
                else
                    tempArray[curPosition++] = array[rightFrom++];
            }
            if (leftFrom < leftTo)
                tempArray[curPosition++] = array[leftFrom++];
            if (rightFrom < rightTo)
                tempArray[curPosition++] = array[rightFrom++];
            for (int i = 0; i < tempArray.length; i++) {
                array[rightTo] = tempArray[rightTo];
                rightTo--;
            }
        }

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
