// Write a Java program that computes the value of the function log(sin(x) + cos(x)) /
// (tan(x) - cot(x)) for a given value of x. Ensure proper handling of exceptions that may
// occur due to invalid mathematical operations.

public class q11 {
    public static void main(String[] args) {
        try {
            double x = Math.PI / 2;
            if(Math.tan(x)==0 || 1 / Math.tan(x)==0){
                throw new ArithmeticException();
            }
            if(Math.sin(x) + Math.cos(x) <= 0){
                throw new ArithmeticException();
            }
            double result = Math.log(Math.sin(x) + Math.cos(x)) / (Math.tan(x) - 1 / Math.tan(x));
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Invalid mathematical operation.");
        }
    }
}
