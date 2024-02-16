package list;

import java.util.ArrayList;

public class ArrayListTraversal {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        // Traverse using a regular for loop
        System.out.println("Traversing using a regular for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        // Traverse using an enhanced for loop
        System.out.println("\nTraversing using an enhanced for loop:");
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
