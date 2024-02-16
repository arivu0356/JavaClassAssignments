package strings;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Java J2EE Reverse Me";
        String reversedSentence = reverseWords(sentence);
        System.out.println("Input: " + sentence);
        System.out.println("Output: " + reversedSentence);
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            String reversedWord = reverseWord(word);
            reversedSentence.append(reversedWord).append(" ");
        }
        return reversedSentence.toString().trim();
    }

    public static String reverseWord(String word) {
        StringBuilder reversedWord = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord.append(word.charAt(i));
        }
        return reversedWord.toString();
    }
}
