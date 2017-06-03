package test.week1.day2;

import week1.day1.Student;
import week1.day2.Group;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class GroupTest {

    private Group group;



    public void testAdd1(){
        Student student = new Student("Maxim", "Muzichenko", 29);
        group = new Group(20, new Student[5]);

        boolean expected = true;
        boolean actual = group.addStudent(student);

        System.out.printf("Test %s result - %b, expected - %b,  actual - %b\n", Thread.currentThread().getStackTrace()[1].getMethodName(), expected == actual, expected, actual);

    }

    public void testAdd2(){
        group = new Group(20, new Student[5]);
        boolean expected = false;
        boolean actual = group.addStudent(null);

        System.out.printf("Test result - %b, expected - %b,  actual - %b\n", expected == actual, expected, actual);

    }
    public void testAdd3(){
        Student student = new Student("Maxim", "Muzichenko", 29);
        group = new Group(20, new Student[0]);
        boolean expected = false;
        boolean actual = group.addStudent(student);

        System.out.printf("Test result - %b, expected - %b,  actual - %b\n", expected == actual, expected, actual);

    }
    public void testAdd4(){
        Student student = new Student("Maxim", "Muzichenko", 29);
        Student student2 = new Student("Oleh", "Muzichenko", 29);
        Student student3 = new Student("Oleh", "Muzichenko", 29);
        group = new Group(20, new Student[]{student, student2});
        boolean expected = false;
        boolean actual = group.addStudent(student3);

        System.out.printf("Test result - %b, expected - %b,  actual - %b\n", expected == actual, expected, actual);

    }

}
