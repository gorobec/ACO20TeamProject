package design_patterns.dao_mvc.register_form.dao;

import design_patterns.dao_mvc.register_form.model.User;

/**
 * Created by gorobec on 11.06.17.
 */
public interface UserDao {

    boolean createUser(User user);
    User readUser(User user);
    User updateUser(User user, User newUser);
    boolean deleteUser(User user);

}
