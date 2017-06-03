package week1.day2.books;

public class Encyclopedia extends Book{

    private int numberOfArticles;

    Encyclopedia(String name, String author, int serialId, int pages, double price, int numberOfArticles) {
        super(name, author, serialId, pages, price);
        this.numberOfArticles = numberOfArticles;
    }

    @Override
    public void print() {
        System.out.println("I am method 'print' and I print Encyclopedia");
    }
}
