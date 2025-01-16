package com.java_beginning.graduation.bookshelf;

public enum Menu {
    SAVE_NEW_BOOK("""
            1. Сохранить книгу
            """),
    DELETE_BOOK("""
            2. Удалить книгу
            """),
    SEARCH_BOOK("""
            3. Искать книгу
            """),
    CLEAR_BOOKSHELF("""
            4. Очистить шкаф
            """);

    private String title;

    Menu(String title) {
        this.title = title;
    }



    @Override
    public String toString() {
        return title;
    }
}
