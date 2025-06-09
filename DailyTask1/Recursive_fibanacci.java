package dsa;
import java.util.Scanner;
public class Recursive_fibanacci {
		public static int fib(int n) {
			if(n<=1) {
			return n;
			}
			return fib(n-1)+fib(n-2);
		}
		public static void main(String[]args) {
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number:");
	        int t = scanner.nextInt();
	        
	        System.out.println("Fibonacci Series:");
	        for (int i = 0; i < t; i++) {
	            System.out.print(fib(i) + " ");
	        }
		}
}
