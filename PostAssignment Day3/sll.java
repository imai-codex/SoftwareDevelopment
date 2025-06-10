package sdAddon;
import java.util.Scanner;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class sll {
	 {
	    private Node head;

	    public SinglyLinkedList() {
	        head = null;
	    }

	    // Insert at beginning
	    public void insertAtBeginning(int value) {
	        Node newNode = new Node(value);
	        newNode.next = head;
	        head = newNode;
	        System.out.println("Node inserted at beginning.");
	    }

	    // Insert at end
	    public void insertAtEnd(int value) {
	        Node newNode = new Node(value);

	        if (head == null) {
	            head = newNode;
	        } else {
	            Node temp = head;
	            while (temp.next != null) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	        }
	        System.out.println("Node inserted at end.");
	    }

	    // Delete from beginning
	    public void deleteFromBeginning() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        head = head.next;
	        System.out.println("Node deleted from beginning.");
	    }

	    // Delete from end
	    public void deleteFromEnd() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        if (head.next == null) {
	            head = null;
	        } else {
	            Node temp = head;
	            while (temp.next.next != null) {
	                temp = temp.next;
	            }
	            temp.next = null;
	        }
	        System.out.println("Node deleted from end.");
	    }

	    // Display list
	    public void display() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        Node temp = head;
	        System.out.print("Linked List: ");
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }

	    public static void main(String[] args) {
	        SinglyLinkedList list = new SinglyLinkedList();
	        Scanner sc = new Scanner(System.in);
	        int choice, value;

	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Insert at Beginning");
	            System.out.println("2. Insert at End");
	            System.out.println("3. Delete from Beginning");
	            System.out.println("4. Delete from End");
	            System.out.println("5. Display");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value to insert: ");
	                    value = sc.nextInt();
	                    list.insertAtBeginning(value);
	                    break;
	                case 2:
	                    System.out.print("Enter value to insert: ");
	                    value = sc.nextInt();
	                    list.insertAtEnd(value);
	                    break;
	                case 3:
	                    list.deleteFromBeginning();
	                    break;
	                case 4:
	                    list.deleteFromEnd();
	                    break;
	                case 5:
	                    list.display();
	                    break;
	                case 6:
	                    System.out.println("Exiting program.");
	                    sc.close();
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }
	        }
	    }
	}

}
