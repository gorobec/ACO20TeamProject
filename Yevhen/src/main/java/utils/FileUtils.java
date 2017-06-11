package utils;

import java.io.*;

/**
 * Created by gorobec on 10.06.17.
 */
public class FileUtils {

    public static boolean removeDirectory(String path){
        File file = new File(path);

        if(file.isFile()){
            return file.delete();
        } else {
            File[] files = file.listFiles();
            for (File innerFile : files) {
                removeDirectory(innerFile.getPath());
            }
            return file.delete();
        }
    }

    public static void copyFiles(String src, String dest){
        try(InputStream is =
                    new FileInputStream(src);
            OutputStream os =
                    new FileOutputStream(dest)) {

            int readByte;
            while ((readByte = is.read()) != -1){
                os.write(readByte);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void copyFilesBuffer(String src, String dest){
        try(InputStream is = new BufferedInputStream(
                    new FileInputStream(src));
            OutputStream os = new BufferedOutputStream(
                    new FileOutputStream(dest))) {

            int readByte;
            while ((readByte = is.read()) != -1){
                os.write(readByte);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFilesArray(String src, String dest){
        try(InputStream is =
                    new FileInputStream(src);
            OutputStream os =
                    new FileOutputStream(dest)) {

            int readBytes;
            byte[] arrayOfBytes = new byte[1024];
            while ((readBytes = is.read(arrayOfBytes)) != -1){
                os.write(arrayOfBytes, 0, readBytes);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFilesBufferArray(String src, String dest){
        try(InputStream is = new BufferedInputStream(
                    new FileInputStream(src));
            OutputStream os = new BufferedOutputStream(
                    new FileOutputStream(dest))) {

            int readBytes;
            byte[] arrayOfBytes = new byte[1024];
            while ((readBytes = is.read(arrayOfBytes)) != -1){
                os.write(arrayOfBytes, 0, readBytes);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
