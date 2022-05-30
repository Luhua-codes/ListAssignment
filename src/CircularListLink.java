public class CircularListLink {
    private String name;
    private int age;
    private CircularListLink next;

    public CircularListLink(String name, int age, CircularListLink next) {
        this.name = name;
        this.age = age;
        this.next = next;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CircularListLink getNext() {
        return next;
    }

    public void setNext(CircularListLink next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d", name, age);
    }
}
