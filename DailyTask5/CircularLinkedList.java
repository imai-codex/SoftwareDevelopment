class CircularLinkedList {
    private static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node tail; 
    private int size;
    public CircularLinkedList() {
        tail = null;
        size = 0;
    }
    public void add(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public void printList() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = tail.next; // head
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != tail.next);
        System.out.println();
    }
    public int size() {
        return size;
    }
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.printList();
    }
}
