package Service;

<<<<<<< HEAD
import java.util.ArrayList;

public class Student extends User {
    Book b;

    public void getBook(String name) {
        ArrayList<Book> books = getAllBooks(); // Assuming this is inherited or available
        for (Book book : books) {
            if (book.name.equals(name)) {
                System.out.println(book.toString());
                b = book;
                break;
            }
        }
    }

    public void issueBook() {
        if (this.flag && b != null && b.isAvailable) {
            b.isAvailable = false;
            System.out.println("Book is Issued");
        } else {
            System.out.println("Book cannot be issued.");
        }
    }
=======
public class Student {
    
>>>>>>> 1cf2406f6acb05c5dc1ba770c3f193c1281336d1
}
