package com.java_beginning.graduation.bookshelf;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
    private int quantityBooks;
    private List<Book> books = new ArrayList<Book>();
    private  Menu menu;

    public Bookshelf() {}

    public Bookshelf(int quantityBooks,List<Book> books){
        this.quantityBooks = quantityBooks;
        this.books = books;
    }

    public String start() {
        String welcome = "";
        try {
            welcome = "Welcome to the Bookshelf !!!";
            char[] letters = welcome.toCharArray();
            for (char letter : letters) {
                System.out.print(letter);
                Thread.sleep(300);
            }
            System.out.print("  ");
        } catch (InterruptedException e) {
            e.getMessage();
            System.out.println("Welcome to the Bookshelf !!!");
        }
        System.out.println(" Шкаф пуст. Вы можете добавить в него первую книгу...");





            return welcome;
    }

}


