package products;

/**
 * Created by kaim on 6/4/17.
 */
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
}
