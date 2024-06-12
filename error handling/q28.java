// Implement a Java program to handle StackOverflowError.

public class q28 {
    public static void main(String[] args) {
        try {
            printHello();
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError: " + e.getMessage());
        }
    }
    public static void printHello() {
        System.out.println("Hello");
        printHello();
    } 
}
