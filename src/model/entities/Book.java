package model.entities;

import java.time.Year;

/* Essa classe representa a entidade livro (book). */
public record Book(String title, String author, Year year) {

    @Override
    public String toString() {
        return "Title: " + title() + "\nAuthor: " + author() + "\nYear: " + year();
    }
}
