package arrays;

import java.util.Scanner;

public class LargestSmallest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        int size = scan.nextInt();
        
        int[] numbers = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();
        }
        

        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            } else if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }

}
