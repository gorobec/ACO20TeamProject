package week4.day2.TestBinarySearchComparator;
import java.util.Comparator;

public class StartBrightnessComparator implements Comparator<Star> {

    @Override
    public int compare(Star star1, Star star2) {
        return star1.getBrightness() - star2.getBrightness();
    }
}
