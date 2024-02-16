package functionalInterface;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
        
        scanner.close();
    }
    
    // Method to calculate factorial recursively
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
