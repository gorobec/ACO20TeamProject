package products;

/**
 * Created by kaim on 6/4/17.
 */
public class Process {
    public static void main(String[] args) {
        Product p1 = new Camera("cam", 100, 10);
        Product p2 = new Phone("phone", 200, "Sony");

        Container<Product> container = new Container<>();
        container.add(p1);
        container.add(p2);

        System.out.println(container);
    }
}
