package functionalInterface;

public class SwapIntegers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap the values without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
