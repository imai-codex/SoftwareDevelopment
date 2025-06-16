package sdAddon;

import java.util.Arrays;

public class insertionSort {
	public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Current element to be inserted
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };
        System.out.println("Original Array: " + Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
