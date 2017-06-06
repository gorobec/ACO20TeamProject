package week4.classwork;

/**
 * Created by macbook on 04.06.17.
 */
public class Phone extends Product {
    private String model;

    public Phone(String name, long price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return super.toString() + " model" + model;
    }
}
