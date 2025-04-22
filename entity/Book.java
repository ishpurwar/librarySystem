package Entity;

public class Book {
    private String name;
    private String author;
    private int isbn;
    private boolean isAvailable;
    private static int totalbook = 1;
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.isbn = totalbook++;
        this.isAvailable = true;
    }
    
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public int getIsbn() {
        return isbn;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
