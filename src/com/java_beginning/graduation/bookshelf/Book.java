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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + yearPublished;
    }
}
