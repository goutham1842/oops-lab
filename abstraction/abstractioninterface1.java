interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class SavingsAccount implements BankAccount {
    private double balance;

    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + ". New Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + ". Remaining Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class abstractioninterface1 {
    public static void main(String[] args) {
        BankAccount myAccount = new SavingsAccount(1000);
        myAccount.deposit(500);
        myAccount.withdraw(300);
        System.out.println("Final Balance: $" + myAccount.getBalance());
    }
}
