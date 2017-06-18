package design_patterns.decorator;

/**
 * Created by gorobec on 17.06.17.
 */
public abstract class Drink {

    public abstract double cost();

    public abstract String description();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Drink{");
        sb.append("Description: ").append(description()).
        append(". Price: ").append(cost()).
        append(" uah").append('}');
        return sb.toString();
    }
}
