package week4.day2.shop;

public class Camera extends Product {
    private int pixels;

    public Camera(String name, long price, int pixels) {
        super(name, price);
        this.pixels = pixels;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "pixels=" + pixels +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
