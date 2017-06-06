package week4.day1.string;

import utils.TimeUtils;

/**
 * Created by gorobec on 03.06.17.
 */
public class StringBufferTime {
    public static void main(String[] args) {

        TimeUtils.countTime(() -> {
                StringBuffer buffer = new StringBuffer("");

                for (int i = 0; i < 10_000_000; i++) {
                    buffer.append(i);
                }
                String s = buffer.toString();
            return;
        });
    }
}
