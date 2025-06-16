package sdAddon;
import java.util.Scanner;
public class CircularMenu {
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
		CircularMenu ts = new CircularMenu();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Addition");
		System.out.println("2.Insertion");
		System.out.println("3.Deletion");
		System.out.println("4.Display");
		System.out.println("5.Exit");
		while(true) {
			System.out.println("Enter Your Choice");
			int a = sc.nextInt();
			switch(a){
			case 1:
				System.out.println("Enter a Value:");
				int b= sc.nextInt();
				ts.add(b);
				break;
			case 2:
				System.out.println("Enter a Value:");
				int c= sc.nextInt();
				ts.insert(c);
				break;
			case 3:
				System.out.println("Enter the Position");
				int d = sc.nextInt();
				ts.delete(d);
				break;
			case 4:
				ts.display();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}
	}
}

