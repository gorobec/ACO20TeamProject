package binary_search;

import day1.Student;

import java.util.Arrays;

/**
 * Created by gorobec on 04.06.17.
 */
public class TestSearch {
    public static void main(String[] args) {
        Student student1 = new Student("Maxim", "Muzichenko1", 29);
        Student student4 = new Student("Maxim", "Muzichenko", 29);
        Student student2 = new Student("Maxim", "Muzichenko", 30);
        Student student3 = new Student("Maxim", "Muzichenko", 29);

        Student[] students = {null, student1, student2, null, student3};

        System.out.println(Arrays.binarySearch(null, student4));
    }
}
