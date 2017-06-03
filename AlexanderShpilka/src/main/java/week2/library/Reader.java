package week2.library;
import data_structures.MyArrayList;

import java.util.Comparator;

public class Reader {
    private static final int MAX_NUMBER_OF_EDITIONS = 3;
    private String name;
    private String surname;
    private long idCode;
    private boolean inBlackList;
    private MyArrayList editions;

    public Reader(String name, String surname, long idCode) {
        this.name = name;
        this.surname = surname;
        this.idCode = idCode;
        editions = new MyArrayList();
    }

    public void setInBlackList(boolean value) {
        inBlackList = value;
    }
    public boolean getInBlackList() {
        return inBlackList;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int get_MAX_NUMBER_OF_EDITIONS() {
        return MAX_NUMBER_OF_EDITIONS;
    }
    public long getIdCode() {
        return idCode;
    }
    public MyArrayList getEditions() { return editions; }

    public boolean takeEdition(Edition edition) {
        if (edition == null) return false;
        editions.add(edition);
        return true;
    }

    public void showTakenEditions(Comparator<Edition> comparator) {
        sortEditions(comparator);
        for (int i = 0; i < editions.size(); i++) {
            System.out.println(editions.get(i));
        }
    }

    public void showTakenEditions() {
        System.out.println(name + " " + surname);
        for (int i = 0; i < editions.size(); i++) {
            System.out.println(editions.get(i));
        }
    }

    private void sortEditions(Comparator<Edition> comparator) {
        for (int i = 0; i < editions.size(); i++) {
            for (int j = 0; j < editions.size() - 1; j++) {
                Edition e1 = (Edition) editions.get(j);
                Edition e2 = (Edition) editions.get(j + 1);
                if (comparator.compare(e1, e2) > 0) {
                    swapEditions(j);
                }
            }
        }
    }

    private void swapEditions(int position) {
        Edition e1 = (Edition) editions.get(position);
        Edition e2 = (Edition) editions.get(position + 1);
        editions.set(e2, position);
        editions.set(e1, position + 1);
    }

    public int numberOfTakenBooks() {
        return editions.size();
    }

    @Override
    public String toString() {
        return String.format("Name - %s, surname - %s, idCode - %d",
                name, surname, idCode);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Reader tmp = (Reader) o;
        return this.idCode == tmp.idCode;
    }
}
