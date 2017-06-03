package week2.library;

public class Book extends Edition {

    private String authorName;
    private String authorSurname;
    private int pages;
    private Genre genre;

    public Book(String title, int year, String language, boolean isPeriodical, int quantity,
                String publishingHouse, String isbn, int totalCirculation,
                String authorName, String authorSurname, int pages, Genre genre) {
        super(title, year, language, isPeriodical, quantity, publishingHouse, isbn, totalCirculation);
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.pages = pages;
        this.genre = genre;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    @Override
    public String toString() {
        return String.format("Name - %s, surname - %s, %s, pages - %d, genre - %s",
                authorName, authorSurname, super.toString(), pages, genre);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Book tmp = (Book) o;
        return this.authorName.equals(tmp.authorName) &&
                this.authorSurname.equals(tmp.authorSurname) &&
                super.getTitle().equals(tmp.getTitle()) &&
                super.getLanguage().equals(tmp.getLanguage());
    }
}
