package exceptions;


public class stringtoInteger {
    public static void main(String[] args) {
        // Call the method with different inputs and print the return value
        printConvertedInteger("23");
        printConvertedInteger("45.67");
        printConvertedInteger("test");
        printConvertedInteger("123f");
    }

    public static void printConvertedInteger(String input) {
        try {
            int convertedInt = convertToInt(input);
            System.out.println("Converted value of \"" + input + "\": " + convertedInt);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred for input \"" + input + "\": " + e.getMessage());
        }
    }

    public static int convertToInt(String str) throws NumberFormatException {
        return Integer.parseInt(str);
    }
}
