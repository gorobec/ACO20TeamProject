package week5.io;

import java.io.*;

/**
 * Created by gorobec on 11.06.17.
 */
public class IOIntro {
    public static void main(String[] args) {
        /*OutputStream os = null;
        try {
            os = new FileOutputStream("./Yevhen/src/main/resources/dir/Intro.txt");

            String s = "Hello world!";
            byte[] array = s.getBytes();
            os.write(array);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if(os != null) {
                    os.flush();
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        try(OutputStream os =
                    new FileOutputStream("./Yevhen/src/main/resources/dir/Intro.txt")) {


            String s = "Hello world!";
            byte[] array = s.getBytes();
            os.write(array);


        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            InputStream is = new FileInputStream("./Yevhen/src/main/resources/dir/Intro.txt");

            int readByte;
            while ((readByte = is.read()) != -1){
                System.out.print((char) readByte);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
