package dsa;
import java.util.Scanner;
public class Max_min_value {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of an array:");
		int n=sc.nextInt();
		int [] a = new int[n];
		System.out.print("enter the "+ n +" array elements:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0];
		int min=a[0];
		for(int i=1;i<n;i++) {
			if(max<a[i]) {
				max = a[i];
			}
			if(min>a[i]) {
				min = a[i];
			}
		}
		System.out.println("maximum value of an array:"+max);
		System.out.println("minimum value of an array:"+min);
	}
}