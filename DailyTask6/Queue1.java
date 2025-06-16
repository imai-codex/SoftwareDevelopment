package sdAddon;

import java.util.Arrays;
import java.util.Scanner;

public class Queue1 {
	int arr[] = new int[5];
	int rear;
	int front;
	public void queue() {
		rear=-1;
		front=-1;
	}
	public void re(int num) {
		if(rear==4) {
			System.out.println("Queue Spreadout");
		}
		else {
			arr[++rear]=num;
		}
	}
	public void fr() {
		if(front==4) {
			System.out.println("Empty Queue");
		}
		else {
			arr[++front]=0;
		}
	}
	public void display() {
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue1 ts = new Queue1();
		ts.re(4);
		ts.re(5);
		ts.re(8);
		ts.fr();
		ts.re(7);
		ts.display();
		sc.close();
	}
}