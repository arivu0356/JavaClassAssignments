package functionalInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatedCharacters {
    public static void main(String[] args) {
        String str = "test string";

        Map<Character, Integer> charCountMap = new HashMap<>();

        // Counting occurrences of each character in the string
        for (char c : str.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        // Printing repeated characters and their counts
        System.out.println("Repeated characters in the string:");
        Set<Map.Entry<Character, Integer>> entrySet = charCountMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + "-" + entry.getValue());
            }
        }
    }
}
