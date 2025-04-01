import java.io.*;
import java.util.Scanner;

public class StudentRecordsfilehandling {
    public static void main(String[] args) {
        String filename = "students.txt";
        Scanner scanner = new Scanner(System.in);

        try (FileWriter writer = new FileWriter(filename, true)) {
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Student Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Student Grade: ");
            String grade = scanner.nextLine();

            writer.write(name + "," + age + "," + grade + "\n");
            System.out.println("Student details saved successfully.");
        } catch (IOException e) {
            System.out.println("Error: Unable to write to file.");
        }

        System.out.println("\nReading Student Records:");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] details = line.split(",");
                System.out.println("Name: " + details[0] + ", Age: " + details[1] + ", Grade: " + details[2]);
            }
        } catch (IOException e) {
            System.out.println("Error: Unable to read from file.");
        } finally {
            scanner.close();
        }
    }
}
