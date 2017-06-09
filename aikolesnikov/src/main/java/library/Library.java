package library;

import datastructures.MyArrayList;

import static library.LIB_SETTINGS.LIBRARY_NAME;

/**
 * Library
 */
public class Library {

    private String name;
    private MyArrayList books;
    private MyArrayList clients;

    public String getName() {
        return name;
    }

    public MyArrayList getBooks() {
        return books;
    }

    public MyArrayList getClients() {
        return clients;
    }

    Library(){
        name = LIBRARY_NAME;
        books = new MyArrayList();
        clients = new MyArrayList();
    }

    public String printListOfClients() {   //    1) посмотреть список читателей

        final StringBuilder sb = new StringBuilder("");
        for (int i=0; i<clients.size(); i++) {
            sb.append(clients.get(i)).toString();
            sb.append("};\n");
        }
        return sb.toString();
    }


    /*
    boolean getBook(BookCopy book, Client reader) {return false;}
    boolean returnBook(Client reader, BookCopy book) {return false;}

    String printListOfBooks() {   //  2) посмотреть список доступных конкретных изданий
        return "";
    }

    boolean addBook(BookCopy b) {  // 3) добавить издание в библиотеку.
        return false;
    }

      4) добавить читателя в список читателей
      5) выдать издание читателю (если оно есть в наличии).
         Читателю запрещается брать больше 3-х изданий.
      6) посмотреть список изданий, которые находятся у читателей
      7) посмотреть список изданий, которые находятся у конкретного читателя
      8) добавить читателя в черный список (ему нельзя выдавать издания)
      9) посмотреть издания конкретного автора
      10) посмотреть издания конкретного года
      11) найти издание по названию (ключевым словам). Использовать varargs.

 	    * пункты 1, 2, 6, 7, 9, 10, 11, 12 выводить в отсортированом виде,
           сортировку делать по разным параметрам(имя, название, год и т.д.)

 	  ** задание будет изменяться, по этому ваша программа должна обладать определенной гибкостью

     */
}
