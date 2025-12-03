package ru.itis.inf501.lab1_12.audit.methods;

public class LinkedList501 {
    private static class Node {

        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private int count;
    public LinkedList501() {
        head = null;
        count = 0;
    }


    public void add(int value) {
        Node newElem = new Node(value);
        if (head == null) {
            head = newElem;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newElem;
        }
        ++count;
    }

    public void add(int value, int position) {
        Node newElem = new Node(value);
        if (position == 0) {
            newElem.next = head;
            head = newElem;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; ++i) {
                current = current.next;
            }
            newElem.next = current.next;
            current.next = newElem;
        }
        ++count;
    }

    public int get(int position) {
        Node current = head;
        for (int i = 0; i < position; ++i) {
            current = current.next;
        }
        return current.value;
    }

    public int remove(int position) {
        int removedElem;
        if (position == 0) {
            removedElem = head.value;
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; ++i) {
                current = current.next;
            }
            removedElem = current.next.value;
            current.next = current.next.next;
        } //оч странно, переделать если что
        --count;
        return removedElem;
    }

    public int pop() {
        return remove(count - 1);
    }

    public int length() {
        return count;
    }



    public String toString() {
        String toReturn = "[";
        Node current = head;
        while (current != null) {
            toReturn += current.value + ", ";
            current = current.next;
        }
        toReturn = toReturn.substring(0, toReturn.length() - 2);
        toReturn += "]";

        return toReturn;
    }
}
