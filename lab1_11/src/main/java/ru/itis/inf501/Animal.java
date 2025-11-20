package ru.itis.inf501;

public class Animal {
    protected String name;

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
        System.out.println(name + " moved");
    }

    public String toString() {
        return "Зверушка - " + name;
    }
}
