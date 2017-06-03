/**
 * dynamic array
 */
public class DynamicGroup extends Group {

    public DynamicGroup(int id, Student[] students) {
        this.id = id;
        if (students == null) {
            this.students = new Student[INIT_GR_SIZE];
            this.size = 0;
        } else {
            this.students = students;
            for (Student student : students) {
                if (!(student == null)) size++;
            }
        }
    }

    @Override
    public boolean addStudent(Student student) {
        if (student == null) return false;
        if (this.size == students.length) {
            Student[] newAr = new Student[this.students.length * 15 / 10];
            System.arraycopy(students, 0, newAr, 0, students.length);
            students = newAr;
            students[size] = student;
            return true;
        }
        for (int i = 0; i < students.length - 1; i++) {
            if (students[i] == null) {
                students[i] = student;
                size++;
                return true;
            }
        }
        return true;
    }
}
