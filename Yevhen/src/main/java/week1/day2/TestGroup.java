package week1.day2;

import week1.day1.Student;

import java.util.Arrays;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class TestGroup {
    public static void main(String[] args) {

        Student student1 = new Student("Maxim", "Muzichenko1", 29);
        Student student4 = new Student("Maxim", "Muzichenko", 29);
        Student student2 = new Student("Maxim", "Muzichenko", 30);
        Student student3 = new Student("Maxim", "Muzichenko", 29);

        Student[] students = {student1, student2, student3};

        System.out.println(Arrays.toString(students));

        Group group = new Group(20, 8);
        Group group2 = new Group(20, students);
//        System.out.println(group.addStudent(student1));
        System.out.println(group2);
        group2.sort();
//        Arrays.sort(students);


        System.out.println(group2);


//        System.out.println(group2.asString());
//        System.out.println(group.asString());
//
//        System.out.println(student1.name);
//        System.out.println(students[0].name);
//        System.out.println(group2.getStudents()[0].name);
//
//        group2.students[0].name = "Oleh";
//        System.out.println(student1.name);
//        System.out.println(students[0].name);
//        System.out.println(group2.students[0].name);
//        group2.students[0] = new Student("Masha", "Medved'", 13);
//
//        System.out.println(student1.name);
//        System.out.println(students[0].name);
//        System.out.println(group2.students[0].name);
    }
}
