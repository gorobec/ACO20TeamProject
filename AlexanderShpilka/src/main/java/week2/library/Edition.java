package week2.library;

public abstract class Edition {

    private String title;
    private int year;
    private String language;
    private boolean isPeriodical;
    private int quantity;

    private String publishingHouse;
    private String isbn;
    private int totalCirculation;

    public Edition(String title, int year, String language, boolean isPeriodical, int quantity,
                   String publishingHouse, String isbn, int totalCirculation) {
        if (quantity < 0) quantity = 0;
        else this.quantity = quantity;

        this.title = title;
        this.year = year;
        this.language = language;
        this.isPeriodical = isPeriodical;

        this.publishingHouse = publishingHouse;
        this.isbn = isbn;
        this.totalCirculation = totalCirculation;
    }

    public String getTitle() {
        return title;
    }

    public String getLanguage() {
        return language;
    }

    public int getYear() {
        return year;
    }

    public void setQuantity (int quantity) {
        if (quantity < 0) {
            System.out.println("Wrong quantity");
            return;
        }
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return String.format("Title - %s, year of publishing - %d, language - %s, is periodical - %b, quantity - %d",
                title, year, language, isPeriodical, quantity);
    }

    public final String info() {
        return String.format("Publishing house - %s, totalCirculation - %d, isbn - %s",
                publishingHouse, totalCirculation, isbn);
    }
}
