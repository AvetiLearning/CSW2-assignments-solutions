package Lambda;

import java.util.function.Function;

public class Q6 {
//     Write a program that demonstrates a function returning another function,
// where the inner function calculates the square of a number. Define a function
// that returns another function. The inner function should calculate the square of a
// given number. Demonstrate the use of the returned function to calculate squares

    public static void main(String[] args) {
        Function<Double, Double> square =  square();
        System.out.println(square.apply(5.0))   ;
    }

    public static Function<Double, Double> square() {
        return (x) -> x * x;
    }

}
