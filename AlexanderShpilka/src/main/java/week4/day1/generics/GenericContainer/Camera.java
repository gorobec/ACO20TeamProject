package week4.day1.generics.GenericContainer;

public class Camera extends Product<Camera> {
    int pixel;

    @Override
    boolean subCompare(Camera p) {
        if (p != null) {
            return this.pixel == ((Camera) p).pixel;
        }
        return false;
    }
}
