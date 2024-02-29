package model.entities;

import model.services.UserInterfaceService;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* Essa classe representa a entidade biblioteca (library). */
public class Library {

    // Cria uma lista de livros do tipo Book.
    private List<Book> books = new ArrayList<>();
    private static UserInterfaceService userInterface = new UserInterfaceService();

    // Adiciona um livro na lista:
    public void addNewBook(Book book) {
        books.add(book);
    }

    public void removeBook(String title) {
        /* 1. Cria um iterador para percorrer a lista de livros da biblioteca. Um iterador é uma ferramenta que nos
         * permite percorrer uma coleção de elementos sequencialmente. */
        Iterator<Book> iterator = books.iterator();
        /* 2. Este é um loop while que verifica se ainda há elementos na lista para iterar. O método "hasNext()" retorna
         * "true" se houver mais elementos na lista para percorrer.*/
        while (iterator.hasNext()) {
            /* 3. Aqui estamos obtendo o próximo livro na lista usando o método "next()" do iterador. Isso move o iterador
             * para o próximo elemento na lista e retorna esse elemento. */
            Book book = iterator.next();
            /* 4. Verifica se o título do livro atual é igual ao título fornecido como parâmetro para o método
             * "removeBook". O método "equalsIgnoreCase()" compara duas strings ignorando as diferenças entre
             * maiúsculas e minúsculas. */
            if (book.getTitle().equalsIgnoreCase(title)) {
                /* 5. Se o título do livro atual corresponder ao título fornecido, removemos o livro da lista usando o
                 * método "remove()" do iterador. */
                iterator.remove();
                System.out.println("Book: " + title + " was remove successfully!");
                return;
            }
            // Se o livro não estiver na lista, retorna:
            System.out.println("Book: " + title + " was not found in your book list.");
        }
    }

    // Lista todos os livros:
    public void listBooks() {
        if (books.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Your book list is empty." +
                    " Please create a book list first.");
            userInterface.displayMenu();
        }
        StringBuilder message = new StringBuilder();
        message.append("Here is your book list:\n\n");

        for (Book book : books) {
            message.append(book.toString()).append("\n");
        }

        JOptionPane.showMessageDialog(null, message.toString());
    }

}
