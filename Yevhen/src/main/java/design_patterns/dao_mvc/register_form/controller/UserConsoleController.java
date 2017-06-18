package design_patterns.dao_mvc.register_form.controller;

import design_patterns.dao_mvc.register_form.dao.UserDao;
import design_patterns.dao_mvc.register_form.model.User;
import design_patterns.dao_mvc.register_form.view.ConsoleView;

import javax.swing.text.View;

/**
 * Created by gorobec on 11.06.17.
 */
public class UserConsoleController {
    private ConsoleView view;
    private UserDao userDao;



    public UserConsoleController(UserDao userDao, ConsoleView view) {
        this.userDao = userDao;
        this.view = view;
    }

    public UserConsoleController(UserDao userDao) {
        this.userDao = userDao;
        this.view = new ConsoleView();
    }


    public void startApp(){

           int choice = view.greeting();
            switch (choice){
                case 1:
                    create();
                    break;
                case 2:
                    delete();
                    break;
                default:
                    System.out.println("Not supported operation!");
                    break;
            }
    }

    private void delete() {
        User user = getUser();
        if(userDao.deleteUser(user)){
            view.successfulDeleteOperation();
        } else {
            view.unsuccessfulDeleteOperation();
        }


    }

    private void create() {
        User user = getUser();

        if(userDao.createUser(user)){
            view.successfulCreateOperation();
        } else {
            view.unsuccessfulCreateOperation();
        }

    }

    private User getUser() {
        String name = view.enterName();
        String surname = view.enterSurname();
        int age = view.enterAge();
        String phoneNumber = view.enterPhoneNumber();

        return new User(name, surname, phoneNumber, age);
    }
}
