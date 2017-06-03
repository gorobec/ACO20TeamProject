package week1.day2.doctors;

public class Surgeon implements Doctor {

    private String name;
    private String hospital;
    private int yearsExperience;
    private int salary;

    Surgeon(String name, String hospital, int yearsExperience, int salary) {
        this.name = name;
        this.hospital = hospital;
        this.yearsExperience = yearsExperience;
        this.salary = salary;
    }

    public void treatPatient() {
        System.out.println("I help my patients");
    }

    public void confirmQualification() {
        System.out.println("I must regularly confirm my qualification");
    }

    void makeOperation() {
        System.out.println("I make operations");
    }
}
