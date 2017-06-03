package week2.day1;

/**
 * Created by gorobec on 20.05.17.
 */
public class StringEquals {
    public static void main(String[] args) {
        String name = "Jack";
        String name2 = "Jack";
        String name3 = new String("Jack");


        System.out.printf("Is equal - %b\n", name == name2);
        System.out.printf("Is equal - %b\n", name == name3);


        System.out.printf("Is equal - %b\n", name.equals(name2));
        System.out.printf("Is equal - %b\n", name.equals(name3));

    }
}
