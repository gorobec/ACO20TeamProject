package week2.day1.person;

/**
 * Created by gorobec on 20.05.17.
 */
public class Doctor extends MedPersonal{
    private MedPersonal[] medPersonals;

    public Doctor(String name, String surname, String middleName, int age, char sex, MedPersonal[] medPersonals) {
        super(name, surname, middleName, age, sex);
        this.medPersonals = medPersonals;
    }

    public void work(){
        System.out.println("Do doctor staff");
        for (int i = 0; i < medPersonals.length; i++) {
            medPersonals[i].work();
        }
    }
}
