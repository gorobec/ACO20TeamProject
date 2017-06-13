package week5.clone;

/**
 * Created by gorobec on 10.06.17.
 */
public class Woman extends Person {

    private Child child;

    public Woman(String name, int age, Child child) {
        super(name, age);
        this.child = child;
    }

    public Woman(Woman wife) {
        super(wife.getName(), wife.getAge());
        this.child = new Child(wife.getChild());
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public Woman clone() throws CloneNotSupportedException {

        Woman clone = (Woman) super.clone();
        clone.setChild(child.clone());
        return clone;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Woman{");
        sb.append(super.toString());
        sb.append("child=").append(child);
        sb.append('}');
        return sb.toString();
    }
}
