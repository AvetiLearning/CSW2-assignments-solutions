// Create a program that divides two numbers input by the user. Handle the possibility of
// division by zero using try-catch block to catch ArithmeticException.
import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        try {
            System.out.println("Enter the first number: ");
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = sc.nextInt();
            double result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
    }
}
