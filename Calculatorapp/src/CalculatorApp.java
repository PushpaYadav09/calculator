import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        String operation;

        System.out.println("Enter first number:");
        num1 = scanner.nextDouble();

        System.out.println("Enter an operation (+, -, *, /):");
        operation = scanner.next();

        System.out.println("Enter second number:");
        num2 = scanner.nextDouble();

        try {
            double result = calculate(num1, num2, operation);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ERROR X:Diving with ZERO is not allowed!!!");
        } catch (Exception e) {
            System.out.println("ERROR X: " + e.getMessage());
        }

        scanner.close();
    }

    public static double calculate(double num1, double num2, String operation) throws Exception {
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return num1 / num2;
            default:
                throw new Exception("Invalid operation");
        }
    }
}
