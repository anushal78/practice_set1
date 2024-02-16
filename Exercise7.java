//Library management system using Java
/* a library management system that is capable of issuing books to the students. Every book should have info like:
        1. Book name
        2. Book Author
        3. Issued to
        4. Issued on
Users should be able to add books, return issued books, issue books. Assume that all the users
are registered with their names in the central database.
 */
import java.util.ArrayList;

class Book{
    public String name, author;

    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class MyLibrary {
    public ArrayList<Book> books;
    public MyLibrary(ArrayList<Book> books){
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("Book has been added to the library");
        this.books.add(book);
    }
    public void issueBook(Book book, String issued_to){
        System.out.println("Book is issued from the library to" + issued_to);
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("Book has been returned");
        this.books.add(b);
    }
}

public class Exercise7 {
    public static void main(String[] args){
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("3000 stitches", "sudha murthy");
        bk.add(b1);
        Book b2 = new Book("ramayana darshanam", "kuvempu");
        bk.add(b2);
        Book b3 = new Book("parva", "s l bairappa");
        bk.add(b3);
        Book b4 = new Book("sharapanjara", "triveni");
        bk.add(b4);
        MyLibrary l = new MyLibrary(bk);
        l.addBook(new Book("Rich dad, Poor dad","Robert Kiyosaki"));
        System.out.println(l.books);
        l.issueBook(b3, "Anusha");
        System.out.println(l.books);
    }
}
