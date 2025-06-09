package dsa;

public class Reverse_Array {
	public static void main(String[] args) {
        int[] arr = {4, 2, 10, 7, 5, 13, 8};
 
        int left = 0;
        int right = arr.length - 1;
 
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
 
            left++;
            right--;
        }
 
        System.out.print("Reversed Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

