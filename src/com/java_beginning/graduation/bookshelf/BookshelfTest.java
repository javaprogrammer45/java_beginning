package com.java_beginning.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bookshelf bookshelf = new Bookshelf();

        do {
//            bookshelf.start();
            System.out.print("Для продолжения работы нажмите клавишу <Enter>: ");
            String answer = input.nextLine().toLowerCase();
        } while (true);
    }
}
