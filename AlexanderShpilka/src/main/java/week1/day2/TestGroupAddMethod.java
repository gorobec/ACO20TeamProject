package week1.day2;

public class TestGroupAddMethod {
    public static void main(String[] args) {

        // 1st case
        Group aco20 = new Group(20, 4);

        boolean actual = aco20.addStudent(new Student("Steven", "Spilberg", 60));
        boolean expected = true;
        System.out.printf("Add() result - %b, expected - %b, actual - %b\n", actual==expected, expected, actual);

        aco20.addStudent(new Student("Robert", "Zemekis", 50));
        aco20.addStudent(new Student("Woody", "Allen", 55));
        aco20.addStudent(new Student("Frank", "Darabount", 45));

        // adding the 5th student (out of groupSize)
        actual = aco20.addStudent(new Student("Martin", "Skorseze", 65));
        expected = true;
        System.out.printf("Add() result - %b, expected - %b, actual - %b\n", actual==expected, expected, actual);

        // 2nd case (adding 'null' student)
        Group aco21 = new Group(21, 4);
        Student nullStudent = null;

        actual = aco21.addStudent(nullStudent);
        expected = false;
        System.out.printf("Add() result - %b, expected - %b, actual - %b\n", actual==expected, expected, actual);

        // 3rd case (adding student when groupSize = 0)
        Group zeroGroup = new Group(22, 0);
        Student poorStudent = new Student("Freddy", "Kruger", 44);
        actual = zeroGroup.addStudent(poorStudent);
        expected = true;
        System.out.printf("Add() result - %b, expected - %b, actual - %b\n", actual==expected, expected, actual);

        // 4th case (duplicates)
        Group duplGroup = new Group(24, 3);
        duplGroup.addStudent(new Student("Paolo", "Maldini", 42));
        duplGroup.addStudent(new Student("Francesco", "Totti", 40));
        Student duplStudent = new Student("Francesco", "Totti", 40);
        actual = duplGroup.addStudent(duplStudent);
        expected = false;
        System.out.printf("Add() result - %b, expected - %b, actual - %b\n", actual==expected, expected, actual);

        // 5th case (testing size)
        Group testingSizeGroup = new Group(23, 4);
        Student st1 = new Student("Lewis", "Hamilton", 30);
        Student st2 = new Student("Jenson", "Button", 35);
        Student st3 = new Student("Filippe", "Massa", 37);
        testingSizeGroup.addStudent(st1);
        testingSizeGroup.addStudent(st2);
        testingSizeGroup.addStudent(st3);
        int actualSize = testingSizeGroup.getSize();
        int expectedSize = 3;
        System.out.printf("Size result - %b, expected - %d, actual - %d\n", actualSize==expectedSize, expectedSize, actualSize);
    }
}