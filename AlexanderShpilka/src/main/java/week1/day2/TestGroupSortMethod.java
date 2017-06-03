package week1.day2;

public class TestGroupSortMethod {
    public static void main(String[] args) {
        Group aco20 = new Group(20, 4);
        aco20.addStudent(new Student("Sebastian", "Vettel", 27));
        aco20.addStudent(new Student("Pascal", "Wehrlein", 23));
        aco20.addStudent(new Student("Vallteri", "Bottas", 26));
        aco20.addStudent(new Student("Kimi", "Raikkonen", 31));
        System.out.println(aco20.asString());

        aco20.sortByName();

        System.out.println(aco20.asString());
    }
}
