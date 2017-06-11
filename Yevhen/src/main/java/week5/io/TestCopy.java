package week5.io;

import utils.FileUtils;
import utils.TimeUtils;

/**
 * Created by gorobec on 11.06.17.
 */
public class TestCopy {
    public static void main(String[] args) {

        System.out.print("Bytes copy -> ");
        TimeUtils.countTime(() -> {
            FileUtils.copyFiles("./Yevhen/src/main/resources/dir/Intro.txt", "./Yevhen/src/main/resources/dir/Intro(copy).txt");
        });

        System.out.print("Array of bytes copy -> ");
        TimeUtils.countTime(() -> {
            FileUtils.copyFilesArray("./Yevhen/src/main/resources/dir/Intro.txt", "./Yevhen/src/main/resources/dir/Intro(copy2).txt");
        });

        System.out.print("Buffer of bytes copy -> ");
        TimeUtils.countTime(() -> {
            FileUtils.copyFilesBuffer("./Yevhen/src/main/resources/dir/Intro.txt", "./Yevhen/src/main/resources/dir/Intro(copy3).txt");
        });

        System.out.print("Buffer of byte array copy -> ");
        TimeUtils.countTime(() -> {
            FileUtils.copyFilesBufferArray("./Yevhen/src/main/resources/dir/Intro.txt", "./Yevhen/src/main/resources/dir/Intro(copy4).txt");
        });
    }
}
