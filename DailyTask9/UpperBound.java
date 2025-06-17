package sdAddon;

import java.util.Arrays;
import java.util.Scanner;

public class UpperBound {
	public int Upper_Bound(int target) {
		int arr[] = {12,23,43,54,56,57,76,87,90};
		Arrays.sort(arr);
		int left=0;
		int right = arr.length;
		int mid;
		while (left<right) {
			mid=(left+right)/2;
			if(arr[mid]<=target) {
				left=mid+1;
			}
			else{
				right=mid;
			}
		}
		return right;
	}
	public static void main(String[] args) {
		UpperBound ts = new UpperBound();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Target:");
		int target = sc.nextInt();
		ts.Upper_Bound(target);
		System.out.println("Upper bound index for " + target + " is: " + ts.Upper_Bound(target));
		sc.close();
	}
}
