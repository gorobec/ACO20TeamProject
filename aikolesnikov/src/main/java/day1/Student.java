package day1;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class Student implements Comparable<Student>{

    private String name;
    private String surName;
    private int age;

    public Student(){
    }

    public Student(String name, String surName, int age){
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String asString(){
        return String.format("Student name - %s, surName - %s, age - %d",
                name, surName, age);
    }

    @Override
    public boolean equals(Object student) {
        if(student == null) return false;
        if(student == this) return true;

//        if(student.getClass() != Student.class) return false;
        if(!(student instanceof Student))return false;

        Student another = (Student) student;
        if(this.name.equals(another.name) &&
                this.surName.equals(another.surName)) return true;
        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surName='").append(surName).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Student student) {


        int compareToResult = this.name.compareTo(student.name);
        if(compareToResult != 0) return compareToResult;
        compareToResult = this.surName.compareTo(student.surName);
        if(compareToResult != 0) return compareToResult;

        return Integer.compare(this.age,student.age);
    }
}
