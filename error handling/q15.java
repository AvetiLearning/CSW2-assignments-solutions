// 5. Demonstration of use nested try-catch block. Write a Java program to handle
// NumberFormatException in outer try-catch block and ArithmeticException inside
// the inner try-catch block.

public class q15 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("Hello");
            System.out.println(num);
            try {
                double result = 5 / 0;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero is not allowed.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}