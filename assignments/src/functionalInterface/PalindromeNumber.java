package functionalInterface;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 12321;
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int number) {
        // Convert the number to a string
        String numStr = String.valueOf(number);
        int left = 0;
        int right = numStr.length() - 1;

        // Check if the string is a palindrome
        while (left < right) {
            if (numStr.charAt(left) != numStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
