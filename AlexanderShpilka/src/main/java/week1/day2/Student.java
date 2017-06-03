package week1.day2;

public class Student {
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

    /*public boolean equalStudent(Student student) {
        if (student == null) return false;
        if (student == this) return true;
        if (this.name.equals(student.name) &&
                this.surName.equals(student.surName) &&
                this.age == student.age)
            return true;

        return false;
    }*/

    @Override
    public boolean equals(Object object) {
        if (object == this) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        Student tmp = (Student) object;

        return age == tmp.age
                && (name == tmp.name || (name != null && name.equals(tmp.getName())))
                && (surName == tmp.surName || (surName != null && surName.equals(tmp.getSurName())));

        /*if (this.name.equals(tmp.name) &&
                this.surName.equals(tmp.surName) &&
                this.age == tmp.age)
            return true;

        return false;*/
    }
}
