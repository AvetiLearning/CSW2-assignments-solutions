package Lambda;

interface Calculator {
    public double calculate(double a, double b);
    
}
public class Q1 {
    // Create a functional interface Calculator with methods for addition,
// subtraction, multiplication, and division. Implement these methods using
// lambda expressions. Define the Calculator functional interface with methods for
// arithmetic operations. Implement the interface methods using lambda
// expressions for basic arithmetic operations.

    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator mul = (a, b) -> a * b;
        Calculator div = (a, b) -> a / b;
        
        System.out.println(add.calculate(2, 3));
        System.out.println(sub.calculate(2, 3));
        System.out.println(mul.calculate(2, 3));
        System.out.println(div.calculate(2, 3));
    }

}
