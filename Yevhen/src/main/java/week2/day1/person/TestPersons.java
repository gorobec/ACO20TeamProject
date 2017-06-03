package week2.day1.person;

/**
 * Created by gorobec on 20.05.17.
 */
public class TestPersons {
    public static void main(String[] args) {
       /* Person person = new Person("Jack", "Smith", "Junior", 19, 'M');
        Person person2 = new Person("Ann", "Smith", "Junior", 21, 'W');
        Person person3 = new Person("Bob", "Smith", "Senior", 62, 'M');
        Person person4 = new Person("Bill", "Smith", "Middle", 42, 'M');*/


        Patient patient = new Patient("Bob", "Smith", "Senior", 62, 'M', "Health", 70, 180);
        Person patient2 = new Patient("Jeremy", "Smith", "Senior", 48, 'M', "Ill", 73, 175);
        Nurse nurse = new Nurse("Mary", "Smith", "Middle", 25, 'W');
        MedPersonal assistant = new Assistant("John", "Smith", "Middle", 32, 'M');


//        MedPersonal[] medPersonals = {nurse, assistant};


        MedPersonal doctor = new Doctor("Dan", "Smith", "Middle", 40, 'M', new MedPersonal[0]);


        /*System.out.println(person.asString());
        System.out.println(person2.asString());
        System.out.println(person3.asString());
        System.out.println(person4.asString());*/
        System.out.println(patient.toString());
        System.out.println(patient2);
        System.out.println(nurse);
        System.out.println(assistant);
        System.out.println(doctor);

        nurse.work();
        assistant.work();
        doctor.work();
    }
}
