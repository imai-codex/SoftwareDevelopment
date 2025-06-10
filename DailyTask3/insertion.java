package sdAddon;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class insertion {
	Node head;
	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
	    head = newNode;
	    }
		else {
			Node temp = head;
	        while (temp.next != null) {
	        temp = temp.next;
	        }
	        temp.next = newNode;
	        }
		}
	public void printList() {
		Node temp = head;
	    while (temp != null) {
	    	System.out.print(temp.data + " ");
	        temp = temp.next;
	        }
	    System.out.println("null");
	    }
	public void insertAtPosition(int data, int position) {
	    if (position < 0) {
	        System.out.println("Invalid position!");
	        return;
	    }
	    Node newNode = new Node(data);
	    if (position == 0) { 
	        newNode.next = head;
	        head = newNode;
	        return;
	    }
	    Node temp = head;
	    int index = 0;
	    while (temp != null && index < position - 1) {
	        temp = temp.next;
	        index++;
	    }
	    if (temp == null) {
	        System.out.println("Position out of bounds!");
	        return;
	    }
	    newNode.next = temp.next;
	    temp.next = newNode;
	}
	public static void main(String[] args) {
		insertion ins=new insertion();
		ins.add(6);
		ins.add(54);
		ins.add(65);
		ins.add(77);
		ins.add(90);
		ins.add(2);
		ins.insertAtPosition(5,0);
		ins.insertAtPosition(11,4);
	}
}
