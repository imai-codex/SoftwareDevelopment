package sdAddon;

import java.util.Arrays;

public class BubbleSort {
	public static void sort(int[] a) {
		System.out.println(Arrays.toString(a));
		for(int i=1;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[]args) {
		int []arr= {11,26,37,5,8};
		sort(arr);
	}
}
