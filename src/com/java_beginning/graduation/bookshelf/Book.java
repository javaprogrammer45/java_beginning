package com.java_beginning.graduation.bookshelf;

public class Book {
    private String author;
    private String title;
    private int yearPublished;

    public Book(String author, String title, int yearPublished) {
        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + yearPublished;
    }
}
