package sdAddon;

public class Queue {
	private int front, rear, size;
    private int capacity;
    private int[] queue;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = this.size = 0;
        this.rear = capacity - 1;
    }
    public void enqueue(int item) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
    }
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }
    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front, count = 0; count < size; count++) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        System.out.println("Dequeued: " + q.dequeue());
        q.display();
    }
}

