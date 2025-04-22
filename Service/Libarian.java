package Service;
import Entity.Book;
import Repository.BookDB;

public class Libarian {
    public void addBook(String name, String author, BookDB bookDB) { 
        Book book = new Book(name, author);
        bookDB.addBook(book);
    }
}
