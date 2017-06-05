package week4.day2.shop;

public class TestShop {
    public static void main(String[] args) {

        Camera camera = new Camera("Nikon", 35000, 23);
        Phone phone = new Phone("Samsung", 9000, "A4");

        Container<Product> container = new Container<>();
        container.add(camera);
        container.add(phone);

        System.out.println(container);
    }
}
