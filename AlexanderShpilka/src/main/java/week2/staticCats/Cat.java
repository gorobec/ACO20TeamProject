package week2.staticCats;
import java.util.ArrayList;

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {
        cats.add(this);
    }

    public void printCats() {
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }
    }
}
