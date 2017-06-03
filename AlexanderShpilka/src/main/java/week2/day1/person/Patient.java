package week2.day1.person;

public class Patient extends Person {
    private String diagnose;
    private double weight;
    private double height;

    public Patient(String name, String surname, String middlename, int age, char sex,
                   String diagnose, double weight, double height) {
        super(name, surname, middlename, age, sex);
        this.diagnose = diagnose;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String asString() {
        return "";
    }
}
