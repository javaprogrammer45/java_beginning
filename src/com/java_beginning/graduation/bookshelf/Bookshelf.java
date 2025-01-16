package com.java_beginning.graduation.bookshelf;

import java.util.*;

public class Bookshelf {
    private int quantityBooks;
    private Book book;
    private List<Book> books;



   public Bookshelf() {
   }

    public Bookshelf(int quantityBooks, Book book,List<Book> books){
        this.quantityBooks = quantityBooks;
        this.book = book;
        this.books = books;


    }

    public String start() {
        String welcome = "";
        try {
            welcome = "Welcome to the Bookshelf !!!";
            char[] letters = welcome.toCharArray();
            for (char letter : letters) {
                System.out.print(letter);
                Thread.sleep(200);
            }
            System.out.print("  ");
        } catch (InterruptedException e) {
            System.out.println("Welcome to the Bookshelf !!!");
        }
        System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу...\n---Меню: ");
        Menu[] elementsMenu = Menu.values();
        for (Menu menu : elementsMenu) {
            System.out.print(menu);
        }
        System.out.println("Выберите из списка меню. Введите номер нужной Вам операции, например: 1 и для продолжения работы нажмите клавишу <Enter>");
        Scanner scanner = new Scanner(System.in);
int numberMenu = scanner.nextInt();
        choiceMenu(books, book, numberMenu);

            return welcome;
    }

    public void choiceMenu(List<Book> books, Book book, int numberMenu) {

switch (numberMenu) {
    case 1:
}


    }



    public int getQuantityBooks() {
        return quantityBooks;
    }

    public int getFreeShelves(List<Book>books) {
        return 10 -  books.size();
    }

    public void addBook(List<Book> books,Book book) {
        books.add(book);
    }

    public Book searchGetBook(List<Book> books, String title) {
        if (!books.isEmpty()) {
            for (Book book : books) {
                if (book.getTitle().equals(title)) {
                    return book;
                } else {
                    return null;
                }
            }
        }
        return book;
    }

    public void deleteBook(List<Book> books, String title) {
        if (!books.isEmpty()) {
            for (Book book : books) {
                if (book.getTitle().equals(title)) {
                    books.remove(book);
                }
            }
        }
    }

    public void clearBookShelf(List<Book> books){
        books.clear();
    }

    private void printBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }

    }

}


