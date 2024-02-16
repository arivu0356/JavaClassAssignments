package lambdas;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class letterA {
    public static void main(String[] args) {
        // Sample list of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Avocado");
        stringList.add("Grapes");

        // Filtering strings starting with the letter "A"
        List<String> filteredList = filterStrings(stringList, s -> s.startsWith("A"));

        // Printing the filtered list
        System.out.println("Filtered strings:");
        for (String str : filteredList) {
            System.out.println(str);
        }
    }

    // Method to filter strings based on a predicate
    public static List<String> filterStrings(List<String> stringList, Predicate<String> predicate) {
        List<String> filteredList = new ArrayList<>();
        for (String str : stringList) {
            if (predicate.test(str)) {
                filteredList.add(str);
            }
        }
        return filteredList;
    }
}
