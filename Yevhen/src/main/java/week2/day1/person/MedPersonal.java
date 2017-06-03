package week2.day1.person;

/**
 * Created by gorobec on 20.05.17.
 */
public abstract class MedPersonal extends Person {

    public MedPersonal(String name, String surname, String middleName, int age, char sex) {
        super(name, surname, middleName, age, sex);
    }

    public abstract void work();
}
