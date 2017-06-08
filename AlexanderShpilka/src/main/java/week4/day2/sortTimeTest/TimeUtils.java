package week4.day2.sortTimeTest;

public class TimeUtils {
    public static void countTime(TimeAction action) {
        long start = System.currentTimeMillis();
        action.run();
        long finish = System.currentTimeMillis();
        System.out.println("Time elapsed: " + (finish - start));
    }
}
