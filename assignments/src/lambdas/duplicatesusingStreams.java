package lambdas;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class duplicatesusingStreams {
    public static void main(String[] args) {
        // Sample list of integers with duplicates
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 3, 5, 6, 7, 1, 8, 9, 7);

        // Remove duplicates using streams
        List<Integer> distinctNumbers = numbers.stream()
                                               .distinct() // Keep only distinct elements
                                               .collect(Collectors.toList()); // Collect the result to a list

        // Print the list without duplicates
        System.out.println("List without duplicates: " + distinctNumbers);
    }
}
