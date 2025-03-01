import java.util.Scanner;

public class ShoppingDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the total bill amount: ");
        double billAmount = scanner.nextDouble();
        double discount = 0;
        
        if (billAmount >= 500) {
            discount = billAmount * 0.20; 
        } else if (billAmount >= 200) {
            discount = billAmount * 0.10; 
        } else {
            discount = billAmount * 0.05; 
        }
        
        double finalAmount = billAmount - discount;
        
        System.out.println("Discount Applied: $" + discount);
        System.out.println("Final Amount to Pay: $" + finalAmount);
        
        scanner.close();
    }
}
