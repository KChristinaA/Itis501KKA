public class Person implements Comparable {
    public String name;
    public int height;

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public int compareTo(Comparable other) {
        return this.height - ((Person)other).height;
    }

    public String toString() {
        return name + " (" + height + " см)";
    }
}
