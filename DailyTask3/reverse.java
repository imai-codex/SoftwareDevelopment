package sdAddon;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class reverse {
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
		    	System.out.print(temp.data + " -> ");
		        temp = temp.next;
		        }
		    System.out.println("null");
		    }
		public void reverse() {
		    Node prev = null;
		    Node current = head;
		    Node next = null;
		    while (current != null) {
		        next = current.next;
		        current.next = prev;
		        prev = current; 
		        current = next; 
		    }
		    head = prev; 
		}
		public static void main(String[] args) {
			reverse res=new reverse();
			res.add(6);
			res.add(34);
			res.add(87);
			res.add(68);
			res.add(66);
			res.reverse();
		}
	}

