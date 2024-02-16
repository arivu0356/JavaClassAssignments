package functionalInterface;

import java.util.HashMap;
import java.util.Map;

public class RepeatedDigits {

    public static void findRepeatedDigits(int number) {
        // Convert the number to a string to iterate over its digits
        String numStr = String.valueOf(number);

        // Create a HashMap to store the count of each digit
        Map<Character, Integer> digitCount = new HashMap<>();

        // Iterate over each digit in the number
        for (char digit : numStr.toCharArray()) {
            // Update the count of the current digit in the HashMap
            digitCount.put(digit, digitCount.getOrDefault(digit, 0) + 1);
        }

        // Print the repeated digits
        System.out.print("Repeated digits in " + number + ": ");
        for (Map.Entry<Character, Integer> entry : digitCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

    public static void main(String[] args) {
        int number = 1234567890;
        findRepeatedDigits(number);
    }
}
