package design_patterns.decorator;

/**
 * Created by gorobec on 17.06.17.
 */
public class BlackCoffee extends Drink{
    private static final double PRICE = 12;
    private static final String NAME = "Black coffee";

    public BlackCoffee() {
    }

    @Override
    public double cost() {
        return PRICE;
    }

    @Override
    public String description() {
        return NAME;
    }
}
