package threads;


public class twothreads {
    public static void main(String[] args) {
        // Create two threads
        Thread evenThread = new Thread(new EvenNumbers());
        Thread oddThread = new Thread(new OddNumbers());

        // Start the threads
        evenThread.start();
        oddThread.start();
    }
}

// Runnable class to print even numbers
class EvenNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 60; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Runnable class to print odd numbers
class OddNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 59; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
