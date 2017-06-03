package week1.day2;

import org.junit.Assert;
import org.junit.Test;
import week1.day1.Student;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class GroupTest {

    private Group group;


    @Test
    public void testAdd1(){
        Student student = new Student("Maxim", "Muzichenko", 29);
        group = new Group(20, new Student[5]);


        Assert.assertTrue(group.addStudent(student));


    }

    @Test
    public void testAdd2(){
        group = new Group(20, new Student[5]);

        Assert.assertFalse(group.addStudent(null));

    }

    @Test
    public void testAdd3(){
        Student student = new Student("Maxim", "Muzichenko", 29);
        group = new Group(20, new Student[0]);

        Assert.assertFalse(group.addStudent(student));


    }

    @Test
    public void testAdd4(){
        Student student = new Student("Maxim", "Muzichenko", 29);
        Student student2 = new Student("Oleh", "Muzichenko", 29);
        Student student3 = new Student("Oleh", "Muzichenko", 29);

        group = new Group(20, new Student[]{student, student2});

        Assert.assertFalse(group.addStudent(student3));


    }

}
