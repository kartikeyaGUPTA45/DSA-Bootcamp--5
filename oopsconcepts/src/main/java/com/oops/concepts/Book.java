package com.oops.concepts;

public class Book {

    public String author;
    public String title;
    public int isbn;
    public boolean isAvailable;

    public Book() {
        // default constructor
        System.out.println("I am a default constructor");
    }

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public Book(String author, int isbn) {
        this.title = "default";
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public boolean borrowBook() {
        if (this.isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public void returnBook() {
        this.isAvailable = true;
        System.out.println("Book :" + this.title + " is available now");
    }

    public void displayInfo() {
        System.out.println("Book : " + title + " written by: " + author + " isbn number: " + isbn + " available status: " + isAvailable);
    }
}
