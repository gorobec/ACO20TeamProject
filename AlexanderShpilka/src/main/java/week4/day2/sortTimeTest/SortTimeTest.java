package week4.day2.sortTimeTest;
import utils.Sort;
import java.util.Arrays;

public class SortTimeTest {
    public static void main(String[] args) {

        Double[] array = new Double[100_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 1_000_000;
        }

        TimeUtils bubbleSort = new TimeUtils();
        long bubbleSortTime = bubbleSort.countTime(new TimeAction() {
            @Override
            public void run() {
                Sort.bubbleSort(Arrays.copyOf(array, array.length));
            }
        });
        System.out.println("Bubble sort time: " + bubbleSortTime);

        TimeUtils selectionSort = new TimeUtils();
        long selectionSortTime = selectionSort.countTime(new TimeAction() {
            @Override
            public void run() {
                Sort.selectionSort(Arrays.copyOf(array, array.length));
            }
        });
        System.out.println("Selection sort time: " + selectionSortTime);

        TimeUtils insertionSort = new TimeUtils();
        long insertionSortTime = insertionSort.countTime(new TimeAction() {
            @Override
            public void run() {
                Sort.insertionSort(Arrays.copyOf(array, array.length));
            }
        });
        System.out.println("Insertion sort time: " + insertionSortTime);
    }
}
