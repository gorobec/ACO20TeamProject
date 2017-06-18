package design_patterns.decorator;

/**
 * Created by gorobec on 17.06.17.
 */
public abstract class Condiment extends Drink{

    Drink drink;

    public Condiment(Drink drink) {
        this.drink = drink;
    }

}
