// Implement a Java program that performs complex manipulations on an array of
// integers. The program should involve operations such as sorting, searching, and
// accessing elements at various indices. Introduce scenarios, where accessing elements
// beyond the bounds of the array leads to ArrayIndexOutOfBoundsException. Your
// task is to handle these exceptions gracefully and ensure the program continues
// execution without crashing.

import java.util.*;

public class q19 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Arrays.sort(arr);
        
        try {
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        }
    }
}
