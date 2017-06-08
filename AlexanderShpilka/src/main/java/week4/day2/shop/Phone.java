package week4.day2.shop;

public class Phone extends Product {
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

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
