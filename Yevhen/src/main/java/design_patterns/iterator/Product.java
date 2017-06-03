package design_patterns.iterator;

/**
 * Created by gorobec on 29.10.16.
 */
public class Product {
    private String name;


    public Product(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
