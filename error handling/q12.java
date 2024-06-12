// Create a Java application that calculates the value of the expression sqrt(abs(sin(x) *
// cos(x))) / (tan(x) + 1) for a given value of x. Handle cases where x leads to division
// by zero or negative values inside the square root function.
public class q12 {
    public static void main(String[] args) {
        try {
            double x = Math.PI / 2;
            if(Math.tan(x)  + 1 == 0){
                throw new ArithmeticException();
            }
            if((Math.sin(x) * Math.cos(x)) < 0){
                throw new ArithmeticException();
            }


            double result = Math.sqrt(Math.abs(Math.sin(x) * Math.cos(x))) / (Math.tan(x) + 1);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Invalid mathematical operation.");
        }
    }
}
