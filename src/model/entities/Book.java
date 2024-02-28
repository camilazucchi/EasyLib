package model.entities;

import java.time.Year;

/* Essa classe representa a entidade livro (book). */
public class Book {

    private String title;
    private String author;
    private Year year;

    public Book(String title, String author, Year year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Year getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nYear: " + getYear();
    }
}
