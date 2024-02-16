package threads;

public class trysingleton {

    // Private static variable to hold the single instance of the class
    private static trysingleton instance;

    // Private constructor to prevent instantiation from outside the class
    private trysingleton() {}

    // Public static method to get the single instance of the class
    public static trysingleton getInstance() {
        // Lazy initialization: create the instance only when it's needed
        if (instance == null) {
            instance = new trysingleton();
        }
        return instance;
    }

    // Other methods of the singleton class
    public void doSomething() {
        System.out.println("Singleton instance is doing something.");
    }

    public static void main(String[] args) {
        // Get the singleton instance
    	trysingleton singletonInstance1 = trysingleton.getInstance();
    	trysingleton singletonInstance2 = trysingleton.getInstance();

        // Both instances should be the same
        System.out.println("Is singletonInstance1 equals to singletonInstance2? " + (singletonInstance1 == singletonInstance2));

        // Call a method of the singleton instance
        singletonInstance1.doSomething();
    }
}