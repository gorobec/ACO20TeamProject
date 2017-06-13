package design_patterns.dao_mvc.register_form.utils;

import design_patterns.dao_mvc.register_form.model.User;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by gorobec on 11.06.17.
 */
public class FileUtils {


    public static void readTextFile(String path){
        try (InputStream is = new FileInputStream(path)){
            int readByte;
            while ((readByte = is.read()) != -1){
                System.out.print((char) readByte);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<User> getListOfUsersFromFile(String listPath) {

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(listPath))){

            return (ArrayList<User>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean writeUsersToFile(String listPath, ArrayList<User> users) {

        try (ObjectOutputStream ois = new ObjectOutputStream(
                new FileOutputStream(listPath))){

            ois.writeObject(users);
            return true;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
