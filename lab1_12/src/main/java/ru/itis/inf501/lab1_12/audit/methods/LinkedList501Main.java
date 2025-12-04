package ru.itis.inf501.lab1_12.audit.methods;

public class LinkedList501Main {
    public static void main(String[] args) {
        LinkedList501 list = new LinkedList501();
        list.add(9);
        list.add(7);
        list.add(5);
        list.add(1);
        System.out.println("Изначальный список: " + list.toString());
        list.add(8);
        System.out.println("Добавление элемента 8: " + list.toString());
        list.add(0, 3);
        System.out.println("Добавление элемента 0 на позицию 3: " + list.toString());
        System.out.println("Получение элемента по позиции 1: " + list.get(1));
        System.out.println("Удаление элемента по позиции 4, его значение: " + list.remove(4) + "\nИсправленная версия списка: " + list.toString());
        System.out.println("Удаление последнего элемента, его значение: " + list.pop() + "\nИсправленная версия списка: " + list.toString());
        System.out.println("Длина списка: " + list.length());
        list.bubbleSort();
        System.out.println("Отсортированный список: " + list.toString());
    }
}
