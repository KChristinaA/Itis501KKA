package ru.itis.inf501;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        this.name = this.getClass().getName(); //имя класса
    }

    public String getName() {
        return name;
    }

    public void move() {

    }

    public String toString() {
        return "Зверушка - " + name;
    }
}
