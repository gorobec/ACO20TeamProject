package design_patterns.dao_mvc.register_form.view;

import design_patterns.dao_mvc.register_form.utils.FileUtils;

import java.util.Scanner;

/**
 * Created by gorobec on 11.06.17.
 */
public class ConsoleView {
    private static final String MENU_PATH = "./Yevhen/src/main/resources/RegistrationMenu.txt";

    private Scanner sc;

    public ConsoleView() {
        sc = new Scanner(System.in);
    }

    public int greeting(){
        System.out.println("**** Welcome to registration system!!! ****");
        FileUtils.readTextFile(MENU_PATH);
        return sc.nextInt();

    }

    public String enterName(){
        System.out.print("Enter user name: ");
        return sc.next();
    }

    public String enterSurname(){
        System.out.print("Enter user surname: ");
        return sc.next();
    }

    public String enterPhoneNumber(){
        System.out.print("Enter user phone number: ");
        return sc.next();
    }

    public int enterAge(){
        System.out.print("Enter user age: ");
        return sc.nextInt();
    }


    public void successfulCreateOperation() {
        System.out.println("User was created");
    }

    public void unsuccessfulCreateOperation() {
        System.out.println("User was not created");
    }

    public void successfulDeleteOperation() {
        System.out.println("User was delete");

    }

    public void unsuccessfulDeleteOperation() {
        System.out.println("User was not deleted");

    }

}
