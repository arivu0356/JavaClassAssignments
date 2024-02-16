package lambdas;

public class StringsWithVowels {

    public static void main(String[] args) {
        String[] strings = {"hello", "world", "apple", "banana", "orange"};

        for (String str : strings) {
            int vowelCount = countVowels(str);
            if (vowelCount > 0) {
                System.out.println(str + " - " + vowelCount);
            }
        }
    }

    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
