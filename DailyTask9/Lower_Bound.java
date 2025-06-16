package sdAddon;

import java.util.Scanner;

public class Lower_Bound {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {2,7,12,14,21,32,45,65,76,78};
		int left=0;
		int right = arr.length;
		int mid;
		int target = sc.nextInt();
		while (left<right) {
			mid=(left+right)/2;
			if(arr[mid]<target) {
				left=mid+1;
			}
			else if(arr[mid]>=target) {
				right=mid;
			}
		}
		if(left==right) {
			System.out.println("Lower bound of "+target+" is found at "+left+" and the Lower Bound Value is "+arr[right]);
		}
		sc.close();
	}
}
