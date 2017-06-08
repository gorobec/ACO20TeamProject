package products;

/**
 * Created by kaim on 6/4/17.
 */
public class Phone extends Product{
    private String model;


    public Phone(String name, long price, String model) {
        super(name, price);
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                '}';
    }
}
