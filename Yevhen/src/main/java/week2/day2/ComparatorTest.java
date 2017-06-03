package week2.day2;

import week1.day1.Student;
import week1.day2.Group;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by gorobec on 21.05.17.
 */
public class ComparatorTest {
    public static void main(String[] args) {
        Student student1 = new Student("Maxim", "Muzichenko1", 29);
        Student student2 = new Student("Maxim", "Muzichenko", 30);
        Student student3 = new Student("Maxim", "Muzichenko1", 31);
        Student student4 = new Student("Maxim", "Muzichenko", 28);

        Student[] students = {student1, student2, student3, student4};

        Group group2 = new Group(20, students);

        System.out.println(group2);

//        Comparator comparator = new AgeComparator();

        group2.sort(new AgeComparator());
//        Arrays.sort(students, comparator);

        System.out.println(group2);
    }
}
