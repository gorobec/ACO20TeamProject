package cats;

import java.util.ArrayList;

/**
 * static cats
 */
public class Cat {
    private String name;
    public static ArrayList<Cat> cats = new ArrayList<>();

    Cat(String name) {
        this.name = name;
        cats.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printCats() {
        for (Cat cat : cats) {
            System.out.println(cat.name);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            Cat c = new Cat("name" + i);
        }
        Cat c = new Cat("name10");
        c.printCats();
    }

}
