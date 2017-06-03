package week2.library;

public class TestLibrary {
    public static void main(String[] args) {
        Library library = new Library("State");
        Reader reader1 = new Reader("Alex", "Spin", 3216549870L);
        Reader reader2 = new Reader("Olya", "Pelep", 9517532854L);
        Reader reader3 = new Reader("Valter", "White", 9784653120L);
        Edition book1 = new Book("War and Peace", 1869, "rus", false, 20,
                "Reading Club", "978-10-356-19", 10000,
                "Lev", "Tolstoy", 1500, Genre.DETECTIVE);
        Edition book2 = new Book("The Great Gatsby", 1925, "eng", false, 15,
                "Reading Club", "978-10-356-19", 10000,
                "Francis", "Fitzgerald", 800, Genre.FAIRY_TALE);
        Edition book3 = new Book("Nineteen Eighty-Four", 1949, "eng", false, 30,
                "Reading Club", "978-10-356-19", 10000,
                "George", "Orwell", 500, Genre.FANTASTIC);
        Edition book4 = new Book("In search of lost time", 1913, "french", false, 10,
                "Reading Club", "978-10-356-19", 10000,
                "Marcel", "Proust", 450, Genre.NOVEL);
        Edition book5 = new Book("Hamlet", 1602, "eng", false, 40,
                "Reading Club", "978-10-356-19", 10000,
                "William", "Shakespeare", 650, Genre.OTHER);
        Edition book6 = new Book("Pride and Prejudice", 1813, "eng", false, 25,
                "Reading Club", "978-10-356-19", 10000,
                "Jane", "Austen", 700, Genre.POEM);
        Edition book7 = new Book("The Sound and the Fury", 1929, "eng", false, 18,
                "Reading Club", "978-10-356-19", 10000,
                "William", "Faulkner", 650, Genre.STORY);
        Edition book8 = new Book("Lolita", 1955, "rus", false, 20,
                "Reading Club", "978-10-356-19", 10000,
                "Vladimir", "Nabokov", 400, Genre.TALE);
        Edition book9 = new Book("To the Lighthouse", 1927, "eng", false, 34,
                "Reading Club", "978-10-356-19", 10000,
                "Virginia", "Woolf", 780, Genre.FAIRY_TALE);

        library.addReader(reader1);
        library.addReader(reader2);
        library.addReader(reader3);

        library.addEdition(book1);
        library.addEdition(book2);
        library.addEdition(book3);
        library.addEdition(book4);
        library.addEdition(book5);
        library.addEdition(book6);
        library.addEdition(book7);
        library.addEdition(book8);
        library.addEdition(book9);

        library.giveEdition(book1, reader1);
        library.giveEdition(book2, reader1);
//        library.giveEdition(book3, reader1);
        library.giveEdition(book4, reader2);
        library.giveEdition(book5, reader2);
//        library.giveEdition(book6, reader2);
        library.giveEdition(book7, reader3);
        library.giveEdition(book8, reader3);
//        library.giveEdition(book9, reader3);

        ReaderNameComparator rnc = new ReaderNameComparator();
        ReaderSurnameComparator rsc = new ReaderSurnameComparator();
        ReaderIdCodeComparator ricc = new ReaderIdCodeComparator();
//        library.showReaders(rnc);
//        library.showReaders(rsc);
//        library.showReaders(ricc);

        EditionTitleComparator etc = new EditionTitleComparator();
        EditionYearComparator eyc = new EditionYearComparator();
        EditionLanguageComparator elc = new EditionLanguageComparator();
        EditionQuantityComparator eqc = new EditionQuantityComparator();
//        library.showAvailableEditions();
//        library.showAvailableEditions(etc);
//        library.showAvailableEditions(eyc);
//        library.showAvailableEditions(elc);
//        library.showAvailableEditions(eqc);

//        library.showAllTakenEditions(etc);
//        library.showAllTakenEditions(eyc);
//        library.showAllTakenEditions(elc);
//        library.showAllTakenEditions(eqc);

        Edition book10 = new Book("AAA", 1925, "rus", false, 20,
                "Reading Club", "978-10-356-19", 10000,
                "Vladimir", "Nabokov", 400, Genre.DETECTIVE);
        Edition book11 = new Book("ZZZ", 1925, "french", false, 34,
                "Reading Club", "978-10-356-19", 10000,
                "Virginia", "Woolf", 780, Genre.STORY);
        library.addEdition(book10);
        library.addEdition(book11);
//        library.showConcreteYearEdition(1925);
//        library.showConcreteYearEdition(1925, etc);
//        library.showConcreteYearEdition(1925, elc);
//        library.showConcreteYearEdition(1925, eqc);

        Edition book12 = new Book("CCC", 1930, "ukr", false, 10,
                "Reading Club", "978-10-356-19", 10000,
                "Oleg", "Nabokov", 300, Genre.FANTASTIC);
        library.addEdition(book12);

//        library.showConcreteAuthorEdition("Nabokov");
//        library.showConcreteAuthorEdition("Nabokov", etc);
//        library.showConcreteAuthorEdition("Nabokov", eyc);
//        library.showConcreteAuthorEdition("Nabokov", elc);
//        library.showConcreteAuthorEdition("Nabokov", eqc);

//        library.findEditionByKeyWords(etc, "the");

//        library.findEditionByKeyWords(etc, "the");
//        library.findEditionByKeyWords(etc, "Great", "Gatsby");

        System.out.println(book9.info());
        System.out.println(book9);
    }
}
