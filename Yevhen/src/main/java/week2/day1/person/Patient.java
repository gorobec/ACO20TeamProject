package week2.day1.person;

/**
 * Created by gorobec on 20.05.17.
 */
public class Patient extends Person {
    private String diagnose;
    private double weight;
    private double height;

    public Patient(String name, String surname, String middleName, int age, char sex, String diagnose, double weight, double height) {
        super(name, surname, middleName, age, sex);
        this.diagnose = diagnose;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append("diagnose='").append(diagnose).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
