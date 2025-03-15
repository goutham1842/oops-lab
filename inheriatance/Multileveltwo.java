
class Bank {
String bankName;
String headOfficeLocation;
Bank(String bankName, String headOfficeLocation) {
this.bankName = bankName;
this.headOfficeLocation = headOfficeLocation;
    }

void displayBankDetails() {
System.out.println("Bank Name: " + bankName);
System.out.println("Head Office: " + headOfficeLocation);
    }
}

class Branch extends Bank {
String branchName;
String branchCode;

Branch(String bankName, String headOfficeLocation, String branchName, String branchCode) {
 super(bankName, headOfficeLocation); // Calls the constructor of Bank
this.branchName = branchName;
this.branchCode = branchCode;
    }

void displayBranchDetails() {
 System.out.println("Branch Name: " + branchName);
System.out.println("Branch Code: " + branchCode);
    }
}

class Account extends Branch {
String accountHolderName;
 String accountNumber;
 double balance;
 Account(String bankName, String headOfficeLocation,
String branchName, String branchCode,
 String accountHolderName, String accountNumber, double balance) {

super(bankName, headOfficeLocation, branchName, branchCode); 
 this.accountHolderName = accountHolderName;
this.accountNumber = accountNumber;
this.balance = balance;
    }

void displayAccountDetails() {
System.out.println("Account Holder: " + accountHolderName);
System.out.println("Account Number: " + accountNumber);
System.out.println("Balance: $" + balance);
   }
}

public class Multileveltwo {
    public static void main(String[] args) {

Account account = new Account("Global Bank", "New York",
"Downtown Branch", "DT001",
"Alice Johnson", "ACC123456", 10500.75);

account.displayBankDetails(); 
account.displayBranchDetails();            
account.displayAccountDetails();  
    }
}
