package model;

public class Book {
    private final String title;
    private final String author;
    private final String isbn;
    private boolean isBorrowed;
    private boolean reserved; // ADD RESERVED TASK 3

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
        this.reserved = false; //TASK 3
    }

    public String getTitle() {

        return title;
    }

    public String getAuthor() {

        return author;
    }

    public String getIsbn() {

        return isbn;
    }

    public boolean isBorrowed() {

        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {

        isBorrowed = borrowed;
    }

    //TASK 3
    public boolean isReserved() {
        return reserved;
    }

    //TASK 3
    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
}