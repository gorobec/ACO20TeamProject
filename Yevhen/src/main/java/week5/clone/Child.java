package week5.clone;

/**
 * Created by gorobec on 10.06.17.
 */
public class Child extends Person{
    public Child(String name, int age) {
        super(name, age);
    }

    public Child(Child child) {
        super(child.getName(), child.getAge());
    }

    @Override
    public Child clone() throws CloneNotSupportedException {
        return (Child) super.clone();
    }
}
