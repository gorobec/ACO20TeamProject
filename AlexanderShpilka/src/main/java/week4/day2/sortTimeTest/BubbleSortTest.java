package week4.day2.sortTimeTest;

import utils.Sort;

public class BubbleSortTest {
    public static void main(String[] args) {

        Integer[] array = new Integer[100_000];

        // fill array
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1_000_000);
        }

        TimeUtils.countTime(new TimeAction() {
            @Override
            public void run() {
                Sort.bubbleSort(array);
            }
        });
    }
}
