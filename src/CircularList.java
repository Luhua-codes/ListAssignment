public class CircularList {
    private CircularListLink head;

    public CircularList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToList(String name, int age) {
        CircularListLink newLink = new CircularListLink(name, age, null);

        if(isEmpty()){
            head = newLink;
        }else{
            CircularListLink p = head;
            while(p.getNext() != head)
                p = p.getNext();
            p.setNext(newLink); //add new node to end
        } newLink.setNext(head); //point last node to head
        System.out.printf("%s has been added to the list%n", newLink);
    }

    public void dislay(){
        CircularListLink p = head;
        if(isEmpty()) {
            System.out.println("The list is is empty.");
            return;
        }

        do{
            System.out.println(p);
            p = p.getNext();
        }while(p != head);
    }
}
