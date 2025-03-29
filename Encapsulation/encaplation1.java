class BankAccount {
    private String accountNumber;
    private double balance;

   
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    
    public String getAccountNumber() {
        return accountNumber;
    }

    
    public double getBalance() {
        return balance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

  
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
}

public class encaplation1 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 5000);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: $" + account.getBalance());

        account.deposit(1500);
        System.out.println("Updated Balance: $" + account.getBalance());

        account.withdraw(2000);
        System.out.println("Final Balance: $" + account.getBalance());
    }
}
