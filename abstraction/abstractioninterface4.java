abstract class BankAccount {
    String accountHolder;
    double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

        abstract void accountType();

        void displayBalance() {
        System.out.println(accountHolder + "'s Balance: $" + balance);
    }

        void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    // Implementation of abstract method
    void accountType() {
        System.out.println(accountHolder + " has a Savings Account.");
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    // Implementation of abstract method
    void accountType() {
        System.out.println(accountHolder + " has a Current Account.");
    }
}

interface Transactions {
    void withdraw(double amount);
}


class BankTransaction implements Transactions {
    private BankAccount account;

    public BankTransaction(BankAccount account) {
        this.account = account;
    }

    
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > account.balance) {
            System.out.println("Insufficient funds! Cannot withdraw $" + amount);
        } else {
            account.balance -= amount;
            System.out.println("Withdrawn $" + amount + ". Remaining Balance: $" + account.balance);
        }
    }
}

public class abstractioninterface4 {
    public static void main(String[] args) {
        
        BankAccount savings = new SavingsAccount("Alice", 500);
        BankTransaction transaction = new BankTransaction(savings);

        
        savings.accountType();
        savings.displayBalance();
        savings.deposit(200);
        transaction.withdraw(300);
        transaction.withdraw(500);

        System.out.println("\n----------------------\n");

                BankAccount current = new CurrentAccount("Bob", 1000);
        BankTransaction transaction2 = new BankTransaction(current);


        current.accountType();
        current.displayBalance();
        current.deposit(500);
        transaction2.withdraw(1200);
        transaction2.withdraw(200);
    }
}
