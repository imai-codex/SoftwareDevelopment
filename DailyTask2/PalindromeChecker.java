package sdAddon;

public class PalindromeChecker {
	public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] chars = str.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true; 
    }

    public static void main(String[] args) {
        String test = "A man, a plan, a canal: Panama";
        if (isPalindrome(test)) {
            System.out.println("\"" + test + "\" is a palindrome.");
        } else {
            System.out.println("\"" + test + "\" is not a palindrome.");
        }
    }
}
