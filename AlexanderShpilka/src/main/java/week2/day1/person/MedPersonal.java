package week2.day1.person;

public abstract class MedPersonal extends Person {

    public MedPersonal(String name, String surname, String middlename, int age, char sex) {
        super(name, surname, middlename, age, sex);
    }

    public abstract void work();
}
