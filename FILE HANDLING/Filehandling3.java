import java.io.*;

public class Filehandling3 {
public static void main(String[] args) {
String newFileName = "newFile.txt";

       
createFile(originalFileName);

       
renameFile(originalFileName, newFileName);
}

public static void createFile(String fileName) {
  try {
File file = new File(fileName);
if (file.createNewFile()) {
System.out.println("File created: " + fileName);
  } else {
System.out.println("File already exists.");
            }
} catch (IOException e) {
 System.out.println("Error creating file: " + e.getMessage());
        }
    }

public static void renameFile(String oldName, String newName) {
File oldFile = new File(oldName);
File newFile = new File(newName);

if (oldFile.exists()) {
if (oldFile.renameTo(newFile)) {
System.out.println("File renamed to: " + newName);
 } else {
  System.out.println("Renaming failed.");
            }
} else {
 System.out.println("File does not exist.");
        }
    }

public static void deleteFile(String fileName) {
File file = new File(fileName);
if (file.exists()) {
if (file.delete()) {
System.out.println("File deleted successfully: " + fileName);
 } else {
 System.out.println("Failed to delete the file.");
    }
} else {
System.out.println("File does not exist.");
}
}
}
