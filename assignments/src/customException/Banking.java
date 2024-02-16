package customException;


public class Banking {
    public static void main(String[] args) {
        // Create a BankAccount instance with initial balance 1000
        BankAccount account = new BankAccount(1000);

        try {
            // Scenario 1: Successful withdrawal
            account.withdraw(500);

            // Scenario 2: Attempting to withdraw more money than the account balance
            account.withdraw(800); // This will throw InsufficientFundsException

            // Scenario 3: Attempting to withdraw a negative amount
            account.withdraw(-200); // This will throw InvalidWithdrawalException
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidWithdrawalException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
