package application;

import model.entities.Book;
import model.entities.Library;

import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        System.out.println("Welcome to EasyLib! How many books would you like to add to your book list?");
        int n = sc.nextInt();
        // Consome a nova linha:
        sc.nextLine();
        System.out.println("Please enter the book information:");
        for (int i = 0; i < n; i++) {
            System.out.print("Title: ");
            String title = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();
            System.out.print("Year: ");
            Year year = Year.of(sc.nextInt());
            // Consome a nova linha:
            sc.nextLine();
            Book book = new Book(title, author, year);
            library.addNewBook(book);
        }

        System.out.println("""
        What would you like to do now?
        1 - See your book list
        2 - Add new book
        3 - Remove a book
        4 - Exit EasyLib""");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                library.listBooks();
                break;
            case 2:
                System.out.print("Title: ");
                String title = sc.nextLine();
                System.out.print("Author: ");
                String author = sc.nextLine();
                System.out.print("Year: ");
                Year year = Year.of(sc.nextInt());
                Book book = new Book(title, author, year);
                library.addNewBook(book);
                break;
            case 3:
                // TODO: Implementar funcionalidade de remover livro.
                break;
            case 4:
                System.out.println("Thank you for using EasyLib!");
                break;
            default:
                // TODO: Adicionar um default melhor depois.
                System.out.println("There was an error here.");
        }

        sc.close();

    }
}
