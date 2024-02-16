package functionalInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMap {

    public static void main(String[] args) {
        // Create a HashMap with some elements
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 30);
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 35);
        hashMap.put("Diana", 28);

        // Print the original HashMap
        System.out.println("Original HashMap: " + hashMap);

        // Sort the HashMap by keys
        Map<String, Integer> sortedByKey = sortHashMapByKey(hashMap);
        System.out.println("Sorted HashMap by Key: " + sortedByKey);

        // Sort the HashMap by values
        Map<String, Integer> sortedByValue = sortHashMapByValue(hashMap);
        System.out.println("Sorted HashMap by Value: " + sortedByValue);
    }

    // Method to sort HashMap by keys
    public static Map<String, Integer> sortHashMapByKey(HashMap<String, Integer> hashMap) {
        TreeMap<String, Integer> sortedMap = new TreeMap<>(hashMap);
        return sortedMap;
    }

    // Method to sort HashMap by values
    public static Map<String, Integer> sortHashMapByValue(HashMap<String, Integer> hashMap) {
        TreeMap<String, Integer> sortedMap = new TreeMap<>((a, b) -> {
            int cmp = hashMap.get(a).compareTo(hashMap.get(b));
            if (cmp == 0)
                return 1; // Keep duplicates
            else
                return cmp;
        });
        sortedMap.putAll(hashMap);
        return sortedMap;
    }
}

