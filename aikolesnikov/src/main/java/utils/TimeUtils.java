package utils;

/**
 * Created by gorobec on 03.06.17.
 */
public class TimeUtils {

    public static void countTime (TimeAction action){

        long start = System.currentTimeMillis();

        action.run();

        long finish = System.currentTimeMillis();
        System.out.println("Time - " + (finish - start));
    }

}
