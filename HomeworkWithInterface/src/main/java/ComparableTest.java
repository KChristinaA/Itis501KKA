public class ComparableTest {
    public static void main(String[] args) {
        UniversalLinkedList people = new UniversalLinkedList();
        people.add(new Person("Эльвина", 159));
        people.add(new Person("Малика", 180));
        people.add(new Person("Кристина", 169));
        people.add(new Person("Рамиль", 173));
        people.add(new Person("Алёна", 162));

        System.out.println("Изначальный список: " + people.toString());
        people.bubbleSort();
        System.out.println("Отсортированный список: " + people.toString());
    }
}
