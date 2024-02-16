package lambdas;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class addition {
    public static void main(String[] args) {
        // Implementing the interface using a lambda expression for addition
        MathOperation addition = (a, b) -> a + b;

        // Test the addition operation
        int result = addition.operate(5, 3);
        System.out.println("Result of addition: " + result);
    }
}
