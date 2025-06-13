package sdAddon;

public class CircularInsertion {
	class Node
	{
		int data;
	    Node next;
	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	Node head = null;
	Node last = null;
	public void add(int data) {
		Node newNode = new Node(data);
	    if (head == null) {
	    	head = newNode;
	        last = newNode;
	        last.next = head;
	        }
	    else{
	    	last.next = newNode;
	        last = newNode;
	        last.next = head; 
	        }
	    }
	public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            last = newNode;
            last.next = head; // Make it circular
        } else {
            last.next = newNode;
            last = newNode;
            last.next = head; // Keep the circular link
        }
    }
	public void display() {
		if (head == null) {
	    System.out.println("List is empty");
	    return;
	    }
		Node temp = head;
	    do {
	    	System.out.print(temp.data + " -> ");
	        temp = temp.next;
	        } while (temp != head);
	    System.out.println(temp.data);
	    }
	public static void main(String[] args) {
		CircularInsertion ts = new CircularInsertion();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		ts.add(60);
		ts.insert(70);
		ts.display();
	}
}
