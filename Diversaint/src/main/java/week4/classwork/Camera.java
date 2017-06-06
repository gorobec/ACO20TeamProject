package week4.classwork;

/**
 * Created by macbook on 04.06.17.
 */
public class Camera extends Product {
    private int pixels;

    public Camera(String name, long price, int pixels) {
        super(name, price);
        this.pixels = pixels;
    }

    @Override
    public String toString() {
        return super.toString() + " pixels - " + pixels;
    }
}
