package week2.library;
import java.util.Comparator;

public class EditionYearComparator implements Comparator<Edition>{
    @Override
    public int compare(Edition e1, Edition e2) {
        return e1.getYear() - e2.getYear();
    }
}
