package com.company.task1;

public class App {
    public static void main(String[] args) {

        Writer writer1 = new Writer("Александ", "Пушкин");
        Writer writer2 = new Writer("Евгений", "Петров");
        Writer writer3 = new Writer("Илья", "Ильф");
        Writer guzel = new Writer("Гузель", "Яхина");
        Writer ivanov = new Writer("Алексей", "Иванов");
        Writer akunin = new Writer("Борис", "Акунин");

//        System.out.println(writer1.toString());

        Book book1 = new Book("Евгений Онегин", new Writer[]{writer1}, 410, 1950);
        Book book2 = new Book("12 стульев", new Writer[]{writer2, writer3}, 448, 2018);
        Book book3 = new Book("Эшелон на Самарканд", new Writer[]{guzel}, 480, 2019);
        Book book4 = new Book("Тени тевтонов", new Writer[]{ivanov}, 350, 2010);
        Book book5 = new Book("Инь и ян", new Writer[]{akunin}, 300, 2018);
        Book book6 = new Book("Детская книга", new Writer[]{akunin}, 370, 2018);
        Book book7 = new Book("Мир и война", new Writer[]{akunin}, 250, 2018);
        Book book8 = new Book("Пиковая дама", new Writer[]{writer1}, 174, 1834);
        Book book9 = new Book("Дубровский", new Writer[]{writer1}, 200, 1841);
        Book book10 = new Book("Золотой теленок", new Writer[]{writer2, writer3}, 448, 1931);
        Book book11 = new Book("Однажды летом", new Writer[]{writer2, writer3}, 450, 1937);

//        System.out.println(book1.toString());
//        System.out.println(book2.toString());


        Storage storage1 = new Storage(1);
        Storage storage2 = new Storage(2);

//        System.out.println(storage1.toString());

        storage1.addBook(book1);
        storage1.addBook(book1);
        storage1.addBook(book2);
        storage1.addBook(book3);
        storage1.addBook(book4);
        storage1.addBook(book5);
        storage1.addBook(book6);
        storage1.addBook(book7);
        storage1.addBook(book8);
        storage1.addBook(book9);
        storage1.addBook(book10);

        System.out.println(storage1.toString());
    }
}
