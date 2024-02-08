package loopsConditions;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.println("Fibonacci Series up to the " + N + " term:");
        printFibonacciSeries(N);
    }

    public static void printFibonacciSeries(int N) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < N; i++) {
            int nextTerm = a + b;
            System.out.print(nextTerm + " ");
            a = b;
            b = nextTerm;
        }
    }
}
