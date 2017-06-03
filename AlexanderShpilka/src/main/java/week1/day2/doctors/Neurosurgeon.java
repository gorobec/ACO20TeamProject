package week1.day2.doctors;

public class Neurosurgeon extends Surgeon implements Doctor {

    private boolean pediatricNeurosurgery;

    Neurosurgeon(String name, String hospital, int yearsExperience, int salary, boolean pediatricNeurosurgery) {
        super(name, hospital, yearsExperience, salary);
        this.pediatricNeurosurgery = pediatricNeurosurgery;
    }

    public void treatPatient() {
        System.out.println("I help my patients");
    }

    public void confirmQualification() {
        System.out.println("I must confirm my qualification every three years");
    }

    void makeOperation() {
        System.out.println("I make operations on brain");
    }
}
