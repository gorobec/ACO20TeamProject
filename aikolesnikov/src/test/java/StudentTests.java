import org.junit.Assert;
import org.junit.Test;

/**
 * tests for Student class
 */
public class StudentTests {

    @Test
    public void checkStudentsCreation() {
        Student st1 = new Student();
        Student st2 = new Student("st2_name");
        Student st3 = new Student("st3_name", null);
        Student st4 = new Student("st4_name", "st4_surname", 17);

        Assert.assertTrue(st1.getName() == null);
        Assert.assertTrue(st2.getName().equals("st2_name"));
        Assert.assertTrue(st3.getSurname() == null);
        Assert.assertTrue(st4.getName().equals("st4_name"));
        Assert.assertTrue(st4.getSurname().equals("st4_surname"));
        Assert.assertTrue(st4.getAge()==17);

        Assert.assertTrue(st4.toString().equals("Student: {st4_name st4_surname}"));

        Student st5 = new Student("st4_name", "st4_surname", 17);
        Assert.assertFalse(st1.equals(st5));
        Assert.assertFalse(st4.equals(null));
        Assert.assertTrue(st4.equals(st5));

    }
}
