package lambdas;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterusingLambdas {
    public static void main(String[] args) {
        // Sample list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter out the even numbers and double each remaining number using streams
        List<Integer> doubledOddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0) // Filter out the even numbers
                .map(n -> n * 2)          // Double each remaining number
                .collect(Collectors.toList()); // Collect the results into a list

        // Print the doubled odd numbers
        System.out.println("Doubled Odd Numbers:");
        System.out.println(doubledOddNumbers);
    }
}
