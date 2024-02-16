
package lambdas;

import java.util.Arrays;

public class maxusingStreams {
    public static void main(String[] args) {
        // Sample list of integers
        Integer[] numbers = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};

        // Calculate the sum of the squares of positive integers using streams
        int sumOfSquares = Arrays.stream(numbers)
                                 .filter(n -> n > 0)        // Filter positive integers
                                 .mapToInt(n -> n * n)       // Square each integer
                                 .sum();                     // Calculate the sum

        // Print the result
        System.out.println("Sum of squares of positive integers: " + sumOfSquares);
    }
}
