package Service;

import java.util.ArrayList;

public class User {
    boolean flag = false;

    public void viewProfile(User u) {
        System.out.println(u.toString());
    }

    public void searchBook(String name) {
        ArrayList<Book> books = getAllBooks();
        for (Book book : books) {
            if (book.name.equals(name)) {
                System.out.println("It is Available");
                flag = true;
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Dummy book list method — You should connect this to your actual book data source
    public ArrayList<Book> getAllBooks() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Java Basics", true));
        books.add(new Book("Python 101", true));
        books.add(new Book("C++ Advanced", false));
        return books;
    }
}
