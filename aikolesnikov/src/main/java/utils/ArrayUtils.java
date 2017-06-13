package utils;

/**
 * Created by gorobec on 04.06.17.
 */
public class ArrayUtils {

    public static boolean binarySearch(Object[] array, Object o) {
        int start = 0;
        int end = array.length - 1;
        int middle;

        while (start <= end) {
            middle = (end + start) / 2;

            Comparable comparable = (Comparable) o;

            int result = comparable.compareTo(array[middle]);

            if (result > 0) {
                start = middle + 1;
            } else if (result < 0) {
                end = middle - 1;
            }
            else return true;
        } ;

        return false;
    }


}
