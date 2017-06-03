package week3.day1;

/**
 * Created by gorobec on 27.05.17.
 */
public abstract class Cat {
    private static final String NAME;
//    public abstract static void print(String name){

    static {
        NAME = "CAT";
        System.out.println("In static block");
    }

    {
    System.out.println("In initialized block");
    }

    public Cat() {
        System.out.println("In cat constructor");
    }

    public static String getNAME() {
        return NAME;
    }
}
