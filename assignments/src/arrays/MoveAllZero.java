package arrays;

import java.util.Arrays;

public class MoveAllZero {

    public static void main(String[] args) {
        int[] numbers = {0, 1, 0, 3, 12};

        System.out.println("Original array: " + Arrays.toString(numbers));
        
        moveZerosToEnd(numbers);

        System.out.println("Array after moving zeros to the end: "+ Arrays.toString(numbers));
        
    }

    public static void moveZerosToEnd(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}

