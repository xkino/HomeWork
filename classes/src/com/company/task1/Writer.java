package com.company.task1;

import java.util.Objects;

public class Writer {
    private String name;
    private String secondName;

    private void setName(String name) {
        Objects.requireNonNull(name, "name  не может быть null");
        this.name = name;
    }

    private void setSecondName(String secondName) {
        Objects.requireNonNull(secondName, "secondName  не может быть null");
        this.secondName = secondName;
    }

    public Writer(String name, String secondName) {
        setName(name);
        setSecondName(secondName);
    }

    @Override
    public String toString() {
        return "Writer{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
