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
	public static void main(String[]args) {
		Stack s=new Stack(5);
		s.push(11);
		s.push(26);
		s.push(37);
		s.push(0);
		s.pop();
		s.pop();
	}
}
