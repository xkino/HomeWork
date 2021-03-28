package com.company.task2;

import java.awt.*;
import java.util.Arrays;
import java.util.Objects;

public class Cat {
    private String name;
    private Color color;
    private int speed;
    private int weight;
    private Mouse[] trappedMice = new Mouse[10];

    private void setName(String name) {
        Objects.requireNonNull(name, "name  не может быть null");
        if (name.length() < 1) {
            throw new IllegalArgumentException("name  не может быть меньше 1");
        }
        this.name = name;
    }

    private void setColor(Color color) {
        Objects.requireNonNull(color, "color  не может быть null");
        this.color = color;
    }

    private void setSpeed(int speed) {
        if (speed <= 0) {
            throw new IllegalArgumentException("speed  не может быть меньше или равно 0");
        }
        this.speed = speed;
    }

    private void setWeight(int weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("weight  не может быть меньше или равно 0");
        }
        this.weight = weight;
    }

    public Cat(String name, Color color, int speed, int weight) {
        setName(name);
        setColor(color);
        setSpeed(speed);
        setWeight(weight);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", speed=" + speed +
                ", weight=" + weight +
                ", trappedMice=" + Arrays.toString(trappedMice) +
                '}';
    }

    public void addMouse(Mouse mouse) {
        Objects.requireNonNull(mouse, "mouse  не может быть null");
        if (speed > mouse.getSpeed()) {
            for (int i = 0; i < trappedMice.length; i++) {
                if (trappedMice[i] == null) {
                    trappedMice[i] = mouse;
                    return;
                }
            }
        } else {
            System.out.println("Не догнал.");
        }
    }

    public void attackCat(Cat cat) {
        Objects.requireNonNull(cat, "cat  не может быть null");
        if (weight > cat.weight) {
            for (int i = 0; i < cat.trappedMice.length; i++) {
                if (cat.trappedMice[i] == null) continue;   // нет мыши

                for (int j = 0; j < trappedMice.length; j++) {
                    if (trappedMice[j] == null && speed > cat.trappedMice[i].getSpeed()) {
                        trappedMice[j] = cat.trappedMice[i];
                        break;
                    }
                }

                cat.trappedMice[i] = null;
            }
        } else {
            System.out.println(cat.name + " больше чем " + name);
        }
    }


}
