package library;

/**
 * BookCopy
 */
public class BookCopy extends Edition {
    private static long bookCounter;
    private long id;
    private double price;

    BookCopy() {
        this.id = ++bookCounter;
    }

    public static long getBookCounter() {
        return bookCounter;
    }

    public static void setBookCounter(long bookCounter) {
        BookCopy.bookCounter = bookCounter;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("id=").append(id);
        sb.append(", price=").append(price);
        sb.append(", ");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    public final String info() {
        return toString();
    }
}
