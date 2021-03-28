package com.company.task1;

import java.util.Arrays;
import java.util.Objects;

public class Storage {
    private Book[] books = new Book[10];
    private int number;

    private void setBooks(Book[] books) {
        books = books;
    }

    private void setNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("number не может быть меньше 0");
        }
        this.number = number;
    }

    public Storage(int number) {
        setNumber(number);
    }

    @Override
    public String toString() {
        return "Storage{" +
                "Books=" + Arrays.toString(books) +
                ", number=" + number +
                '}';
    }

    // добавление книги
    public void addBook(Book book) {
        Objects.requireNonNull(book, "book не может быть null");
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                if (checkForUniqueness(book)) {
                    books[i] = book;
                } else {
                    System.out.println(book.toString() + " уже есть в хранилище.");
                }
                return;
            }
        }

    }

    // проверка на уникальность добавляемых книг
    private boolean checkForUniqueness(Book book) {
        for (Book bookArr : books) {
            if (bookArr == null) continue;
            if (bookArr.getName().equals(book.getName())) {
                return false;
            }
        }
        return true;
    }
}


