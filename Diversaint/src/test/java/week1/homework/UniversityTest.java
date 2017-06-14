package week1.homework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by macbook on 14.06.17.
 */
public class UniversityTest {
    private Student student1;
    private Student student2;
    private Student student3;
    private Student student4;
    private Group group1;
    private Group group2;
    private Group group3;
    private University university;
    private University cloneUniver;

    @Before
    public void setUp() throws Exception {
        student1 = new Student("Vasya", "Puppkin", 30);
        student2 = new Student("Petya", "Ivanov", 35);
        student3 = new Student("Vasilii", "Zapupkin", 23);
        student4 = new Student("Vanya", "Typi", 56);

        group2 = new Group(2, new Student[]{student3, student4});
        group1 = new Group(1, new Student[]{student1});
        group3 = new Group(3, new Student[]{new Student("Ivan", "Ivanov", 15),
                                                        new Student("Ivan1", "Ivanov2", 16)});
        university = new University("university", new Group[]{group1, group2});

    }

    @Test
    public void test_cloning() throws Exception {
        cloneUniver = university.clone();
        assertTrue(university.equals(cloneUniver));
        student1.setName("NotClone");
        student2.setName("NotClone");
        assertFalse(university.equals(cloneUniver));
        student3.setName("NotClone");
        student4.setName("NotClone");
        assertFalse(university.equals(cloneUniver));
        group1.addStudent(student2);
        university.addGroup(group3);
        assertFalse(university.equals(cloneUniver));
    }

}