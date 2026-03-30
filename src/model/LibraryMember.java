package model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private final String name;
    private final int memberId;
    private final List<Book> borrowedBooks;

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        borrowedBooks = new ArrayList<>();
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
}