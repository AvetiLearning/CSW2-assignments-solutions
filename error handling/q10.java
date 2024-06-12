// Implement a Java program that calculates the value of the expression (sin(x) + cos(x))
// / tan(x) for a given value of x. Handle scenarios where x is close to multiples of π/2 to
// avoid division by zero errors.
public class q10 {
    public static void main(String[] args) {
        try {
            double epsi = 0.0001;
            double x = Math.PI / 2;
            if (x % (Math.PI / 2) < epsi ){
                throw new ArithmeticException();
            }
            double result = (Math.sin(x) + Math.cos(x)) / Math.tan(x);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
    }
}
