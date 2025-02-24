package com.java_beginning.graduation.bookshelf;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookshelfTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BookshelfTest bookshelfTest = new BookshelfTest();
        Bookshelf bookshelf = new Bookshelf();
        Book book = null;
        bookshelfTest.printWelcome();
        do {
            bookshelfTest.checkEmptyBookShelves(bookshelf.getBooks());
            bookshelfTest.printMenu();

            int numberMenu = input.nextInt();
            try {
                bookshelfTest.choiceMenu(numberMenu, bookshelf, book);
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
            System.out.print("Для продолжения работы  введите [enter]  и нажмите клавишу <Enter>: ");
            String answer = input.next();
            bookshelfTest.printStateBooksShelves(bookshelf.getCounterBooks(), bookshelf.getFreeShelves());
            bookshelfTest.printBooksShelves(bookshelf.getBooks());
        } while (true);
    }

    public void printWelcome() {
        try {
            String welcome = "Welcome to the Bookshelf !!!";
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

    public void printMenu() {
        System.out.println("\n---Меню: ");
        Menu[] elementsMenu = Menu.values();
        for (Menu menu : elementsMenu) {
            System.out.print(menu);
        }
        System.out.print("Выберите из списка меню. Введите номер нужной Вам операции и " +
                "для продолжения работы нажмите клавишу <Enter>: ");
    }

    public void checkEmptyBookShelves(String[] books) {
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

    public void choiceMenu(int numberMenu, Bookshelf bookshelf, Book book) {
        Scanner scanner = new Scanner(System.in);
        String titleBook = "";
        switch (numberMenu) {
            case 1:
                String[] stringsInput;
                do {
                    System.out.println("Введите: автор книги, название книги, год публикации. Например:" +
                            " Ирвинг Стоун, Жажда жизни, 1973");

                    stringsInput = scanner.nextLine().trim().split(",");

                    if (stringsInput.length != Bookshelf.ELEMENTS_QUANTITY) {
                        System.out.println("Не корректный ввод книги!!!");
                    }
                } while (stringsInput.length != Bookshelf.ELEMENTS_QUANTITY);

                try {
                    int yearPublished = Integer.parseInt(stringsInput[2].trim());
                    book = new Book(stringsInput[0].trim(), stringsInput[1].trim(), yearPublished);
                } catch (NumberFormatException e) {
                    System.out.println("Неправильный формат года издания книги!!!");
                }

                try {
                    bookshelf.addBook(book);
                } catch (IncorrectInputBook | ArrayIndexOutOfBoundsException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                System.out.println("Введите: название книги. Например:" +
                        " Жажда жизни");
                titleBook = scanner.nextLine().trim();
                bookshelf.deleteBook(titleBook);
                break;
            case 3:
                System.out.println("Введите: название книги. Например:" +
                        " Жажда жизни");
                titleBook = scanner.nextLine().trim();
                try {
                    bookshelf.searchGetBook(titleBook);
                } catch (NotFoundBookException ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            case 4:
                bookshelf.clearBookShelves();
                break;
            default:
                throw new InputMismatchException("Вы ввели недопустимую команду!!! Введите от 1 до 4");
        }
    }

    public void printStateBooksShelves(int counterBooks, int freeShelves) {
        System.out.println("В шкафу книг - " + counterBooks + ", свободно полок - " + freeShelves);
    }

    public void printBooksShelves(String[] books) {
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
