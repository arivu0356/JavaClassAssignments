package customException;

//Custom exception class for insufficient funds
class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}

//Custom exception class for invalid withdrawal
class InvalidWithdrawalException extends Exception {
 public InvalidWithdrawalException(String message) {
     super(message);
 }
}

//BankAccount class
class BankAccount {
 private double balance;

 // Constructor
 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 // Withdraw method
 public void withdraw(double amount) throws InsufficientFundsException, InvalidWithdrawalException {
     if (amount < 0) {
         throw new InvalidWithdrawalException("Withdrawal amount cannot be negative");
     }

     if (amount > balance) {
         throw new InsufficientFundsException("Insufficient funds. Cannot withdraw " + amount);
     }

     balance -= amount;
     System.out.println("Withdrawal of " + amount + " successful. Remaining balance: " + balance);
 }
}

//Main class
public class BankClass {
 public static void main(String[] args) {
     // Create a BankAccount instance with initial balance 1000
     BankAccount account = new BankAccount(1000);

     try {
         // Perform withdrawals
         account.withdraw(500);
         account.withdraw(800); // This will throw InsufficientFundsException
         account.withdraw(-200); // This will throw InvalidWithdrawalException
     } catch (InsufficientFundsException e) {
         System.out.println("Error: " + e.getMessage());
     } catch (InvalidWithdrawalException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}
