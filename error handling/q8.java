// Write a Java program to find the square root of integer numbers. Demonstrate the use of
// try-catch block to handle ArithmeticException.
public class q8 {
    public static void main(String[] args) {
        try {
            double num = Math.sqrt(-1);
            System.out.println(num);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        }
    }
}
