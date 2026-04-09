package library;

public class Book {
    private String title; // private = hidden from outside
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void showDetails() {
        System.out.println("Book: " + title + " | Author: " + author);
    }
}
