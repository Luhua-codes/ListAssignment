public class DoubleLinkedListLink {
    private String name;
    private int age;
    private DoubleLinkedListLink next, prev;

    public DoubleLinkedListLink() {
        name = null;
        age = -1;
        next = null;
        prev = null;
    }

    public DoubleLinkedListLink(String name, int age) {
        this.name = name;
        this.age = age;
        this.next = null;
        this.prev = null;
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

    public DoubleLinkedListLink getNext() {
        return next;
    }

    public void setNext(DoubleLinkedListLink next) {
        this.next = next;
    }

    public DoubleLinkedListLink getPrev() {
        return prev;
    }

    public void setPrev(DoubleLinkedListLink prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d", name, age);
    }
}
