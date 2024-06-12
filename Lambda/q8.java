package Lambda;

public class Q8 {
//     Write a program that creates a thread using a lambda expression as the
// Runnable and prints "Hello, CSW2!" from the thread. Define a lambda
// expression that implements the Runnable interface and prints "Hello, CSW2!".
// Create a thread using the lambda expression and start the thread

    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello, CSW2!");
        Thread t = new Thread(r);
        t.start();
    }
}
