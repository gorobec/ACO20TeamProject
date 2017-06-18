package design_patterns.decorator;

/**
 * Created by gorobec on 17.06.17.
 */
public class Espresso extends Drink {

    private static final double PRICE = 10;
    private static final String NAME = "Espresso";

    public Espresso() {
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
