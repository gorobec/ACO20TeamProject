package day1;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Maxim");
        student.setSurName("Muzichenko");
        student.setAge(29);

        Student student2 = new Student("Maxim", "Muzichenko", 29);

        System.out.println(student.asString());
        System.out.println(student2.asString());


    }
}
