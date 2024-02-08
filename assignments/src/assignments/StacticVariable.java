package assignments;

public class StacticVariable {
	
    private static int staticVariable = 0;

    public static int getStaticVariable() {
        return staticVariable;
    }

    public static void updateStaticVariable(int newValue) {
        staticVariable = newValue;
    }

    public static void main(String[] args) {
        System.out.println("Initial Static Variable: " + getStaticVariable());
        updateStaticVariable(42);
        System.out.println("Updated Static Variable: " + getStaticVariable());
    }
}


