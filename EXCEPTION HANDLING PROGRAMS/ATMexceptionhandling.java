import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class ATMexceptionhandling {
    private double balance;

    public ATMexceptionhandling(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Error: Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining balance: " + balance);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      ATMexceptionhandling myATM = new ATMexceptionhandling(5000); // Initial balance

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();

            if (amount <= 0) {
                throw new IllegalArgumentException("Error: Amount must be greater than zero!");
            }

            myATM.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input!");
        } finally {
            scanner.close();
            System.out.println("Transaction completed.");
        }
    }
}
