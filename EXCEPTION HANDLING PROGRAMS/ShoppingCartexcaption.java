import java.util.HashMap;
import java.util.Scanner;

class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

public class ShoppingCartexcaption {
    private HashMap<String, Integer> inventory;

    public  ShoppingCartexcaption() {
        inventory = new HashMap<>();
        inventory.put("Laptop", 5);
        inventory.put("Phone", 10);
        inventory.put("Headphones", 8);
    }

    public void purchaseItem(String item, int quantity) throws OutOfStockException {
        if (!inventory.containsKey(item)) {
            throw new IllegalArgumentException("Error: Product not found!");
        }
        if (quantity > inventory.get(item)) {
            throw new OutOfStockException("Error: Insufficient stock available!");
        }
        inventory.put(item, inventory.get(item) - quantity);
        System.out.println("Purchase successful! Remaining stock for " + item + ": " + inventory.get(item));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         ShoppingCartexcaption cart = new  ShoppingCartexcaption();

        try {
            System.out.print("Enter product name: ");
            String product = scanner.nextLine();

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            if (quantity <= 0) {
                throw new IllegalArgumentException("Error: Quantity must be greater than zero!");
            }

            cart.purchaseItem(product, quantity);
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input!");
        } finally {
            scanner.close();
            System.out.println("Shopping transaction completed.");
        }
    }
}
