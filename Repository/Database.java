package Repository;

import java.util.HashMap;

public class Database {

    static HashMap<String, String> Books = new HashMap<>();
    static HashMap<String, String> Users = new HashMap<>();
    static HashMap<String, String> BorrowedBooks = new HashMap<>();
    {
        Books.put("1", "Harry Potter and the Philosopher's Stone");
        Books.put("2", "The Hobbit");
        Books.put("3", "1984");
        Books.put("4", "To Kill a Mockingbird");
        Books.put("5", "The Great Gatsby");

        Users.put("1", "Alice");
        Users.put("2", "Bob");
        Users.put("3", "Charlie");
        Users.put("4", "David");
        Users.put("5", "Eve");
    }

}