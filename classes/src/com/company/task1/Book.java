package com.company.task1;

import java.util.Arrays;
import java.util.Objects;

public class Book {

    private String name;
    private Writer[] writers;
    private int pages;
    private int age;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        Objects.requireNonNull(name, "name  не может быть null");
        if (name.length() < 1) {
            throw new IllegalArgumentException("name  не может быть меньше 1");
        }
        this.name = name;
    }

    private void setWriters(Writer[] writers) {
        if (writers.length <= 0) {
            throw new IllegalArgumentException("Книга не может быть без автора.");
        }

        this.writers = writers;
    }

    private void setPages(int pages) {
        Objects.requireNonNull(pages, "pages  не может быть null");
        if (pages < 10) {
            throw new IllegalArgumentException("pages  не может быть меньше 10");
        }

        this.pages = pages;
    }

    private void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("age  не может быть меньше или равно 0");
        }

        this.age = age;
    }

    public Book(String name, Writer[] writers, int pages, int age) {
        setName(name);
        setWriters(writers);
        setPages(pages);
        setAge(age);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", writers=" + Arrays.toString(writers) +
                ", pages=" + pages +
                ", age=" + age +
                '}' + "\n";
    }
}
