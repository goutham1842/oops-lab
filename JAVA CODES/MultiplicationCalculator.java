import java.util.Scanner;

public class MultiplicationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.print("Enter the number of multiples to generate: ");
        int multiplesCount = scanner.nextInt();
        
        System.out.println("Multiples of " + number + ":");
        for (int i = 1; i <= multiplesCount; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        
        scanner.close();
    }
}
