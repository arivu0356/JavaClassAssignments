package lambdas;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupusingStreams {
    public static void main(String[] args) {
        // Sample list of strings
        List<String> strings = Arrays.asList("apple", "banana", "orange", "kiwi", "pear", "grape");

        // Group strings by their length
        Map<Integer, List<String>> groupedByLength = strings.stream()
                .collect(Collectors.groupingBy(String::length));

        // Print the groups
        groupedByLength.forEach((length, list) -> System.out.println("Length " + length + ": " + list));
    }
}
