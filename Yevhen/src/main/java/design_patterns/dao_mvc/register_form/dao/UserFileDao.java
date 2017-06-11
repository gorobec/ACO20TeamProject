package design_patterns.dao_mvc.register_form.dao;

import design_patterns.dao_mvc.register_form.model.User;
import design_patterns.dao_mvc.register_form.utils.FileUtils;

import java.util.ArrayList;

/**
 * Created by gorobec on 11.06.17.
 */
public class UserFileDao implements UserDao {

    private static final String LIST_PATH =  "./Yevhen/src/main/resources/Uesrs.txt";
    @Override
    public boolean createUser(User user) {
//        check if exist
        ArrayList<User> list = FileUtils.getListOfUsersFromFile(LIST_PATH);

        if(list == null){
            list = new ArrayList<>();
        }

        if(list.contains(user)){
            return false;
        } else {
            list.add(user);
        }
//        write to db

        return FileUtils.writeUsersToFile(LIST_PATH, list);
    }

    @Override
    public User readUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user, User newUser) {
        return null;
    }

    @Override
    public boolean deleteUser(User user) {
        ArrayList<User> list = FileUtils.getListOfUsersFromFile(LIST_PATH);

        if(list == null){
            return false;
        }

        if(list.contains(user)){
            list.remove(user);
            return FileUtils.writeUsersToFile(LIST_PATH, list);
        } else {
            return false;
        }
    }
}
