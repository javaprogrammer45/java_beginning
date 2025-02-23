package com.java_beginning.graduation.bookshelf;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bookshelf {
    private final static int ELEMENTS_QUANTITY = 3;
    public final static int BOOKS_QUANTITY = 10;
    private int counterBooks = 0;
    private String[] books = new String[BOOKS_QUANTITY];
    private Book book;

    public void printWelcome() {
        String welcome = "";
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
    }

    public void checkEmptyBookShelves() {
        int counter = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                counter++;
            }
        }
        if (counter == books.length) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу.");
        }
    }

    public void choiceMenu(int numberMenu) {
        Scanner scanner = new Scanner(System.in);
        switch (numberMenu) {
            case 1:
                String[] stringsInput;
                do {
                    System.out.println("Введите: автор книги, название книги, год публикации. Например:" +
                            " Ирвинг Стоун, Жажда жизни, 1973");

                    stringsInput = scanner.nextLine().trim().split(",");

                    if (stringsInput.length != ELEMENTS_QUANTITY) {
                        System.out.println("Не корректный ввод книги!!!");
                    }
                } while (stringsInput.length != ELEMENTS_QUANTITY);

                try {
                    int yearPublished = Integer.parseInt(stringsInput[2].trim());
                    book = new Book(stringsInput[0].trim(), stringsInput[1].trim(), yearPublished);
                } catch (NumberFormatException e) {
                    System.out.println("Неправильный формат года издания книги!!!");
                }

                try {
                    addBook(book);
                } catch (IncorrectInputBook | ArrayIndexOutOfBoundsException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                System.out.println("Введите: название книги. Например:" +
                        " Жажда жизни");
               String titleBook = scanner.nextLine().trim();
                deleteBook(titleBook);
                break;
            case 3:
                System.out.println("Введите: название книги. Например:" +
                        " Жажда жизни");
                titleBook = scanner.nextLine().trim();
                try {
                    searchGetBook(titleBook);
                } catch (NotFoundBookException ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            case 4:
                clearBookShelves();
            default:
                throw new InputMismatchException("Вы ввели недопустимую команду!!! Введите от 1 до 4");
        }
    }

    public void addBook(Book book) throws IncorrectInputBook, ArrayIndexOutOfBoundsException {
        if (counterBooks == BOOKS_QUANTITY) {
            throw new ArrayIndexOutOfBoundsException("В шкафу закончилось место!!!");
        }
        do {
            if (book.toString() != null || book.toString().isBlank() || book.toString().isEmpty() ||
                    !book.equals(books[counterBooks])) {
                books[counterBooks] = book.toString();
                counterBooks++;
                break;
            } else {
                throw new IncorrectInputBook("Введите корректно книгу!!!");
            }
        } while (true);
    }

    public void searchGetBook(String title) throws NotFoundBookException {
        int counter = 0;
        for (String book : books) {
            String[] elementsBook = book.split(",");
            if (elementsBook[1].trim().equals(title)) {
                System.out.println(book);
                counter++;
                break;
            }
        }
        if (counter == 0) {
            throw new NotFoundBookException("Книга не найдена!!!");
        }
    }

    public void deleteBook(String title) {
        if (books.length > 0) {
            for (int i = 0; i < books.length; i++) {
                String[] elementsBook = books[i].split(",");
                if (elementsBook[1].trim().equals(title)) {
                    System.arraycopy(books, i + 1, books, i, books.length - i - 1);
                    books[books.length - 1] = null;
                    break;
                }
            }
        }
        counterBooks--;
    }

    private int getFreeShelves() {
        int freeShelves = 0;
        for (String book : books) {
            if (book == null) {
                freeShelves++;
            }
        }
        return freeShelves;
    }

    public void clearBookShelves() {
        Arrays.fill(books, null);
    }

    public void printStateBooksShelves() {
        System.out.println("В шкафу книг - " + counterBooks + ", свободно полок - " + getFreeShelves());
    }

    public void printBooksShelves() {
        String dash = "-";
        String space = " ";
        int maxLength = 0;
        for (String book : books) {
            try {
                if (maxLength < book.toCharArray().length) {
                    maxLength = book.toCharArray().length;
                }
            } catch (NullPointerException e) {
                break;
            }
        }
        for (String book : books) {
            try {
                if (maxLength > book.toCharArray().length) {
                    System.out.println("|" + book + space.repeat(maxLength -
                            book.toCharArray().length) + "|");
                    System.out.println("|" + dash.repeat(maxLength) + "|");
                } else {
                    System.out.println("|" + book + "|");
                    System.out.println("|" + dash.repeat(book.toCharArray().length) + "|");
                }
            } catch (NullPointerException e) {
                break;
            }
        }
    }
}




