package week2.library;
import java.util.Comparator;

public class ReaderIdCodeComparator implements Comparator<Reader>{
    @Override
    public int compare(Reader r1, Reader r2) {
        return Long.compare(r1.getIdCode(), r2.getIdCode());
    }
}
