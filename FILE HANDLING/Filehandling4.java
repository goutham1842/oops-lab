import java.io.*;

public class Filehandling4 {
    public static void main(String[] args) {
String fileName = "file1.txt";


writeToFile(fileName, "Java File Handling Example\n");

        
appendToFile(fileName, "Appending some extra content.\n");

        
 readFromFile(fileName);
    }
public static void writeToFile(String fileName, String content) {
try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
writer.write(content);
System.out.println("Data written to file successfully!");
} catch (IOException e) {
 System.out.println("Error writing to file: " + e.getMessage());
        }
    }

public static void appendToFile(String fileName, String content) {
try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
writer.write(content);
System.out.println("Data appended successfully!");
 } catch (IOException e) {
System.out.println("Error appending to file: " + e.getMessage());
        }
    }

public static void readFromFile(String fileName) {
try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
  String line;
System.out.println("Reading file content:");
 while ((line = reader.readLine()) != null) {
System.out.println(line);
            }
} catch (IOException e) {
System.out.println("Error reading file: " + e.getMessage());
}
}
}
