package design_patterns.decorator;

/**
 * Created by gorobec on 17.06.17.
 */
public class Milk extends Condiment{

    private static final double MILK_PRICE = 3;
    private static final String NAME = "Milk";

    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public double cost() {
        return drink.cost() + MILK_PRICE;
    }

    @Override
    public String description() {
        return drink.description() + " with " + NAME;
    }
}
