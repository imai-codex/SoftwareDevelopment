package sdAddon;
import java.util.Arrays;
public class SumOfPointer {
	    public static void main(String[] args) {
	        int[] nums = {2, 7, 11, 15, 20, 25};
	        int target = 22;

	        int[] result = findTwoSum(nums, target);
	        if (result != null) {
	            System.out.println("Indices: " + result[0] + " and " + result[1]);
	            System.out.println("Values: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
	        } else {
	            System.out.println("No two numbers found that sum to " + target);
	        }
	    }

	    public static int[] findTwoSum(int[] nums, int target) {
	        int left = 0;
	        int right = nums.length - 1;

	        while (left < right) {
	            int sum = nums[left] + nums[right];

	            if (sum == target) {
	                return new int[]{left, right};
	            } else if (sum < target) {
	                left++;
	            } else {
	                right--;
	            }
	        }
	        return null; 
	    }
	}
