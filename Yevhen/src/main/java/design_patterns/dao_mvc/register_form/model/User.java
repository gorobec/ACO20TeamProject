package design_patterns.dao_mvc.register_form.model;

import java.io.Serializable;

/**
 * Created by gorobec on 11.06.17.
 */
public class User implements Serializable{
    private String name;
    private String surname;
    private String phoneNumber;
    private int age;

    public User(String name, String surname, String phoneNumber, int age) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (surname != null ? !surname.equals(user.surname) : user.surname != null) return false;
        return phoneNumber != null ? phoneNumber.equals(user.phoneNumber) : user.phoneNumber == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
