package library;

import datastructures.MyArrayList;

import static library.LIB_SETTINGS.BOOK_RENT_LIMIT;
import static library.LIB_SETTINGS.LIBRARY_NAME;

/**
 * Library
 */
public class Library {

    private String name;
    private MyArrayList books;
    private MyArrayList clients;

    Library() {
        name = LIBRARY_NAME;
        books = new MyArrayList();
        clients = new MyArrayList();
    }

    public String getName() {
        return name;
    }

    public MyArrayList getBooks() {
        return books;
    }

    public MyArrayList getClients() {
        return clients;
    }

    //  1) посмотреть список читателей
    public String printListOfClients() {
        final StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < clients.size(); i++) {
            sb.append(clients.get(i)).toString();
            sb.append("};\n");
        }
        return sb.toString();
    }

    //  2) посмотреть список доступных конкретных изданий
    public String printListOfBooks() {
        final StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < books.size(); i++) {
            sb.append(books.get(i)).toString();
            sb.append("};\n");
        }
        return sb.toString();
    }

    // 3) добавить издание в библиотеку.
    boolean addBook(BookCopy book) {
        return (book == null) || books.contains(book) ? false : books.add(book);
    }

    //  4) добавить читателя в список читателей
    boolean addReader(Client client) {
        return (client == null) || clients.contains(client) ? false : clients.add(client);
    }

    //  5) выдать издание читателю (если оно есть в наличии).
    // Читателю запрещается брать больше 3-х изданий.
    boolean getBook(BookCopy book, Client client) {
        if ((book == null) || !(books.contains(book))) {
            System.out.println("Book does not exists.");
            return false;
        }
        if ((client == null) || !(clients.contains(client))) {
            System.out.println("Client does not exist ");
            return false;
        }

        if (client.getReadBooks().size() == BOOK_RENT_LIMIT) {
            System.out.println("Client's rent limit is exceeded.");
            return false;
        }

        if (books.remove(book))
            client.getReadBooks().add(book);

        return true;
    }

    boolean returnBook(Client client, BookCopy book) {
        if ((book == null) || !(client.getReadBooks().contains(book))) {
            System.out.println("Book does not exists.");
            return false;
        }
        if ((client == null) || !(clients.contains(client))) {
            System.out.println("Client does not exist ");
            return false;
        }

        if (client.getReadBooks().remove(book))
            books.add(book);

        return true;
    }

    // 6) посмотреть список изданий, которые находятся у читателей
    public String getReadingBooksListAll() {

        final StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < clients.size(); i++) {
            for (int j = 0; j < ((Client) clients.get(i)).getReadBooks().size(); j++) {
                sb.append(((Client) clients.get(i)).getReadBooks().get(j));
                sb.append(";");
            }
        }
        return sb.toString();
    }

    //  7) посмотреть список изданий, которые находятся у конкретного читателя
    public String getReadingBooksList(Client client) {
        if ((client == null) || !(clients.contains(client))) return "No such client.";
        final StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < client.getReadBooks().size(); i++) {
            sb.append(client.getReadBooks().get(i));
            sb.append(";");
        }
        return sb.toString();
    }

    //  8) добавить читателя в черный список (ему нельзя выдавать издания)
    boolean toBlackList(Client client, boolean include) {
        if ((client == null) || !(clients.contains(client))) return false;
        else {
            client.setBlocked(include);
            return true;
        }
    }

    // 9) посмотреть издания конкретного автора

    // 10) посмотреть издания конкретного года
    /*public String findBook(int Year){
        for (int i=0; i<books.size(); i++){
        }
    }
*/


    /*
      11) найти издание по названию (ключевым словам). Использовать varargs.

 	    * пункты 1, 2, 6, 7, 9, 10, 11, 12 выводить в отсортированом виде,
           сортировку делать по разным параметрам(имя, название, год и т.д.)

 	  ** задание будет изменяться, по этому ваша программа должна обладать определенной гибкостью

     */
}
