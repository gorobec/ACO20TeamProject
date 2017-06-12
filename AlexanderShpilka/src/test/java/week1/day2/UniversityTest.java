package week1.day2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UniversityTest {
    @Test
    public void test_clone_of_university() throws CloneNotSupportedException{

        University university = new University("Red", 2);

        Student st1 = new Student("Jim", "Beam", 32);
        Student st2 = new Student("Richard", "Hennessy", 28);
        Student st3 = new Student("Jack", "Daniels", 25);
        Student st4 = new Student("Johnny", "Walker", 22);

        Group alcoholics1 = new Group(13, 2);
        Group alcoholics2 = new Group(17, 2);

        alcoholics1.addStudent(st1);
        alcoholics1.addStudent(st2);
        alcoholics2.addStudent(st3);
        alcoholics2.addStudent(st4);

        university.addGroup(alcoholics1);
        university.addGroup(alcoholics2);

        University universityClone = university.clone();
        Group[] groupsClone = universityClone.getGroups();
        Group groupClone1 = groupsClone[0];
        Group groupClone2 = groupsClone[1];
        Student[] studentsClone1 = groupClone1.getStudents();
        Student[] studentsClone2 = groupClone2.getStudents();
        Student cl1 = studentsClone1[0];
        Student cl2 = studentsClone1[1];
        Student cl3 = studentsClone2[0];
        Student cl4 = studentsClone2[1];

        // 1st group - change name, surname and age of students
        st1.setName("Michael");
        st1.setSurName("Jordan");
        st1.setAge(40);
        st2.setName("Skotti");
        st2.setSurName("Pippen");
        st2.setAge(43);

        assertEquals("Michael", st1.getName());
        assertEquals("Jordan", st1.getSurName());
        assertEquals(40, st1.getAge());
        assertEquals("Skotti", st2.getName());
        assertEquals("Pippen", st2.getSurName());
        assertEquals(43, st2.getAge());

        assertEquals("Jim", cl1.getName());
        assertEquals("Beam", cl1.getSurName());
        assertEquals(32, cl1.getAge());
        assertEquals("Richard", cl2.getName());
        assertEquals("Hennessy", cl2.getSurName());
        assertEquals(28, cl2.getAge());

        // 2nd group - change group number
        alcoholics2.setGroupNumber(66);

        assertEquals(66, alcoholics2.getGroupNumber());
        assertEquals(17, groupClone2.getGroupNumber());

        // change university name
        university.setName("Black");

        assertEquals("Black", university.getName());
        assertEquals("Red", universityClone.getName());
    }
}
