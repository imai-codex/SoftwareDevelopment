package sdAddon;

public class Stack {
	int top;
	int stack[];
	
	public Stack(int size) {
		top = -1;
		stack = new int[size];
	}
	public void push(int value) {
		if(top<stack.length-1) {
			top++;
			stack[top]=value;
			System.out.println(value);
		}
		else {
			System.out.println("Stack Overflow");
		}
	}
	// after the push method the value of top is 2
	public void pop() {
		if(top>=0) {
			int value = stack[top];
			top--;
			System.out.println(value + " removed");
		}
		else {
			System.out.println("Stack underflowed");
		}
	}
	public void display() {
		if (top == -1) {
			System.out.println("Stack is empty");
		} else {
			System.out.println("Stack :");
			for (int i = top; i >= 0; i--) {
				System.out.println(stack[i]);
			}
		}
	}
	public static void main(String[]args) {
		Stack s=new Stack(5);
		s.push(11);
		s.push(26);
		s.push(37);
		s.push(3);
		s.pop();
		s.pop();
		s.display();
	}
}
