package sdAddon;
import java.util.Scanner;
public class StackMenu {
		int top;
		int stack[];
		public StackMenu(int size) {
			stack = new int[size];
			top = -1;
		}
		public void push(int value) {
			if(top < stack.length-1) {
				 top++;
				 stack[top] = value;
		         System.out.println(value);
			}
			else {
				System.out.println("Stack Overflow:" + value);
			}
		}
		public int pop() {
			if (top >= 0) {
	            int value = stack[top];
	            top--;
	            System.out.println(value +"removed");
	            return value;
	        } else {
	            System.out.println("Stack Underflow");
	            return -1;
	        }
		}
		public void display() {
	        if (top == -1) {
	            System.out.println("Stack is empty");
	        } else {
	            System.out.print("Stack elements: ");
	            for (int i = 0; i <= top; i++) {
	                System.out.print(stack[i] + " ");
	            }
	            System.out.println();
	        }
	    }
		public static void main(String[] args) {
			 Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter size of the stack: ");
		        int size = scanner.nextInt();
	        StackMenu myStack = new StackMenu(size);
	        int choice;
	        while (true) {
	            System.out.println("Menu:");
	            System.out.println("1. Push");
	            System.out.println("2. Pop");
	            System.out.println("3. Display");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            switch (choice) {
	                case 1:
	                    System.out.print("push the value: ");
	                    int value = scanner.nextInt();
	                    myStack.push(value);
	                    break;
	                case 2:
	                    myStack.pop();
	                    break;
	                case 3:
	                    myStack.display();
	                    break;

	                case 4:
	                    System.out.println("Exit");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }
	    }
}
