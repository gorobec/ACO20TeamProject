package week1.day2;

import week1.day1.Student;

import java.util.Comparator;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class Group {
    private int groupNumber;
    private Student[] students;
    private int size;

    public Group(int groupNumber, Student[] students) {
        this.groupNumber = groupNumber;
        this.students = students;
        size = countStudents(students);
    }

    private int countStudents(Student[] students) {
        int count = 0;
        for (Student student : students) {
            if(student != null) count++;
        }
        return count;
    }

    public Group(int groupNumber, int groupSize) {
        this.groupNumber = groupNumber;
        this.students = new Student[groupSize];
    }

    public boolean addStudent(Student student){

        if(student == null || size == students.length){
            return false;
        }

        for (int i = 0; i < size; i++) {
            if(student.equals(students[i])) return false;
        }
        students[size++] = student;
        return true;
    }

    public boolean updateStudent(int position, Student student){
        return false;
    }

    public boolean removeStudent(Student student){
        return false;
    }

    public String toString() {
//        return String.format("Group number - %d, Students: %s", groupNumber, Arrays.toString(students));

        String info = "";

        for (int i = 0; i < students.length; i++) {
            /*if(students[i] == null) {
                info += null;
            } else {
                info += students[i].asString();
            }*/

            info += students[i] == null ? null : students[i].asString();

            info += "\n";
        }

        return String.format("Group number - %d\nStudents:\n%s", groupNumber, info);


    }


    public void sort(){
        for (int j = 0; j < size; j++) {

            for (int i = 0; i < size - 1; i++) {
                if(students[i].compareTo(students[i + 1]) > 0){
                    swap(students, i);
                }
            }
        }
    }
    public void sort(Comparator<Student> comparator){
        for (int j = 0; j < size; j++) {

            for (int i = 0; i < size - 1; i++) {
                if(comparator.compare(students[i], students[i + 1]) > 0){
                    swap(students, i);
                }
            }
        }
    }

    private void swap(Student[] students, int position) {
        Student tmp = students[position];
        students[position] = students[position + 1];
        students[position + 1] = tmp;
    }
}
