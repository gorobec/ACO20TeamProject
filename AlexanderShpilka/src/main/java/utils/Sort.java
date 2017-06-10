package utils;

public class Sort {

    // bubble sort
    public static<T extends Comparable<T>> void bubbleSort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].compareTo(array[j+1]) > 0) {
                    T tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    // selection sort
    public static<T extends Comparable<T>> void selectionSort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            T minNumber = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(minNumber) < 0) {
                    minNumber = array[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                T tmp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = tmp;
            }
        }
    }

    // insertion sort
    public static<T extends Comparable<T>> void insertionSort(T[] array) {
/**
 * @param inner index used to move left inside partially sorted array
 * @param marker index used to pull out every element of array (excluding the first)
 * @param tmp variable to store marked element of array
 */
        int inner;

        for (int marker = 1; marker < array.length; marker++) {
            T tmp = array[marker];
            inner = marker;

            while (inner > 0 && array[inner - 1].compareTo(tmp) >= 0) {
                array[inner] = array[inner - 1];
                --inner;
            }

            array[inner] = tmp;
        }
    }
}
