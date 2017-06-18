package design_patterns.decorator;

/**
 * Created by gorobec on 17.06.17.
 */
public class RunCoffeeShop {
    public static void main(String[] args) {
        Drink drink = new Sugar(new Milk(new Espresso()));
        Drink drink2 = new Sugar(new Sugar(new BlackCoffee()));

        System.out.println(drink);
        System.out.println(drink2);
    }
}
