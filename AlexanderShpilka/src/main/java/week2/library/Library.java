package week2.library;
import data_structures.MyArrayList;

import java.util.Comparator;

public class Library {
    private String nameOfLibrary;
    private MyArrayList editionFund; // to store editions
    private MyArrayList readers; // to store readers

    public Library(String nameOfLibrary) {
        this.nameOfLibrary = nameOfLibrary;
        editionFund = new MyArrayList();
        readers = new MyArrayList();
    }

    public boolean addReader(Reader reader) {
            if (reader == null) return false;
            if (findReader(reader) != -1) {
                System.out.println("Reader with such idCode is already present in readers list");
                return false;
            }
            readers.add(reader);
            return true;
    }

    private int findReader(Reader reader) {
        for (int i = 0; i < readers.size(); i++) {
            Reader tmp = (Reader) readers.get(i);
            if (reader.equals(tmp)) {
                return i;
            }
        }
        return -1;
    }

    private int findEdition(MyArrayList list, Edition edition) {
        if (edition.getClass() == Book.class) {
            Book input = (Book) edition;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getClass() == Book.class) {
                    Book tmp = (Book) list.get(i);
                    if (input.equals(tmp)) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public boolean setBlackListStatus(Reader reader, boolean status) {
        if (reader == null) return false;
        int indexOfReader = findReader(reader);

        if (indexOfReader == -1) {
            System.out.println("Cannot set status. No such reader");
            return false;
        }

        Reader toSetStatus = (Reader) readers.get(indexOfReader);
        toSetStatus.setInBlackList(status);
        return true;
    }

    public boolean addEdition(Edition edition) {
        if (edition == null) return false;
        /*for (int i = 0; i < editionFund.size(); i++) {
            if (edition == editionFund.get(i)) {
                return false;
            }
        }*/

        if (edition.getClass() == Book.class) {
            Book input = (Book) edition;
            for (int i = 0; i < editionFund.size(); i++) {
                if (editionFund.get(i).getClass() == Book.class) {
                    Book tmp = (Book) editionFund.get(i);
                    if (input.equals(tmp)) {
                        tmp.setQuantity(tmp.getQuantity() + input.getQuantity());
                        return true;
                    }
                }
            }
            // if no such editions in editionFund, add new edition
            editionFund.add(edition);
            return true;
        }

        /* here some else-if code to check if edition belongs to another classes
        such Magazine or Newspaper, but for now I have only Book class.
         */
        // if not Book class:
        editionFund.add(edition);
        return true;
    }

    public boolean giveEdition(Edition edition, Reader reader) {
        if (edition == null || reader == null) return false;

        int indexOfEdition = findEdition(editionFund, edition);
        int indexOfReader = findReader(reader);
        if (indexOfEdition == -1 || indexOfReader == -1) return false;

        Edition toGiveEdition = (Edition) editionFund.get(indexOfEdition);
        Reader toTakeBookReader = (Reader) readers.get(indexOfReader);

        if (toGiveEdition.getQuantity() == 0) return false;
        if (toTakeBookReader.numberOfTakenBooks() == toTakeBookReader.get_MAX_NUMBER_OF_EDITIONS() ||
                toTakeBookReader.getInBlackList()) {
            return false;
        }

        if (findEdition(toTakeBookReader.getEditions(), toGiveEdition) != -1) return false;

        toTakeBookReader.takeEdition(toGiveEdition);
        toGiveEdition.setQuantity(toGiveEdition.getQuantity() - 1);
        return true;
    }

    public void showAvailableEditions(Comparator<Edition> comparator) {
        if (editionFund.size() == 0) {
            System.out.println("Sorry, no editions");
            return;
        }
        editionSort(comparator);
        for (int i = 0; i < editionFund.size(); i++) {
            Edition edition = (Edition) editionFund.get(i);
            if (edition.getQuantity() > 0) {
                System.out.println(editionFund.get(i));
            }
        }
    }

    public void showAvailableEditions() {
        if (editionFund.size() == 0) System.out.println("Sorry, no editions");
        for (int i = 0; i < editionFund.size(); i++) {
            Edition edition = (Edition) editionFund.get(i);
            if (edition.getQuantity() > 0) {
                System.out.println(editionFund.get(i));
            }
        }
    }

    public void showAllTakenEditions(Comparator<Edition> comparator) {
        MyArrayList tmpEditionStorage = new MyArrayList();

        for (int i = 0; i < readers.size(); i++) {
            Reader tmpReader = (Reader) readers.get(i);
            MyArrayList tmpStorage = tmpReader.getEditions();

            for (int j = 0; j < tmpStorage.size(); j++) {
                tmpEditionStorage.add(tmpStorage.get(j));
            }
        }

        tmpEditionSort(tmpEditionStorage, comparator);

        for (int i = 0; i < tmpEditionStorage.size(); i++) {
            System.out.println(tmpEditionStorage.get(i));
        }
    }

    private void tmpEditionSort(MyArrayList list, Comparator<Edition> comparator) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                Edition e1 = (Edition) list.get(j);
                Edition e2 = (Edition) list.get(j + 1);
                if (comparator.compare(e1, e2) > 0) {
                    swapEdition(list, j);
                }
            }
        }
    }

    public void showAllTakenEditions() {
        for (int i = 0; i < readers.size(); i++) {
            Reader reader = (Reader) readers.get(i);
            reader.showTakenEditions();
        }
    }

    public void showReaders(Comparator<Reader> comparator) {
        readerSort(comparator);
        for (int i = 0; i < readers.size(); i++) {
            System.out.println(readers.get(i));
        }
    }

    public void readerSort(Comparator<Reader> comparator) {
        for (int i = 0; i < readers.size(); i++) {
            for (int j = 0; j < readers.size() - 1; j++) {
                Reader r1 = (Reader) readers.get(j);
                Reader r2 = (Reader) readers.get(j + 1);
                if (comparator.compare(r1, r2) > 0) {
                    swapReader(readers, j);
                }
            }
        }
    }

    private void swapReader(MyArrayList list, int position) {
        Reader tmp = (Reader) list.get(position);
        Reader tmp2 = (Reader) list.get(position + 1);
        list.set(tmp2, position);
        list.set(tmp, position + 1);
    }

    public void editionSort(Comparator<Edition> comparator) {
        for (int i = 0; i < editionFund.size(); i++) {
            for (int j = 0; j < editionFund.size() - 1; j++) {
                Edition e1 = (Edition) editionFund.get(j);
                Edition e2 = (Edition) editionFund.get(j + 1);
                if (comparator.compare(e1, e2) > 0) {
                    swapEdition(editionFund, j);
                }
            }
        }
    }

    private void swapEdition(MyArrayList list, int position) {
        Edition tmp = (Edition) list.get(position);
        Edition tmp2 = (Edition) list.get(position + 1);
        list.set(tmp2, position);
        list.set(tmp, position + 1);
    }

    public void showConcreteAuthorEdition(String surname) {
        if (surname == null) return;
        for (int i = 0; i < editionFund.size(); i++) {
            if (editionFund.get(i).getClass() == Book.class) {
                Book tmp = (Book) editionFund.get(i);
                if (surname.equals(tmp.getAuthorSurname())) {
                    System.out.println(tmp);
                }
            }
        }
    }

    public void showConcreteAuthorEdition(String surname, Comparator<Edition> comparator) {
        if (surname == null) return;
        editionSort(comparator);
        showConcreteAuthorEdition(surname);

	/*for (int i = 0; i < editionFund.size(); i++) {
		if (editionFund.get(i).getClass() == Book.class) {
			Book tmp = (Book) editionFund.get(i);
			if (surname.equals(tmp.getAuthorSurname())) {
				System.out.println(tmp);
			}
		}
	}*/
    }

    public void showConcreteYearEdition(int year) {
        for (int i = 0; i < editionFund.size(); i++) {
            Edition edition = (Edition) editionFund.get(i);
            if (year == edition.getYear()) {
                System.out.println(edition);
            }
        }
    }

    public void showConcreteYearEdition(int year, Comparator<Edition> comparator) {
        editionSort(comparator);
        showConcreteYearEdition(year);
    }

    public void findEditionByKeyWords(Comparator<Edition> comparator, String... keywords) {
        if (keywords == null || keywords.length == 0) System.out.println("Enter keywords");
        MyArrayList tmpEditionStorage = new MyArrayList();

        outer:
        for (int i = 0; i < editionFund.size(); i++) {
            Edition tmp = (Edition) editionFund.get(i);

            inner:
            for (int j = 0; j < keywords.length; j++) {
                if (tmp.getTitle().contains(keywords[j])) {
                    // tmpEditionStorage.add(editionFund.get(i));
                    tmpEditionStorage.add(tmp);
                    break inner;
                }
            }
        }

        tmpEditionSort(tmpEditionStorage, comparator);

        for (int i = 0; i < tmpEditionStorage.size(); i++) {
            System.out.println(tmpEditionStorage.get(i));
        }
    }

}
