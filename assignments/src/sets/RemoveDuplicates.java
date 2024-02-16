package sets;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "hello world";
        String result = removeDuplicates(str);
        System.out.println("Original string: " + str);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        // Create a LinkedHashSet to maintain the order of characters while removing duplicates
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        // Iterate through the string and add each character to the set
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        // Build the resulting string from the characters in the set
        StringBuilder sb = new StringBuilder();
        for (char c : set) {
            sb.append(c);
        }

        // Convert StringBuilder to String and return
        return sb.toString();
    }
}
