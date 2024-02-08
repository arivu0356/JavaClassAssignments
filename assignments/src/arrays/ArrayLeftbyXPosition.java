package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLeftbyXPosition {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Size");
        int size= scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements");
        for(int i=0; i<size; i++)
        {
        	arr[i]= scan.nextInt(); 
        }        
        System.out.println("Enter x value");
        int x = scan.nextInt();

        System.out.println("Original array: " + Arrays.toString(arr));

        rotateLeft(arr, x);

        System.out.println("Array after left rotation by " + x + " positions: " + Arrays.toString(arr));
    }

    public static void rotateLeft(int[] arr, int x) {
        int n = arr.length;
        reverseArray(arr, 0, x - 1);
        reverseArray(arr, x, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
