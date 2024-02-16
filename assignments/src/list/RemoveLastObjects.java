package list;

import java.util.ArrayList;

public class RemoveLastObjects {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Print the ArrayList before removing the last object
        System.out.println("ArrayList before removing the last object:");
        System.out.println(list);

        // Remove the last object
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
            System.out.println("\nLast object removed successfully.");
        } else {
            System.out.println("\nArrayList is empty. No object to remove.");
        }

        // Print the ArrayList after removing the last object
        System.out.println("\nArrayList after removing the last object:");
        System.out.println(list);
    }
}
