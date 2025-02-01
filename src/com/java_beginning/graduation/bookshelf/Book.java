package com.java_beginning.graduation.bookshelf;

public class Book {
    private String author;
    private String title;
    private int yearPublished;

    public Book() {


    }

    public Book(String author, String title, int yearPublication) {
        this.author = author;
        this.title = title;
        this.yearPublished = yearPublication;
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

    public int getYearPublication() {
        return yearPublished;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublished = yearPublication;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + yearPublished;
    }
}
