import model.Book;
import model.LibraryMember;
import system.Library;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("Java Basics", "John Smith", "ISBN001");
        Book book2 = new Book("Data Structures", "Jane Doe", "ISBN002");

        LibraryMember member1 = new LibraryMember("Alice", 1);
        LibraryMember member2 = new LibraryMember("Bob", 2);

        library.addBook(book1);
        library.addBook(book2);

        library.addMember(member1);
        library.addMember(member2);

        library.borrowBook(member1, book1);
        library.borrowBook(member2, book2);

        library.returnBook(member1, book1);
    }
}