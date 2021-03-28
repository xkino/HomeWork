package com.company.task2;

import java.awt.*;

public class App {
    public static void main(String[] args) {
        Mouse mouse1 = new Mouse(1);
        Mouse mouse2 = new Mouse(2);
        Mouse mouse3 = new Mouse(3);
        Mouse mouse4 = new Mouse(4);
        Mouse mouse5 = new Mouse(5);
        Mouse mouse6 = new Mouse(6);
        Mouse mouse7 = new Mouse(7);


        Cat cat1 = new Cat("Кеша", Color.orange, 100, 10);
        Cat cat2 = new Cat("Филька", Color.black, 5, 8);
        Cat cat3 = new Cat("Борис", Color.black, 10, 5);

        for (int i = 0; i < 3; i++) {
            cat3.addMouse(mouse1);
        }

        for (int i = 0; i < 4; i++) {
            cat3.addMouse(mouse6);
        }

        for (int i = 0; i < 5; i++) {
            cat3.addMouse(mouse3);
        }

        for (int i = 0; i < 3; i++) {
            cat2.addMouse(mouse1);
        }

        for (int i = 0; i < 10; i++) {
            cat1.addMouse(mouse7);
        }


        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
        System.out.println(cat3.toString());

        cat2.attackCat(cat3);
        cat2.attackCat(cat1);

        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
        System.out.println(cat3.toString());


    }
}
