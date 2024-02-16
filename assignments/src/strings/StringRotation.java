package strings;

public class StringRotation {
    public static void main(String[] args) {
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";

        if (areRotations(str1, str2)) {
            System.out.println("Output: true");
        } else {
            System.out.println("Output: false");
        }
    }

    public static boolean areRotations(String str1, String str2) {
        // Check if lengths of both strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Concatenate str1 with itself
        String concatenatedStr = str1 + str1;

        // Check if str2 is a substring of concatenatedStr
        if (concatenatedStr.contains(str2)) {
            return true;
        }

        return false;
    }
}
