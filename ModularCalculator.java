/**
 * Modular Calculator Program
 * Demonstrates method design, overloading, pass-by-value and exception handling
 */
public class ModularCalculator {

    // Addition (int)
    public static int add(int a, int b) {
        return a + b;
    }

    // Addition (double) - Method Overloading
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Division with exception handling
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    // Pass-by-value demonstration
    public static void passByValue(int x) {
        x = x + 10;
        System.out.println("Inside method value: " + x);
    }

    // Main method to test all methods
    public static void main(String[] args) {

        System.out.println("Addition (int): " + add(10, 20));
        System.out.println("Addition (double): " + add(10.5, 20.5));
        System.out.println("Subtraction: " + subtract(30, 10));
        System.out.println("Multiplication: " + multiply(5, 4));

        try {
            System.out.println("Division: " + divide(10, 2));
            System.out.println("Division: " + divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        int value = 5;
        passByValue(value);
        System.out.println("Outside method value: " + value);
    }
}
