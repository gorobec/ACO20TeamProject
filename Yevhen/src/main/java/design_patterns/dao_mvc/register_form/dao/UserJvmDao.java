package design_patterns.dao_mvc.register_form.dao;

import design_patterns.dao_mvc.register_form.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gorobec on 11.06.17.
 */
public class UserJvmDao implements UserDao {

    private List<User> users = new ArrayList<>();

    @Override
    public boolean createUser(User user) {
        if(users.contains(user)) return false;
        return users.add(user);
    }

    @Override
    public User readUser(User user) {
        int userIdx = users.indexOf(user);
        if(userIdx == -1) return null;
        return users.get(userIdx);
    }

    @Override
    public User updateUser(User user, User newUser) {
        int userIdx = users.indexOf(user);
        if(userIdx == -1) return null;
        return users.set(userIdx, newUser);
    }

    @Override
    public boolean deleteUser(User user) {
        return users.remove(user);
    }
}
