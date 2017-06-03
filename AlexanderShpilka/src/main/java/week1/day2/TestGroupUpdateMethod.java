package week1.day2;

public class TestGroupUpdateMethod {
    public static void main(String[] args) {
        // 1st case
        Group aco20 = new Group(20, 4);
        aco20.addStudent(new Student("Sebastian", "Vettel", 27));
        aco20.addStudent(new Student("Pascal", "Wehrlein", 23));
        aco20.addStudent(new Student("Vallteri", "Bottas", 26));
        aco20.addStudent(new Student("Kimi", "Raikkonen", 31));
        System.out.println(aco20.asString());

        Student toUpdate = new Student("Daniel", "Riccardo", 27);
        boolean actual = aco20.updateStudent(1, toUpdate);
        boolean expected = true;
        System.out.printf("Update() result - %b, expected - %b, actual - %b", actual==expected, expected, actual);
        System.out.println();
        System.out.println(aco20.asString());

        // 2nd case (passing wrong index)
        actual = aco20.updateStudent(4, toUpdate);
        expected = false;
        System.out.printf("Update() result - %b, expected - %b, actual - %b", actual==expected, expected, actual);
    }
}
