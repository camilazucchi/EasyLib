package model.entities;

import java.util.ArrayList;
import java.util.List;

/* Essa classe representa a entidade biblioteca (library). */
public class Library {

    // Cria uma lista de livros do tipo Book.
    private List<Book> books = new ArrayList<>();

    public Library(List<Book> books) {
        this.books = books;
    }

    // Adiciona um livro na lista:
    public void addNewBook(Book book) {
        books.add(book);
    }

    // Empresta um livro:
    public void borrowBook(Book book) {
        // TODO: Verificar se o livro já foi emprestado.
        book.setBorrowed(true);
    }

    // Retorna um livro que foi emprestado:
    public void returnBook(Book book) {
        // TODO: Verificar se o livro foi emprestado ou não antes de devolver.
        book.setBorrowed(false);
    }

    // Lista todos os livros:
    public void listBooks() {
        for (Book book : books) {
            System.out.println(books);
        }
    }

}
