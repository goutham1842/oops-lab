import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class StudentScoreLogger {
public static void main(String[] args) {
LocalDate date = LocalDate.now();
LocalTime time = LocalTime.now();
Random random = new Random();
int[] scores = new int[5];
int total = 0;
System.out.println("Date: " + date);
System.out.println("Time: " + time);
System.out.println("Generated Student Scores:");
for (int i = 0; i < scores.length; i++) {
scores[i] = random.nextInt(101);
System.out.println("Student " + (i + 1) + ": " + scores[i]);
total += scores[i];
}
double average = total / (double) scores.length;
System.out.println("Average Score: " + average);
try {
FileWriter writer = new FileWriter("student_scores.txt");
writer.write("Date: " + date + "\n");
writer.write("Time: " + time + "\n");
for (int i = 0; i < scores.length; i++) {
writer.write("Student " + (i + 1) + " Score: " + scores[i] + "\n");
}
writer.write("Average Score: " + average + "\n");
writer.close();
System.out.println("Data successfully written to student_scores.txt");
} catch (IOException e) {
e.printStackTrace();
}
}
}