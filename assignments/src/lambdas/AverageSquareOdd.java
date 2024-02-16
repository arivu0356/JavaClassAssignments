package lambdas;

public class AverageSquareOdd {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double average = calculateAverageOfSquaresOfOddNumbers(numbers);
        System.out.println("Average of squares of odd numbers: " + average);
    }

    public static double calculateAverageOfSquaresOfOddNumbers(int[] numbers) {
        int count = 0;
        int sumOfSquares = 0;

        for (int num : numbers) {
            if (num % 2 != 0) { // Check if the number is odd
                sumOfSquares += num * num;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No odd numbers found in the array.");
            return 0;
        }

        return (double) sumOfSquares / count;
    }
}
