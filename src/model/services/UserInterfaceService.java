package model.services;

import model.entities.Book;
import model.entities.Library;

import javax.swing.*;
import java.time.Year;

public class UserInterfaceService {

    Library library = new Library();

    // 1. Mostra o menu inicial:
    public void displayMenu() {
        int userChoice;

        do {
            userChoice = Integer.parseInt(JOptionPane.showInputDialog(null, """
                What would you like to do?
                1 - Create a new book list
                2 - See your book list
                3 - Add a new book to your book list
                4 - Remove a book from your book list
                5 - Exit EasyLib
                """));

            switch (userChoice) {
                case 1:
                    displayBookListMenu();
                    return;
                case 2:
                    library.listBooks();
                    return;
                case 3:
                    displayAddNewBookMenu();
                    return;
                case 4:
                    displayRemoveBookMenu();
                    return;
                case 5:
                    displayGoodbyeMessage();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "The option you choose is not valid." +
                            " Please try again.");
            }
        } while (userChoice != 5);
    }

    // 2. Mostra o menu para adicionar livros na lista:
    public void displayBookListMenu() {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "How many books would you" +
                " like to add to your book list?"));
        JOptionPane.showMessageDialog(null, "Please enter the book information: ");
        for (int i = 0; i < n; i++) {
            String title = JOptionPane.showInputDialog(null, "Title: ");
            String author = JOptionPane.showInputDialog(null, "Author: ");
            Year year = Year.parse(JOptionPane.showInputDialog(null, "Year: "));
            Book book = new Book(title, author, year);
            library.addNewBook(book);
        }
    }

    // 3. Mostra o menu para adicionar UM livro em uma lista já existente:
    public void displayAddNewBookMenu() {
        String title = JOptionPane.showInputDialog(null, "Title: ");
        String author = JOptionPane.showInputDialog(null, "Author: ");
        Year year = Year.parse(JOptionPane.showInputDialog(null, "Year: "));
        Book book = new Book(title, author, year);
        library.addNewBook(book);
    }

    // 4. Mostra o menu para remover um livro de uma lista já existente:
    public void displayRemoveBookMenu() {
        String bookTitleToRemove = JOptionPane.showInputDialog(null, "Please enter" +
                " the title of the book you wish to remove from your book list: ");
        library.removeBook(bookTitleToRemove);
    }

    // 5. Mostra a mensagem de saída quando o usuário desejar sair do programa:
    public void displayGoodbyeMessage() {
        JOptionPane.showMessageDialog(null, "Thank you for using EasyLib! See you" +
                " next time!");
    }

}
