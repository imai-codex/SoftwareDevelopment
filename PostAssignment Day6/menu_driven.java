package sdAddon;

import java.util.Scanner;

public class menu_driven {
	int myStack[];
	int top=-1;
	public menu_driven(int size)
	{
		myStack=new int[size];
	}
	
	//push
	public void push(int num)
	{
		if(top==4)
		{
			System.out.println("Stack overflow");
		}
		else
		{
			myStack[++top]=num;
		}
		
	}
	//pop
	public void pop()
	{
		if(top<0)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println(myStack[top]);
			myStack[top]=0;
			top--;
		}			
	}
	//display
	public void display()
	{
		for(int i=0;i< myStack.length;i++)
		{
			if(myStack[i]==0)
			{
				continue;
			}
			System.out.print(myStack[i]+" ");
		}
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the stack:");
		int sizeS=sc.nextInt();
		menu_driven md=new menu_driven(sizeS);
		int op;
		do
		{
		System.out.println("\n1:Push");
		System.out.println("2:Pop");
		System.out.println("3:Display");
		System.out.println("4:Exit");
		System.out.println("Choose the option:");
		op=sc.nextInt();
		switch(op)
		{
		case 1://push
			System.out.println("Enter the values to be pushed:");
			int pushVal=sc.nextInt();
			md.push(pushVal);
			break;
		case 2: //pop
			
			md.pop();
			break;
			
		case 3: //display
			md.display();
			break;
		case 4:
			System.out.println("Exit");
			break;
		default:
			System.out.println("invalid option");
			break;
		}
		}while(op!=4);
		sc.close();
	}
}
