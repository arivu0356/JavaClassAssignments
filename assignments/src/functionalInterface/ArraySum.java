package functionalInterface;

public class ArraySum {

    public static void main(String[] args) {
        // Sample array
        int[] numbers = {10, 20, 30, 40, 50};

        // Calculate the sum
        int sum = calculateSum(numbers);

        // Print the sum
        System.out.println("Sum of all elements in the array: " + sum);
    }

    // Method to calculate the sum of elements in an array
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
