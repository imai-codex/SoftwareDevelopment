package sdAddon;
import java.util.Scanner;
class Node {
    int data;
    Node prev;
    Node next;
 
    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class DoublyLinkedListPost {
	    Node head;
	 
	    // Append a node at the end
	    public void append(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node temp = head;
	        while (temp.next != null)
	            temp = temp.next;
	        temp.next = newNode;
	        newNode.prev = temp;
	    }
	 
	    // Get length of the list
	    public int getLength() {
	        int count = 0;
	        Node temp = head;
	        while (temp != null) {
	            count++;
	            temp = temp.next;
	        }
	        return count;
	    }
	 
	    // Insert node at the middle
	    public void insertAtMiddle(int data) {
	        Node newNode = new Node(data);
	        int len = getLength();
	 
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	 
	        int mid = len / 2;
	        Node temp = head;
	        for (int i = 0; i < mid - 1 && temp.next != null; i++) {
	            temp = temp.next;
	        }
	 
	        newNode.next = temp.next;
	        if (temp.next != null)
	            temp.next.prev = newNode;
	        temp.next = newNode;
	        newNode.prev = temp;
	    }
	 
	    // Delete node from the middle
	    public void deleteAtMiddle() {
	        int len = getLength();
	 
	        if (len == 0) {
	            System.out.println("List is empty.");
	            return;
	        }
	 
	        int mid = len / 2;
	        Node temp = head;
	        for (int i = 0; i < mid; i++) {
	            temp = temp.next;
	        }
	 
	        if (temp.prev == null) { // Only one node or deleting head
	            head = temp.next;
	            if (head != null)
	                head.prev = null;
	        } else {
	            temp.prev.next = temp.next;
	            if (temp.next != null)
	                temp.next.prev = temp.prev;
	        }
	 
	        System.out.println("Deleted node with value: " + temp.data);
	    }
	 
	    // Traverse from front
	    public void traverseFromFront() {
	        Node temp = head;
	        System.out.print("List (Front to Back): ");
	        while (temp != null) {
	            System.out.print(temp.data + (temp.next != null ? " <-> " : ""));
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	 
	    // Traverse from back
	    public void traverseFromBack() {
	        Node temp = head;
	        if (temp == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	 
	        while (temp.next != null)
	            temp = temp.next;
	 
	        System.out.print("List (Back to Front): ");
	        while (temp != null) {
	            System.out.print(temp.data + (temp.prev != null ? " <-> " : ""));
	            temp = temp.prev;
	        }
	        System.out.println();
	    }
	}
	 
	public class Main {
	    public static void main(String[] args) {
	        DoublyLinkedList dll = new DoublyLinkedList();
	        Scanner sc = new Scanner(System.in);
	        int choice, value;
	 
	        do {
	            System.out.println("\n--- Doubly Linked List Menu ---");
	            System.out.println("1. Append Node");
	            System.out.println("2. Insert Node at Middle");
	            System.out.println("3. Delete Node from Middle");
	            System.out.println("4. Traverse from Front");
	            System.out.println("5. Traverse from Back");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	 
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value to append: ");
	                    value = sc.nextInt();
	                    dll.append(value);
	                    break;
	 
	                case 2:
	                    System.out.print("Enter value to insert at middle: ");
	                    value = sc.nextInt();
	                    dll.insertAtMiddle(value);
	                    break;
	 
	                case 3:
	                    dll.deleteAtMiddle();
	                    break;
	 
	                case 4:
	                    dll.traverseFromFront();
	                    break;
	 
	                case 5:
	                    dll.traverseFromBack();
	                    break;
	 
	                case 6:
	                    System.out.println("Exiting...");
	                    break;
	 
	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	 
	        } while (choice != 6);
	 
	        sc.close();
	    }
	}

