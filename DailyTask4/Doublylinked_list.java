package sdAddon;

public class Doublylinked_list {
    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int val) {
            data = val;
            next = null;
            prev = null;
        }
    }

    public Doublylinked_list() {
        head = null;
    }
    public void insertAtBegin(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;  
            head.prev = newNode;  
            head = newNode;       
        }
    }

    public void displayForward() {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void displayBackward() {
        if (head == null) return;

        Node temp = head;
        
        while (temp.next != null) {
            temp = temp.next;
        }

        System.out.print("Backward: ");
       
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
    	Doublylinked_list dll = new Doublylinked_list();

        dll.insertAtBegin(26);
        dll.insertAtBegin(11);
        dll.insertAtBegin(55);
        dll.insertAtBegin(98);
        dll.insertAtBegin(6);
        dll.displayForward();  
        dll.displayBackward();  
    }
}
