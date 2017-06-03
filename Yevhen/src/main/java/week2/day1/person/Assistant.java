package week2.day1.person;

/**
 * Created by gorobec on 20.05.17.
 */
public class Assistant extends MedPersonal {
    public Assistant(String name, String surname, String middleName, int age, char sex) {
        super(name, surname, middleName, age, sex);
    }

    @Override
    public void work() {
        System.out.println("Do assistant staff");
    }
}
