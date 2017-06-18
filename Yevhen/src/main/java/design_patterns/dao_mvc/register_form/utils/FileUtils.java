package design_patterns.dao_mvc.register_form.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
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

    public static ArrayList<User> getListOfUsersFromJsonFile(String listPath) {



        Gson gson = new Gson();

        try (FileReader reader = new FileReader(listPath)){
            ArrayList<User> users = gson.fromJson(reader, new TypeToken<ArrayList<User>>(){}.getType());
            return users;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
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
    public static boolean writeUsersToJsonFile(String listPath, ArrayList<User> users) {

        GsonBuilder gb = new GsonBuilder();
        Gson gson = gb.setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(listPath)){
            gson.toJson(users, writer);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
