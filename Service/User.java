package Service;
public class User {
    public void viewProfile(User u){
        System.out.println(u.toString());

    }
    public Book searchBook(String name){
        ArrayList<Book> book=getAllBooks();
        for(int i=0;i<book.size();i++){
            if(name==book.get(i).name){
                return book.get(i);
            }
        }


       
    }
  
}
