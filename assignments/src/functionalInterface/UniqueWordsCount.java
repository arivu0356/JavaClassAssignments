package functionalInterface;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordsCount {
    public static void main(String[] args) {
        String str = "Java is a programming language Java is widely used for development";

        // Remove leading and trailing whitespaces and split the string into words
        String[] words = str.trim().split("\\s+");

        // Create a HashMap to store word counts
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Count the occurrences of each word
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Count the number of unique words
        int uniqueWordsCount = wordCountMap.size();

        // Display the count of unique words
        System.out.println("Number of unique words: " + uniqueWordsCount);
    }
}
