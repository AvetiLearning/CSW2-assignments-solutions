package strings;

import java.sql.Time;

public class Q5 {
//     Create a Java program that compares the performance of StringBuilder and
// StringBuffer when performing repeated string concatenations. The program should:
// a. Prompt the user to enter a base string and the number of times it should be
// concatenated to itself.
// b. Use StringBuilder to concatenate the string the specified number of times,
// tracking the time taken to complete the operation.
// c. Repeat the process using StringBuffer, again tracking the time taken.
// d. Output the time taken for each operation and the final length of the resulting
// strings to demonstrate both the time efficiency and the result of using
// StringBuilder and StringBuffer.
// Example output of the program could look like this:
// Enter the base string:
// > Hello
// Enter the number of concatenations:
// > 10000
// Using StringBuilder...
// Time taken: 5 milliseconds
// Final string length: 50000
// Using StringBuffer...
// Time taken: 6 milliseconds
// Final string length: 50000
// Comparison: StringBuilder was faster than StringBuffer by 1 millisecond.

    public static void main(String[] args) {
        String base = "Hello";
        int n = 10000;
        StringBuilder sb = new StringBuilder();
        StringBuffer sf = new StringBuffer();
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            sb.append(base);
        }
        long end = System.currentTimeMillis();
        System.out.println("Using StringBuilder...");
        System.out.println("Time taken: " + (end - start) + " milliseconds");
        System.out.println("Final string length: " + sb.length());
        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            sf.append(base);
        }
        end = System.currentTimeMillis();
        System.out.println("Using StringBuffer...");
        System.out.println("Time taken: " + (end - start) + " milliseconds");
        System.out.println("Final string length: " + sf.length());
        System.out.println("Comparison: StringBuilder was faster than StringBuffer by " + (end - start) + " milliseconds.");
    }
}
