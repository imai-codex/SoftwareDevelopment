package sdAddon;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class deletion {
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
		public void deleteAtPosition(int position) {
		    if (head == null || position < 0) {
		        System.out.println("Invalid position or empty list!");
		        return;
		    }
		    Node temp = head;
		    if (position == 0) {
		        head = head.next;
		        return;
		    }
		    int index = 0;
		    while (temp != null && index < position - 1) {
		        temp = temp.next;
		        index++;
		    }
		    if (temp == null || temp.next == null) {
		        System.out.println("Position out of bounds!");
		        return;
		    }
		    temp.next = temp.next.next;
		}
		public static void main(String[] args) {
			deletion ins=new deletion();
			ins.add(6);
			ins.add(54);
			ins.add(65);
			ins.add(77);
			ins.add(90);
			ins.add(2);
			ins.deleteAtPosition(5);
			ins.deleteAtPosition(0);
		}
	}


