/*
 Online Library
You have to implement a library using Java Class "Library"

Methods: addBook, issueBook, returnBook, showAvailableBooks
Properties: Array to store the available books,
Array to store the issued books
*/

class Library {
    String[] books;
    int noOfbooks;

    //Constructor
    Library() {
        this.books = new String[100];
        this.noOfbooks = 0;
    }

    public void addBook(String book) {
        this.books[noOfbooks] = book;
        noOfbooks++;
        System.out.println(book + " is added to rack");
    }

    public void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println("Book has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This Book does not exist");
    }


    public void returnBook(String book) {
        addBook(book);
    }

    public void showAvailableBooks() {
        System.out.println("Available books are : ");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println(" * " + book);
        }
    }
}

    public class Exercise4 {
        public static void main(String[] args) {
            Library lib = new Library();
            lib.addBook("3000 Stitches");
            lib.addBook("Ramayana");
            lib.addBook("Mahabharatha");
            lib.addBook("Titanic");
            lib.showAvailableBooks();
            lib.issueBook("Titanic");
            lib.showAvailableBooks();
            lib.returnBook("Titanic");
            lib.showAvailableBooks();

        }
    }

