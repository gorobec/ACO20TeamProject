package week1.day2.books;

public abstract class Book implements Edition {

    private String name;
    private String author;
    private int serialId;
    private int pages;
    private double price;

    Book(String name, String author, int serialId, int pages, double price) {
        this.name = name;
        this.author = author;
        this.serialId = serialId;
        this.pages = pages;
        this.price = price;
    }

    public abstract void print();


}
