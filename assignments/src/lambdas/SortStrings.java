package lambdas;

import java.util.Arrays;
import java.util.Comparator;

public class SortStrings {

    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "orange", "kiwi", "grape"};

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() != s2.length()) {
                    // First criteria: Sort by lengths in ascending order
                    return s1.length() - s2.length();
                } else {
                    // Second criteria: Sort by last character in descending order
                    return s2.charAt(s2.length() - 1) - s1.charAt(s1.length() - 1);
                }
            }
        });

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
