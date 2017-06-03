package week1.day2;

public class TestGroupRemoveMethod {
    public static void main(String[] args) {
        // 1st case
        Group aco20 = new Group(20, 4);
        aco20.addStudent(new Student("Sebastian", "Vettel", 27));
        aco20.addStudent(new Student("Pascal", "Wehrlein", 23));
        aco20.addStudent(new Student("Vallteri", "Bottas", 26));
        aco20.addStudent(new Student("Kimi", "Raikkonen", 31));
        System.out.println(aco20.asString());

        Student toRemove = new Student("Pascal", "Wehrlein", 23);
        boolean actual = aco20.removeStudent(toRemove);
        boolean expected = true;
        System.out.printf("Remove result - %b, expected - %b, actual - %b\n", actual==expected, expected, actual);
        System.out.println();
        System.out.println("Group after removing actual student:");
        System.out.println(aco20.asString());

        // 2nd case (removing 'null' student)
        Student nullStudent = null;
        actual = aco20.removeStudent(nullStudent);
        expected = false;
        System.out.printf("Remove result - %b, expected - %b, actual - %b\n", actual==expected, expected, actual);

        // 3rd case (removing some another student)
        Student errorStudent = new Student("Max", "Ferstappen", 19);
        actual = aco20.removeStudent(errorStudent);
        expected = false;
        System.out.printf("Remove result - %b, expected - %b, actual - %b\n", actual==expected, expected, actual);

    }
}
