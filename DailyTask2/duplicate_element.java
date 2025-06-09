package dsa;
import java.util.ArrayList;
public class duplicate_element {


	    public static void main(String[] args) {
	        int[] arr = {2, 3, 4, 4, 5, 8, 2, 3};
	 
	        int[] unique = removeDuplicates(arr);
	 
	        System.out.print("Array without duplicates: ");
	        for (int num : unique) {
	            System.out.print(num + " ");
	        }
	    }
	 
	    public static int[] removeDuplicates(int[] arr) {
	        ArrayList<Integer> uniqueList = new ArrayList<>();
	 
	        for (int num : arr) {
	            if (!uniqueList.contains(num)) {
	                uniqueList.add(num);
	            }
	        }
	 
	        // Convert ArrayList back to array
	        int[] result = new int[uniqueList.size()];
	        for (int i = 0; i < uniqueList.size(); i++) {
	            result[i] = uniqueList.get(i);
	        }
	 
	        return result;
	    }
	}
