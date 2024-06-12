package Lambda;

import java.util.function.Function;


public class Q7 {
//     Write a program that calculates factorial using a recursive lambda
// expression. Define a recursive lambda expression to calculate factorial. Use the
// lambda expression to calculate factorial of a given number

    public static void main(String[] args) {
        Function<Integer, Integer> factorial = factorial();
        System.out.println(factorial.apply(5));
    }

    public static Function<Integer, Integer> factorial() {
        return (x) -> x == 0 ? 1 : x * factorial().apply(x - 1);
    }


}
