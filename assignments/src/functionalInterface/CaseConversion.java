package functionalInterface;

public class CaseConversion {

    public static void main(String[] args) {
        String str = "Hello World 123";

        // Convert the string
        String convertedStr = convertCase(str);

        // Print the converted string
        System.out.println("Original String: " + str);
        System.out.println("Converted String: " + convertedStr);	
    }

    public static String convertCase(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];

            // Convert lower-case to upper-case and vice-versa
            if (Character.isLowerCase(ch)) {
                charArray[i] = Character.toUpperCase(ch);
            } else if (Character.isUpperCase(ch)) {
                charArray[i] = Character.toLowerCase(ch);
            }
        }

        return new String(charArray);
    }
}
