package sdAddon;
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
public class DoublyLinkedListMain {
	 Node head;
	 
	    // Append node to end of the list
	    public void append(int data) {
	        Node newNode = new Node(data);
	 
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	 
	        Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	 
	        temp.next = newNode;
	        newNode.prev = temp;
	    }
	 
	    // Traverse from head to tail
	    public void traverseFromFront() {
	        Node temp = head;
	        System.out.print("Traversing from Front: ");
	        while (temp != null) {
	            System.out.print(temp.data + (temp.next != null ? " <-> " : ""));
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	 
	    // Traverse from tail to head
	    public void traverseFromBack() {
	        Node temp = head;
	        if (temp == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	 
	        // Move to the last node
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	 
	        System.out.print("Traversing from Back: ");
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
	 
	        // Adding nodes to the list
	        dll.append(10);
	        dll.append(20);
	        dll.append(30);
	        dll.append(40);
	 
	        // Display both traversals
	        dll.traverseFromFront(); // Output: 10 <-> 20 <-> 30 <-> 40
	        dll.traverseFromBack();  // Output: 40 <-> 30 <-> 20 <-> 10
	    }
	}
}
