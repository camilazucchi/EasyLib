package model.entities;

import java.time.Year;

/* Essa classe representa a entidade livro (book). */
public class Book {

    private String title;
    private String author;
    private Year year;
    private boolean borrowed;

    public Book(String title, String author, Year year, boolean borrowed) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.borrowed = borrowed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
}
