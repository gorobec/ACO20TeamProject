package week5.clone;

/**
 * Created by gorobec on 10.06.17.
 */
public class TestClone {
    public static void main(String[] args){

        Child child = new Child("Jimm", 12);
        Woman woman = new Woman("Ann", 30, child);
        Man man = new Man("John", 35, woman);

        Man clone = null;

        try {
            clone = man.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        System.out.println(man);
        System.out.println(clone);
        man.setName("Jack");

        System.out.println("After changing mans name");
        System.out.println(man);
        System.out.println(clone);


        man.getWife().setName("Juliet");


        System.out.println("After changing wife name");

        System.out.println(man);
        System.out.println(clone);


        child.setName("Bob");


        System.out.println("After changing child name");

        System.out.println(man);
        System.out.println(clone);

    }
}
