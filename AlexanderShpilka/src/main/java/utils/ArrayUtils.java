package utils;

import java.util.List;

public class ArrayUtils {
    // selection sort
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minNumber = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minNumber) {
                    minNumber = array[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                int tmp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = tmp;
            }
        }
    }

    // bubble sort
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    // display array
    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static boolean binarySearch(Object[] array, Object o){
        if (array.length == 0) return false;
        int start = 0;
        int end = array.length - 1;
        int result;

        while (start <= end) {
            int middle = (start + end) / 2;
            Comparable comparable = (Comparable) o;
            result = comparable.compareTo(array[middle]);
            if (result > 0) {
                start = middle + 1;
            } else if (result < 0) {
                end = middle - 1;
            } else return true;
        }

        return false;
    }

    // binary search
    public static boolean binarySearch(int[] sortedArray, int i) {
        int start = 0;
        int end = sortedArray.length - 1;
        int mid;

        while (true) {
            mid = (start + end) / 2;

            if (sortedArray[mid] == i) return true;
            else if (start > end) return false;
            else {
                if (i < sortedArray[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
    }

    public static <T extends Comparable<T>> boolean binarySearch(List<T> list, T object) {
        int start = 0;
        int end = list.size() - 1;
        int mid;

        while (true) {
            mid = (start + end) / 2;

            if (list.get(mid).compareTo(object) == 0) return true;
            else if (start > end) return false;
            else {
                if (list.get(mid).compareTo(object) > 0) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
    }
}
