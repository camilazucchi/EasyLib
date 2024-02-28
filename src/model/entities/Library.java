package model.entities;

import java.util.ArrayList;
import java.util.List;

/* Essa classe representa a entidade biblioteca (library). */
public class Library {

    // Cria uma lista de livros do tipo Book.
    private List<Book> books = new ArrayList<>();

    // Adiciona um livro na lista:
    public void addNewBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book, String name) {
        if (name.equalsIgnoreCase(book.getTitle())) {
            books.remove(book);
        } else {
            System.out.println("Sorry, the book you entered is not in your list.");
        }
    }

    // Lista todos os livros:
    public void listBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
