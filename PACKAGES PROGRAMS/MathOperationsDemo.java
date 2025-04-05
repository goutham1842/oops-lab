package mymath;

public class MathOperationsDemo {

    public void displayMathOperations() {
        double a = 5.0;
        double b = 3.0;
        double negativeValue = -12.5;

        System.out.println("====== Java Math Operations ======\n");

        System.out.println("1. Values:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("negativeValue = " + negativeValue);
        System.out.println();

        // Square root
        System.out.println("2. Square root of a * b: " + Math.sqrt(a * b));

        // Maximum and Minimum
        System.out.println("3. Max of a and b: " + Math.max(a, b));
        System.out.println("4. Min of a and b: " + Math.min(a, b));

        // Power and Exponential
        System.out.println("5. a raised to the power b: " + Math.pow(a, b));
        System.out.println("6. Exponential of a: " + Math.exp(a));

        // Logarithmic
        System.out.println("7. Natural log of a: " + Math.log(a));
        System.out.println("8. Base 10 log of a: " + Math.log10(a));

        // Trigonometric
        System.out.println("9. Sin(a): " + Math.sin(a));
        System.out.println("10. Cos(b): " + Math.cos(b));
        System.out.println("11. Tan(a): " + Math.tan(a));

        // Rounding
        System.out.println("12. Rounded a: " + Math.round(a));
        System.out.println("13. Ceiling of b: " + Math.ceil(b));
        System.out.println("14. Floor of b: " + Math.floor(b));

        // Absolute value
        System.out.println("15. Absolute of negativeValue: " + Math.abs(negativeValue));

        // Random number
        double random = Math.random(); // returns 0.0 to <1.0
        System.out.println("16. Random number between 0 and 1: " + random);
        System.out.println("17. Random number between 1 and 100: " + (int)(random * 100 + 1));

        // Angle Conversion
        double degrees = 90.0;
        double radians = Math.toRadians(degrees);
        System.out.println("18. Radians of 90 degrees: " + radians);
        System.out.println("19. Degrees of π/2 radians: " + Math.toDegrees(Math.PI / 2));

        // Hypotenuse
        System.out.println("20. Hypotenuse of sides 3 and 4: " + Math.hypot(3, 4)); // = 5.0

        System.out.println("\n====== End of Operations ======");
    }
}
