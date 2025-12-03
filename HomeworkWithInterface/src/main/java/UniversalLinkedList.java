public class UniversalLinkedList {
    private Node head;
    private int count;

    public UniversalLinkedList() {
        head = null;
        count = 0;
    }

    public void add(Comparable value) {
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

    public void bubbleSort() {
        for (int n = 0; n < count - 1; ++n) {
            Node current = head;
            for (int i = 0; i < count - 1; ++i) {
                if (current.value.compareTo(current.next.value) > 0) {
                    Comparable characteristic = current.value;
                    current.value = current.next.value;
                    current.next.value = characteristic;
                }
                current = current.next;
            }
        }
    }
    public String toString() {
        String toReturn = "[";
        Node current = head;
        while (current != null) {
            toReturn += current.value.toString() + ", ";
            current = current.next;
        }
        toReturn = toReturn.substring(0, toReturn.length() - 2);
        toReturn += "]";

        return toReturn;
    }
}
