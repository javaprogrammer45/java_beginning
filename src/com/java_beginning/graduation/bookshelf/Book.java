package com.java_beginning.graduation.bookshelf;

public class Book {
    private String author;
    private String title;
    private int yearPublication;

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearPublication=" + yearPublication +
                '}';
    }
}
