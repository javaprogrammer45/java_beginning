package com.java_beginning.graduation.bookshelf;

import java.util.*;

public class Bookshelf {
    private int quantityBooks;
    private Book book;
    private List<Book> books;
private boolean isStarted = true;

    public Bookshelf() {
   }

    public Bookshelf(int quantityBooks, Book book,List<Book> books){
        this.quantityBooks = quantityBooks;
        this.book = book;
        this.books = books;
    }

    public String start() {
        String welcome = "";
        if(isStarted){
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
        System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу");
        isStarted = false;
        }

        printMenu();
        Scanner scanner = new Scanner(System.in);
        int numberMenu;
        boolean isInt;
        do {
            numberMenu = scanner.nextInt();
            isInt = true;
            if (numberMenu > 4 || numberMenu < 1) {
                System.out.print("Ошибка!!! Такого пункта меню в списке нет.\n Введите номер нужной Вам операции, например: 1 и для продолжения работы нажмите клавишу <Enter>:");
                isInt = false;
            }
        } while (!isInt);
        choiceMenu(new ArrayList<>(), new Book(), numberMenu);
        return welcome;
    }

    public void choiceMenu(List<Book> books, Book book, int numberMenu) {
        Scanner scanner = new Scanner(System.in);
        switch (numberMenu) {
            case 1:
                System.out.println("Введите: автора книги, название книги, год публикации. Например:" +
                        " Ирвинг Стоун-Жажда жизни-1973");
                String[] stringsInput = scanner.nextLine().split("-");
                book.setAuthor(stringsInput[0]);
                book.setTitle(stringsInput[1]);
                try {
                    int yearPublished = Integer.parseInt(stringsInput[2]);
                    book.setYearPublication(yearPublished);
                } catch (NumberFormatException e) {
                    System.out.println("Неправильный формат строки!!!");
                }
                addBook(books, book);

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
        quantityBooks++;
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
        quantityBooks--;
    }

    public void clearBookShelf(List<Book> books){
        books.clear();
        quantityBooks=0;
    }

    public void printMenu() {
        System.out.println("---Меню: ");
        Menu[] elementsMenu = Menu.values();
        for (Menu menu : elementsMenu) {
            System.out.print(menu);
        }
        System.out.print("Выберите из списка меню. Введите номер нужной Вам операции, например:" +
                " 1 и для продолжения работы нажмите клавишу <Enter>:");
    }

    private void printShelves(List<Book> books) {
        for (Book book : books) {
            System.out.print(book);
        }
    }

}


