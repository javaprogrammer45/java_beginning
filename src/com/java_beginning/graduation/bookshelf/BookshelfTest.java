package com.java_beginning.graduation.bookshelf;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookshelfTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BookshelfTest bookshelfTest = new BookshelfTest();
        Bookshelf bookshelf = new Bookshelf();
        bookshelf.printWelcome();
        do {
            bookshelf.checkEmptyBookShelves();
            bookshelfTest.printMenu();

            int numberMenu = input.nextInt();
            try {
                bookshelf.choiceMenu(numberMenu);
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
            System.out.print("Для продолжения работы  введите [enter]  и нажмите клавишу <Enter>: ");
            String answer = input.next();
            bookshelf.printStateBooksShelves();
            bookshelf.printBooksShelves();
        } while (true);
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
}
