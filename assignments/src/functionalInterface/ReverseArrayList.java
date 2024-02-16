package functionalInterface;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + arrayList);

        // Reverse the ArrayList
        reverseArrayList(arrayList);

        // Print the reversed ArrayList
        System.out.println("Reversed ArrayList: " + arrayList);
    }

    public static <T> void reverseArrayList(ArrayList<T> list) {
        // Get the size of the ArrayList
        int size = list.size();

        // Iterate over the first half of the ArrayList
        for (int i = 0; i < size / 2; i++) {
            // Swap the elements from the beginning with elements from the end
            T temp = list.get(i);
            list.set(i, list.get(size - 1 - i));
            list.set(size - 1 - i, temp);
        }
    }
}
