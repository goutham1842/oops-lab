import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.Scanner;

public class OtpGenerator {
public static String generateOTP(int digits) {
String numbers = "0123456789";
Random random = new Random();
StringBuilder otp = new StringBuilder();
for (int i = 0; i < digits; i++) {
int index = random.nextInt(numbers.length());
otp.append(numbers.charAt(index));
}
return otp.toString();
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter OTP length (e.g., 4 or 6): ");
int digits = scanner.nextInt();
Instant start = Instant.now();
String otp = generateOTP(digits);
Instant end = Instant.now();
Duration timeTaken = Duration.between(start, end);
System.out.println("Generated OTP: " + otp);
System.out.println("Time taken: " + timeTaken.toMillis() + " milliseconds");
scanner.close();
}
}