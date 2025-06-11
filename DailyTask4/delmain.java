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
class delmain{
    Node head;

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

    public int getLength() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public void deleteAtMiddle() {
        int length = getLength();
        if (length == 0) {
            System.out.println("List is empty.");
            return;
        }
        int mid = length / 2;
        Node temp = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }

        if (temp.prev == null) {
            head = temp.next;
            if (head != null) head.prev = null;
        }

        else {
            temp.prev.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = temp.prev;
            }
        }
 
        System.out.println("Deleted node with value: " + temp.data);
    }
    public void displayForward() {
        Node temp = head;
        System.out.print("Forward Traversal: ");
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? " <-> " : ""));
            temp = temp.next;
        }
        System.out.println();
    }
    public void displayBackward() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty.");
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        System.out.print("Backward Traversal: ");
        while (temp != null) {
            System.out.print(temp.data + (temp.prev != null ? " <-> " : ""));
            temp = temp.prev;
        }
        System.out.println();
    }
}
	public static void main(String[] args) {
		delmain dll = new delmain();

        dll.append(10);
        dll.append(20);
        dll.append(30);
        dll.append(40);
        dll.append(50);
        dll.displayForward();
        dll.displayBackward();
        dll.deleteAtMiddle();
        dll.displayForward();
        dll.displayBackward();
    }
