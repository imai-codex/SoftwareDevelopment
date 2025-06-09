package dsa;

public class sorting {
    public static void main(String[] args) {
        int[] original = {25, 10, 5, 30, 15};
 
        int[] ascending = sortAscending(original);
        int[] descending = sortDescending(original);
 
        System.out.print("Original Array: ");
        printArray(original);
 
        System.out.print("Ascending Order: ");
        printArray(ascending);
 
        System.out.print("Descending Order: ");
        printArray(descending);
    }

    public static int[] sortAscending(int[] arr) {
        int[] sorted = copyArray(arr);
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[i] > sorted[j]) {
                    int temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        return sorted;
    }
    public static int[] sortDescending(int[] arr) {
        int[] sorted = copyArray(arr);
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[i] < sorted[j]) {
                    int temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        return sorted;
    }

    public static int[] copyArray(int[] source) {
        int[] copy = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            copy[i] = source[i];
        }
        return copy;
    }
 
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

