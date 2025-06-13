package sdAddon;

public class CircularDeleteAtPosition {
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
	public void delete(int position) {
		if (head == null) {
			System.out.println("List is empty");
	        return;
	        }
		Node temp = head;
	    Node prev = null;
	    int count = 1;
	    if (position == 1) {
	    	if (head == last) {
	    		head = null;
	    		last = null;
	    		}
	    	else {
	    		head = head.next;
	    		last.next = head;
	    		}
	    	return;
	    	}
	    do {
	    	prev = temp;
	    	temp = temp.next;
	    	count++;
	    	if (temp == head) break;
	    	} while (count < position);
	    if (count == position) {
	    	prev.next = temp.next;
        if (temp == last) {
            last = prev;
        }
    } else {
        System.out.println("Invalid position");
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
		CircularDeleteAtPosition ts = new CircularDeleteAtPosition();
		ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(40);
        ts.delete(3);
        ts.delete(2);
        ts.display();
	}
}
