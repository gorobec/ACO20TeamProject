package week5.clone;

import java.io.Serializable;

/**
 * Created by gorobec on 10.06.17.
 */
public class Man extends Person{
    private Woman wife;

    public Man(String name, int age, Woman wife) {
        super(name, age);
        this.wife = wife;
    }
    public Man(Man man) {
//        return new Man(man.getName(), man.getAge(), man.getWife());
        super(man.getName(), man.getAge());
        this.wife = new Woman(man.getWife());
    }

    public Woman getWife() {
        return wife;
    }

    public void setWife(Woman wife) {
        this.wife = wife;
    }


    @Override
    public Man clone() throws CloneNotSupportedException{

        Man clone = (Man) super.clone();
        clone.setWife(wife.clone());

        return clone;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Man{");
        sb.append(super.toString());
        sb.append("wife=").append(wife);
        sb.append('}');
        return sb.toString();
    }
}
