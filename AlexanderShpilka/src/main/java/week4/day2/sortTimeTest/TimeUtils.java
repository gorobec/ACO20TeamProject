package week4.day2.sortTimeTest;

public class TimeUtils {
    public long countTime(TimeAction action) {
        long start = System.currentTimeMillis();
        action.run();
        long finish = System.currentTimeMillis();
        return finish - start;
//        System.out.println("Time elapsed: " + (finish - start));
    }
}
