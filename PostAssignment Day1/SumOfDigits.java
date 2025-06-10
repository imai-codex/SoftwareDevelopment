package sdAddon;
import java.util.Scanner;
public class SumOfDigits {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        int sum = sumOfDigits(number);
	        System.out.println("Sum of digits: " + sum);
	    }

	  
	    public static int sumOfDigits(int num) {
	       
	        if (num == 0) {
	            return 0;
	        }

	        return num % 10 + sumOfDigits(num / 10);
	    }
	}
