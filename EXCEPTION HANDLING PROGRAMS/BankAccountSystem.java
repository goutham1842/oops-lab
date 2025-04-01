import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BankAccountSystem {

    private double balance;
    private String accountHolder;

    public BankAccountSystem(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be greater than zero.");
            }
            balance += amount;
            logTransaction("Deposited " + amount);
            System.out.println("Deposited " + amount + ". Current balance: " + balance);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void withdraw(double amount) {
        try {
            if (amount > balance) {
                throw new IllegalArgumentException("Insufficient funds!");
            }
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be greater than zero.");
            }
            balance -= amount;
            logTransaction("Withdrew " + amount);
            System.out.println("Withdrew " + amount + ". Current balance: " + balance);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void viewBalance() {
        try {
            if (accountHolder == null) {
                throw new NullPointerException("Account holder information is missing.");
            }
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Current Balance: " + balance);
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void logTransaction(String transactionDetails) {
        try {
            File logFile = new File("transaction_log.txt");
            FileWriter fileWriter = new FileWriter(logFile, true);
            fileWriter.write(transactionDetails + "\n");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error writing transaction to log file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccountSystem account = new BankAccountSystem("John Doe");

        while (true) {
            System.out.println("\n--- Bank Account Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            try {
                switch (choice) {
                    case "1":
                        System.out.print("Enter amount to deposit: ");
                        String depositAmount = scanner.nextLine();
                        try {
                            account.deposit(Double.parseDouble(depositAmount));
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Please enter a valid number for deposit.");
                        }
                        break;
                    case "2":
                        System.out.print("Enter amount to withdraw: ");
                        String withdrawAmount = scanner.nextLine();
                        try {
                            account.withdraw(Double.parseDouble(withdrawAmount));
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Please enter a valid number for withdrawal.");
                        }
                        break;
                    case "3":
                        account.viewBalance();
                        break;
                    case "4":
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }
    }
}
