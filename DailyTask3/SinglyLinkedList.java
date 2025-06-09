package sdAddon;
class node{
	int data;
	node next;
	node(int value) {
		data=value;
		next=null;
	}
}
public class SinglyLinkedList {
	node head;
	public void insert(int value) {
		node newnode=new node(value);
		if(head==null) {
			newnode.next=null;
			head = newnode;
		}
		System.out.print(" "+value);
	}
	public static void main(String[]args) {
		SinglyLinkedList myobj=new SinglyLinkedList();
		myobj.insert(55);
		myobj.insert(78);
		myobj.insert(32);
		myobj.insert(65);
		myobj.insert(95);
		myobj.insert(5);
	}
}
