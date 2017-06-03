package week2.day1.person;

public class Doctor extends MedPersonal {
    private MedPersonal[] medPersonals;

    public Doctor(String name, String surname, String middlename, int age, char sex, MedPersonal[] medPersonals) {
        super(name, surname, middlename, age, sex);
        this.medPersonals = medPersonals;
    }

    @Override
    public void work() {

    }
}
