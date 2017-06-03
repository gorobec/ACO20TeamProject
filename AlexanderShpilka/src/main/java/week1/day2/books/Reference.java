package week1.day2.books;

public class Reference extends Book {

    private String fieldOfKnowledge;

    Reference(String name, String author, int serialId, int pages, double price, String fieldOfKnowledge) {
        super(name, author, serialId, pages, price);
        this.fieldOfKnowledge = fieldOfKnowledge;
    }

    @Override
    public void print() {
        System.out.println("I am method 'print' and I print Reference book");
    }
}
