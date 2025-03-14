import java.util.Scanner;

public class CalorieCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of food items: ");
        int items = scanner.nextInt();
        
        double totalCalories = 0;
        
        for (int i = 1; i <= items; i++) {
            System.out.print("Enter calories for item " + i + ": ");
            double calories = scanner.nextDouble();
            totalCalories += calories;
        }
        
        System.out.println("Total calories consumed: " + totalCalories);
        
        scanner.close();
    }
}
