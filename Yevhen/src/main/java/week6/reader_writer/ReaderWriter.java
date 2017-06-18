package week6.reader_writer;

import java.io.*;

/**
 * Created by gorobec on 17.06.17.
 */
public class ReaderWriter {


    public static void main(String[] args) {
        try(OutputStream os =
                    new FileOutputStream("./Yevhen/src/main/resources/ReadWrite.txt")) {


            String s = "Привет мир!";
            byte[] array = s.getBytes();
            os.write(array);


        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            Reader is = new FileReader("./Yevhen/src/main/resources/ReadWrite.txt");

            int readByte;
            while ((readByte = is.read()) != -1){
                System.out.print((char) readByte);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String s = br.readLine();
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
