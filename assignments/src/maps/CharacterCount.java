package maps;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "test string";
        printCharacterCount(input);
    }

    public static void printCharacterCount(String input) {
        // Create a HashMap to store characters and their counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert the input string to lowercase to make case-insensitive
        input = input.toLowerCase();

        // Loop through each character in the input string
        for (char ch : input.toCharArray()) {
            // Increment the count for each character in the map
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Print the distinct characters and their counts
        System.out.print("Output: ");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.print(entry.getKey() + "-" + entry.getValue() + ", ");
        }
    }
}
