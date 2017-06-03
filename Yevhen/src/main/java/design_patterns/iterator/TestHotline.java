package design_patterns.iterator;

/**
 * Created by gorobec on 30.10.16.
 */
public class TestHotline {
    public static void main(String[] args) {
        Rozetka rozetka = new Rozetka();
        Repka repka = new Repka();

        Product product = new Product("IPhone");
        Product product2 = new Product("Samsung");
        Product product3 = new Product("Sony");
        Product product4 = new Product("LG");

        repka.addProduct(product);
        repka.addProduct(product2);

        rozetka.addProduct(product3);
        rozetka.addProduct(product4);

        Hotline hotline = new Hotline();
        System.out.println("--Before adding rozetka--");
        System.out.println(hotline);

        hotline.addProducts(rozetka);
        System.out.println("--After adding rozetka--");
        System.out.println(hotline);
        hotline.addProducts(rozetka);
        System.out.println("--After adding rozetka--");
        System.out.println(hotline);
        hotline.addProducts(repka);
        System.out.println("--After adding repka--");
        System.out.println(hotline);

    }
}
