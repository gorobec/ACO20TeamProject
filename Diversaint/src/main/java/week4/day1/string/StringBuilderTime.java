package week4.day1.string;

import utils.TimeUtils;

/**
 * Created by gorobec on 03.06.17.
 */
public class StringBuilderTime {
    public static void main(String[] args) {

        TimeUtils.countTime(() -> {
            StringBuilder builder = new StringBuilder("");

            for (int i = 0; i < 10_000_000; i++) {
                builder.append(i);
            }
            String s = builder.toString();
        });
    }
}
