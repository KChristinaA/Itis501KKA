//package ru.itis.inf501.lab1_12.linkedlist;
//
//public class LinkedListMain {
//    public static void main(String[] args) {
//        // создали первый элемент, он же - голова связного списка
//        Node head = new Node(10);
//
//        Node element2 = new Node(3);
//        // свяжем второй элемент с первым
//        head.next = element2;
//
//        Node element3 = new Node(4);
//        // свяжем второй элемент с третьим
//        element2.next = element3;
//
//        Node element4 = new Node(1);
//        // свяжем второй элемент с третьим
//        element3.next = element4;
//
//        Node element5 = new Node(7);
//        // свяжем второй элемент с третьим
//        element4.next = element5;
//
//        // перебор всех элементов
//        // Заводим переменную указатель на текущий элемент
//        // Начинаем с головы
//        Node current = head;
////        while (current != null) {
////            // выводим значение текущего элемента
////            System.out.println(current.value);
////            // двигаемся к следующему
////            current = current.next;
////        }
//
//        // подставляем в начало
//        Node first = new Node(9);
//        first.next = head;
//        head = first;
//
////        current = head;
////        while (current != null) {
////            // выводим значение текущего элемента
////            System.out.println(current.value);
////            // двигаемся к следующему
////            current = current.next;
////        }
//
//        // вставляем в позицию 3, сдвигая значения
//        // т.е. новый элемент встаёт после второго
//        current = head;
//        for (int i = 0; i < 2; ++i) {
//            current = current.next;
//        }
//        Node temp = current.next; // сохраняем ссылку на 3 элемент
//        Node p = new Node(18); // новый элемент
//        current.next = p; //меняем ссылку второго элемента с третьего на новый
//        p.next = temp; // теперь новый элемент ссылается на старый третий
//
//        current = head;
//        while (current != null) {
//            // выводим значение текущего элемента
//            System.out.println(current.value);
//            // двигаемся к следующему
//            current = current.next;
//        }
//
//    }
//}
