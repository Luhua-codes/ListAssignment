public class DoubleLinkedList {
    private DoubleLinkedListLink head, tail;

    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    public DoubleLinkedList(DoubleLinkedListLink head, DoubleLinkedListLink tail) {
        this.head = head;
        this.tail = tail;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertFront(String name, int age) {
        DoubleLinkedListLink newLink = new DoubleLinkedListLink(name, age);
        if (isEmpty()) {
            head = newLink;
            tail = newLink;
        } else {
            newLink.setNext(head);
            head.setPrev(newLink);
            head = newLink;
        }
        System.out.printf("%s has been added to the front of the list%n", newLink);
    }

    public void insertBack(String name, int age) {
        DoubleLinkedListLink newLink = new DoubleLinkedListLink(name, age);
        if (isEmpty()) {
            head = newLink;
            tail = newLink;
        } else {
            newLink.setPrev(tail);
            tail.setNext(newLink);
            tail = newLink;
        }
        System.out.printf("%s has been added to the back of the list%n", newLink);
    }

    public void display() {
        DoubleLinkedListLink p = head;
        if (isEmpty()) {
            System.out.println("The list is is empty.");
            return;
        }

        do {
            System.out.println(p);
            p = p.getNext();
        } while (p != null);
    }

    public void displayReversal() {
        DoubleLinkedListLink p = tail;
        if (isEmpty()) {
            System.out.println("The list is is empty.");
            return;
        }

        do {
            System.out.println(p);
            p = p.getPrev();
        } while (p != null);
    }

    public void peek() {
        System.out.println(head);
    }

    public void removeFront() {
        head = head.getNext();
        head.setPrev(null);
        System.out.printf("The head has been removed. The new head is %s.%n", head);
    }

    public void removeLast() {
        tail = tail.getPrev();
        tail.setNext(null);
        System.out.printf("The tail has been removed. The new tail is %s.%n", tail);
    }

    public void deleteLink(String name) { //delete by name
        if (!isEmpty()) {
            DoubleLinkedListLink p = head, toDelete = null;
            while (p != null) {
                if (p.getName().equalsIgnoreCase(name)) {
                    toDelete = p;
                    break;
                }
                p = p.getNext();
            }
            if (toDelete != null) {
                if(toDelete != head)
                    toDelete.getPrev().setNext(toDelete.getNext());
                else
                    head = toDelete.getNext();
                if(toDelete != tail)
                    toDelete.getNext().setPrev(toDelete.getPrev());
                else
                    tail = toDelete.getPrev();
                System.out.println("Link successfully deleted.");
                return;
            }
        }
        System.out.println("Link not found. Nothing to delete.");
    }

    public DoubleLinkedListLink getHead() {
        return head;
    }

    public void setHead(DoubleLinkedListLink head) {
        this.head = head;
    }

    public DoubleLinkedListLink getTail() {
        return tail;
    }

    public void setTail(DoubleLinkedListLink tail) {
        this.tail = tail;
    }
}
