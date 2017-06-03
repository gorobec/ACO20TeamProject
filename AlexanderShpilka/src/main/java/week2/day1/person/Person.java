package week2.day1.person;

public abstract class Person {
    private String name;
    private String surname;
    private String middlename;
    private int age;
    private char sex;

    public Person(String name, String surname, String middlename, int age, char sex) {
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String asString() {
        return String.format("Name - %s, surname - %s, middlename - %s, age - %d, sex - %s",
                name, surname, middlename, age, sex);
    }
}
