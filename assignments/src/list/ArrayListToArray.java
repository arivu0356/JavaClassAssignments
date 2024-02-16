package list;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Convert ArrayList to Array
        String[] array = new String[arrayList.size()];
        arrayList.toArray(array);

        // Print the elements of the array
        System.out.println("Elements of the array:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}

