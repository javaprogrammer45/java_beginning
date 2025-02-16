package com.java_beginning.graduation.bookshelf;

import java.util.*;

public class Bookshelf {
    private int quantityBooks;
    private Book book;
    private List<Book> books = new ArrayList<>();
    private boolean isStarted = true;

    public Bookshelf() {
    }

    public Bookshelf(int quantityBooks, Book book, List<Book> books) {
        this.quantityBooks = quantityBooks;
        this.book = book;
        this.books = books;
    }

    public String start() {
        String welcome = "";
        if (isStarted) {
            try {
                welcome = "Welcome to the Bookshelf !!!";
                char[] letters = welcome.toCharArray();
                for (char letter : letters) {
                    System.out.print(letter);
                    Thread.sleep(100);
                }
                System.out.print("  ");
            } catch (InterruptedException e) {
                System.out.println("Welcome to the Bookshelf !!!");
            }
            isStarted = false;
        }

        printMenu();
        Scanner scanner = new Scanner(System.in);
        int numberMenu = 0;
        boolean isInt;
        do {
            try {
                numberMenu = scanner.nextInt();
            } catch (InputMismatchException i) {
                System.out.println("\nОшибка!!! Это не число.");
                break;
            }
            isInt = true;
            if (numberMenu > 4 || numberMenu < 1) {
                System.out.print("\nОшибка!!! Такого пункта меню в списке нет.");
                isInt = false;
            }
        } while (!isInt);
        try {
            choiceMenu(books, new Book(), numberMenu);
        } catch (InputMismatchException i) {
            System.out.println(i.getMessage());
        }
        printShelves(books);
        return welcome;
    }

    public void choiceMenu(List<Book> books, Book book, int numberMenu) {
        Scanner scanner = new Scanner(System.in);

        switch (numberMenu) {
            case 1:
                System.out.println("Введите: автор книги, название книги, год публикации. Например:" +
                        " Ирвинг Стоун, Жажда жизни, 1973");
                String[] stringsInput = scanner.nextLine().trim().split(",");
                book.setAuthor(stringsInput[0].trim());
                book.setTitle(stringsInput[1].trim());
                try {
                    int yearPublished = Integer.parseInt(stringsInput[2].trim());
                    book.setYearPublication(yearPublished);
                } catch (NumberFormatException e) {
                    System.out.println("Неправильный формат года издания книги!!!");
                }
                addBook(books, book);
                break;
            case 2:

                break;
            case 3:
                System.out.println("Введите: название книги. Например:" +
                        " Жажда жизни");
                String titleBook = scanner.nextLine().trim();
                try {
                    Book searchedBook = searchGetBook(books, titleBook);
                    System.out.println(searchedBook.toString());
                } catch (NotFoundBookException e) {
                    System.out.println(e.getMessage());

                } catch (NullPointerException n) {
                    System.out.println("Книга не найдена.");
                }
                break;
            case 4:
        }

    }

    public int getQuantityBooks() {
        return quantityBooks;
    }

    public int getFreeShelves(List<Book> books) {
        return 10 - books.size();
    }

    public void addBook(List<Book> books, Book book) {
        books.add(book);
        quantityBooks++;
    }

    public Book searchGetBook(List<Book> books, String title) throws NotFoundBookException {
        if (!books.isEmpty()) {
            for (Book book : books) {
                if (book.getTitle().equals(title)) {
                    return book;
                } else {
                    throw new NotFoundBookException("Книга не найдена.");
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

    public void clearBookShelf(List<Book> books) {
        books.clear();
        quantityBooks = 0;
    }

    public void printMenu() {
        System.out.println("\n---Меню: ");
        Menu[] elementsMenu = Menu.values();
        for (Menu menu : elementsMenu) {
            System.out.print(menu);
        }
        if (books.isEmpty()) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу");
        }
        System.out.print("Выберите из списка меню. Введите номер нужной Вам операции и " +
                "для продолжения работы нажмите клавишу <Enter>: ");

    }

    private void printShelves(List<Book> books) {
        String dash = "-";
        String space = " ";

        int maxLength = 0;
        for (Book book : books) {
            if (maxLength < book.toString().toCharArray().length) {
                maxLength = book.toString().toCharArray().length;
            }
        }
        for (Book book : books) {
            if (maxLength > book.toString().toCharArray().length) {
                System.out.println("|" + book + space.repeat(maxLength - book.toString().toCharArray().length) + "|");
                System.out.println("|" + dash.repeat(maxLength) + "|");
            } else {
                System.out.println("|" + book + "|");
                System.out.println("|" + dash.repeat(book.toString().toCharArray().length) + "|");
            }
        }
    }
}


