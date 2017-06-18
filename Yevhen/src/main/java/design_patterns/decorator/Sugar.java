package design_patterns.decorator;

/**
 * Created by gorobec on 17.06.17.
 */
public class Sugar extends Condiment{

    private static final double SUGAR_PRICE = 1;
    private static final String NAME = "Sugar";

    public Sugar(Drink drink) {
        super(drink);
    }

    @Override
    public double cost() {
        return drink.cost() + SUGAR_PRICE;
    }

    @Override
    public String description() {
        return drink.description() + " with " + NAME;
    }
}
