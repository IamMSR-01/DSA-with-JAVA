public class Linkedlist {
    Node head;
    private int size;

    Linkedlist(){
        this.size = 0;
    }

    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList(){
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

     public void deleteFirst(){
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secLast = secLast.next;
        }
        secLast.next = null;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        Linkedlist linkedlist = new Linkedlist();
        linkedlist.addFirst("H");
        linkedlist.addFirst("S");
        linkedlist.addLast("A");
        linkedlist.addLast("Q");
        linkedlist.addLast("I");
        linkedlist.addLast("B");
        linkedlist.addLast("R");
        linkedlist.addLast("A");
        linkedlist.addLast("Z");
        linkedlist.addLast("A");
        linkedlist.printList(); 
        linkedlist.deleteFirst();
        linkedlist.deleteFirst();
        linkedlist.deleteLast();
        linkedlist.deleteLast();
        linkedlist.printList();
        System.out.println(linkedlist.getSize());
    }
}