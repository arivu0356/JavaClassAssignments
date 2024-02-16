package sets;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of strings
        Set<String> stringSet = new HashSet<>();

        // Add 10 strings to the HashSet
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Orange");
        stringSet.add("Mango");
        stringSet.add("Grapes");
        stringSet.add("Pineapple");
        stringSet.add("Watermelon");
        stringSet.add("Strawberry");
        stringSet.add("Cherry");
        stringSet.add("Kiwi");

        // Iterating using Iterator
        Iterator<String> iterator = stringSet.iterator();
        System.out.println("Iterating using Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iterating using for loop
        System.out.println("\nIterating using for loop:");
        Object[] stringArray = stringSet.toArray();
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }

        // Iterating using enhanced for loop
        System.out.println("\nIterating using enhanced for loop:");
        for (String str : stringSet) {
            System.out.println(str);
        }
    }
}
