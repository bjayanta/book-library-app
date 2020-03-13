package com.example.booklibraryapp;

public class Model {
    private int id, book_pages;
    private String book_title, book_author;

    public Model(int id, int book_pages, String book_title, String book_author) {
        this.id = id;
        this.book_pages = book_pages;
        this.book_title = book_title;
        this.book_author = book_author;
    }

    public int getId() {
        return id;
    }

    public int getBook_pages() {
        return book_pages;
    }

    public String getBook_title() {
        return book_title;
    }

    public String getBook_author() {
        return book_author;
    }
}
