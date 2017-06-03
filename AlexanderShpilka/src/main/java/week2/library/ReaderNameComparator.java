package week2.library;
import java.util.Comparator;

public class ReaderNameComparator implements Comparator<Reader> {

    @Override
    public int compare(Reader r1, Reader r2) {
        int compareResult = r1.getName().compareTo(r2.getName());
        if (compareResult != 0) return compareResult;
        compareResult = r1.getSurname().compareTo(r2.getSurname());
        if (compareResult != 0) return compareResult;

        return Long.compare(r1.getIdCode(), r2.getIdCode());
    }

}
