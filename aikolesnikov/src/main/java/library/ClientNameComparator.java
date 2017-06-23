package library;

import java.util.Comparator;

/**
 * compares clients by name
 */
public class ClientNameComparator implements Comparator<Client> {
    @Override
    public int compare(Client c1, Client c2) {
        String s1, s2;
        if (c1 == null || c1.getName() == null) s1 = "";
        else s1 = c1.getName();
        if (c2 == null || c2.getName() == null) s2 = "";
        else s2 = c2.getName();

        return s1.compareTo(s2);
    }
}
