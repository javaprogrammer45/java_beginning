package com.java_beginning.graduation.bookshelf;

import java.util.*;

public class Bookshelf {
    private int quantityBooks;
    private Book book;
    private List<Book> books =new ArrayList<>();
    private boolean isStarted = true;
//    private int quantityElements;
    private List<Integer> elements = new ArrayList<>();

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
                System.out.print("Ошибка!!! Такого пункта меню в списке нет.\nВведите номер нужной Вам операции, например: 1. Для продолжения работы нажмите клавишу <Enter>: ");
                isInt = false;
            }
        } while (!isInt);
        choiceMenu(books, new Book(), numberMenu);
        printShelves(books);
        return welcome;
    }

    public void choiceMenu(List<Book> books, Book book, int numberMenu) {
        Scanner scanner = new Scanner(System.in);
        switch (numberMenu) {
            case 1:
                System.out.println("Введите(автор книги, название книги, год публикации). Например:" +
                        " Ирвинг Стоун, Жажда жизни, 1973");
                String nameBook = scanner.nextLine();
//                char[] letters = nameBook.toCharArray();
//                quantityElements = letters.length;
                String[] stringsInput = nameBook.trim().split(",");
                book.setAuthor(stringsInput[0].trim());
                book.setTitle(stringsInput[1].trim());
                try {
                    int yearPublished = Integer.parseInt(stringsInput[2].trim());
                    book.setYearPublication(yearPublished);
                } catch (NumberFormatException e) {
                    System.out.println("Неправильный формат строки!!!");
                }
                addBook(books, book);
            case 2:
            case 3:
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

    public void clearBookShelf(List<Book> books) {
        books.clear();
        quantityBooks = 0;
    }

    public void printMenu() {
        System.out.println("---Меню: ");
        Menu[] elementsMenu = Menu.values();
        for (Menu menu : elementsMenu) {
            System.out.print(menu);
        }
        System.out.print("Выберите из списка меню. Введите номер нужной Вам операции, например:" +
                " 1. Для продолжения работы нажмите клавишу <Enter>: ");
    }

    private void printShelves(List<Book> books) {


//        elements.add(letters.length);
//        int max = 0;
//        int min = elements.get(0);
//        for (Integer integer : elements) {
//            if (integer.intValue() > max) {
//                max = integer.intValue();
//            }
//            if (integer.intValue() < min) {
//                min = integer.intValue();
//            }
//        }

        String dash = "-";
//        int sizeBOO
        for (Book book : books) {
//            if (book.toString().toCharArray().length ==max) {
//                System.out.print("|" + book + "|\n" + "|" + dash.repeat(max) + "|\n");
//            } else {
//                System.out.print("|" + book + " ".repeat(max - min) + "|\n" + "|" + dash.repeat(max) + "|\n");
//            }
//            book.toString().toCharArray().length
        }
    }
}


