package Repository;
import Entity.Book;
import java.util.ArrayList;

public class BookDB {
    ArrayList<Book> books = new ArrayList<>();
    public void addBook(Book book) {
        books.add(book);
    }
    public ArrayList<Book> getAllBooks(){
        return books;
    }
    public void removeBook(Book book) {
        books.remove(book);
    }
    public void updateBook(int index, Book book) {
        books.set(index, book);
    }
    public Book getBook(int index) {
        return books.get(index);
    }
}
