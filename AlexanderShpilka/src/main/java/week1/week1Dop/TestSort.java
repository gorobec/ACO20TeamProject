package week1.week1Dop;
import utils.ArrayUtils;

public class TestSort {
    public static void main(String[] args) {
        int[] array1 = new int[] {8, 2, 7, 1, 9, 4, 6, 8, 5, 3, 0, 3, 5, 0, 8, 1, 5, 4, 9, 6, 2, 4};
        ArrayUtils.selectionSort(array1);
        ArrayUtils.displayArray(array1);

        int[] array2 = new int[] {8, 2, 7, 1, 9, 4, 6, 8, 5, 3, 0, 3, 5, 0, 8, 1, 5, 4, 9, 6, 2, 4};
        ArrayUtils.bubbleSort(array2);
        ArrayUtils.displayArray(array2);
    }
}
