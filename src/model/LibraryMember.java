package model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private final String name;
    private final int memberId;
    private final List<Book> borrowedBooks;
    private List<Book> reservedBooks; //TASK 3

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        borrowedBooks = new ArrayList<>();

        reservedBooks = new ArrayList<>(); //Task3
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
    //TASK 3
    public void addReservedBook(Book book) {
        reservedBooks.add(book);
    }
    public void removeReservedBook(Book book) {
        reservedBooks.remove(book);
    }
    public boolean hasReservedBook(Book book) {
        return reservedBooks.contains(book);
    }
    public List<Book> getReservedBooks() {
        return reservedBooks;
    }
}