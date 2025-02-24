package com.java_beginning.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    public final static int ELEMENTS_QUANTITY = 3;
    public final static int BOOKS_QUANTITY = 10;
    private int counterBooks = 0;
    private String[] books = new String[BOOKS_QUANTITY];

    public int getCounterBooks() {
        return counterBooks;
    }

    public String[] getBooks() {
        return books;
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

    public int getFreeShelves() {
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
}




