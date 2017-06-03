package week1.day2;

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
        if (students == null) return 0;

        int counter = 0;
        for (int j = 0; j < students.length; j++) {
            if (students[j] != null) {
                // move not null students to the left
                students[counter] = students[j];
                counter++;
            }
        }
        // fill the rest of students array with null
        for (int i = counter; i < students.length; i++) {
            students[i] = null;
        }
        return counter;
    }

    public Group(int groupNumber, int groupSize) {
        this.groupNumber = groupNumber;
        students = new Student[groupSize];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    /*public boolean addStudent(Student student) {
        if (student == null) return false;
        if (size == students.length) return false;

        for (int i = 0; i < size; i++) {
            if (student.equals(students[i])) {
                return false;
            }
        }
        students[size++] = student;
        return true;
    }*/

    public boolean addStudent(Student student) {
        if (student == null) return false;

        for (int i = 0; i < size; i++) {
            if (student.equals(students[i])) {
                return false;
            }
        }

        if (size < students.length) {
            students[size++] = student;
            return true;
        } else {
            Student[] biggerStudentsArray = new Student[students.length + 10];
            System.arraycopy(students, 0, biggerStudentsArray, 0, students.length);
            biggerStudentsArray[size++] = student;
            students = biggerStudentsArray;
            return true;
        }
    }

    public boolean removeStudent(Student student) {
        if (student == null || size == 0) return false;
        int indexOfStudent = findStudentIndex(student);
        if (indexOfStudent == -1) return false;

        if (indexOfStudent == size - 1) {
            students[indexOfStudent] = null;
        } else {
            System.arraycopy(students, indexOfStudent+1, students, indexOfStudent, students.length - indexOfStudent-1);
            students[students.length-1] = null;
        }
        size--;
        return true;
    }

    public boolean updateStudent(int index, Student student) {
        if (student == null) return false;
        if (index < 0 || index > students.length-1) return false;

        students[index] = student;
        return true;
    }

    private int findStudentIndex(Student student) {
        for (int i = 0; i < size; i++) {
            if (student.equals(students[i])) {
                return i;
            }
        }
        // if student not found
        return -1;
    }

    public void sortByName() {
        Student tmp = new Student();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-1; j++) {
                if (students[j].getName().compareTo(students[j+1].getName()) >= 1) {
                    tmp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = tmp;
                }
            }
        }
    }

    /*public boolean equalGroup(Group anotherGroup) {
        if (anotherGroup == null) return false;
        if (anotherGroup == this) return true;

        if (this.groupNumber == anotherGroup.groupNumber) {
            return true;
        }
        return false;
    }*/

    @Override
    public boolean equals(Object object) {
        if (object == this) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        Group tmp = (Group) object;
        return this.groupNumber == tmp.groupNumber;
    }

    public String asString() {
        String toReturn = "Group number: " + groupNumber + "\n";
        for (int i = 0; i < size; i++) {
            toReturn += students[i].asString() + "\n";
        }
        return toReturn;
    }
}

