import java.util.Scanner;

public class ShoppingDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the total bill amount: ");
        double billAmount = scanner.nextDouble();
        
        if (billAmount < 0) {
            System.out.println("Invalid bill amount. Please enter a positive number.");
        } else {
            double discount;
            
            if (billAmount >= 500) {
                discount = billAmount * 0.20; 
            } else if (billAmount >= 200) {
                discount = billAmount * 0.10; 
            } else {
                discount = billAmount * 0.05; 
            }
            
            double finalAmount = billAmount - discount;
            
            System.out.printf("Discount Applied: $%.2f%n", discount);
            System.out.printf("Final Amount to Pay: $%.2f%n", finalAmount);
        }
        
        scanner.close();
    }
}
