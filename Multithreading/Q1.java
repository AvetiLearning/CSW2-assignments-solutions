package Multithreading;

public class Q1 {
//     Write a Java program to create a simple calculator that performs arithmetic operations
// (addition, subtraction, multiplication, division) using multiple threads. Each arithmetic operation
// should be handled by a separate thread.

public static void main(String[] args) {
    double num1 = 10.0;
    double num2 = 5.0;

    // Create and start threads for each arithmetic operation using lambda expressions
    Thread additionThread = new Thread(() -> {
        double result = num1 + num2;
        System.out.println("Addition Result: " + result);
    });

    Thread subtractionThread = new Thread(() -> {
        double result = num1 - num2;
        System.out.println("Subtraction Result: " + result);
    });

    Thread multiplicationThread = new Thread(() -> {
        double result = num1 * num2;
        System.out.println("Multiplication Result: " + result);
    });

    Thread divisionThread = new Thread(() -> {
        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println("Division Result: " + result);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    });

    // Start the threads
    additionThread.start();
    subtractionThread.start();
    multiplicationThread.start();
    divisionThread.start();
}
}