package week5.file;

import utils.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by gorobec on 10.06.17.
 */
public class ClassFile {
    public static void main(String[] args) throws IOException {
        File file = new File("./Yevhen/src/main/resources/dir");

        System.out.println(file.getName());
        System.out.println(file.exists());
        System.out.println(file.mkdir());

//        System.out.println(FileUtils.removeDirectory(file.getPath()));
    }
}
