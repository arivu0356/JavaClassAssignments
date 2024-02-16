package lambdas;

import java.util.Arrays;

public class CapitalizeAndSort {

    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "orange", "grape"};

        // Capitalize the first letter of each string
        capitalizeFirstLetter(strings);

        // Sort the strings in alphabetical order
        Arrays.sort(strings);

        // Print the strings
        for (String str : strings) {
            System.out.println(str);
        }
    }

    public static void capitalizeFirstLetter(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            String str = strings[i];
            if (str.length() > 0) {
                // Capitalize the first letter of the string
                strings[i] = str.substring(0, 1).toUpperCase() + str.substring(1);
            }
        }
    }
}
