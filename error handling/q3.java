// Implement a custom NullPointerException class named
// CustomNullPointerException that mimics the behavior of the standard
// NullPointerException, but instead of using default error messages or null references,
// it takes a String message as its constructor argument. Your task is to create this custom
// exception class and demonstrate its usage in a Java program.

import java.io.*;
import java.util.*;

class CustomNullPointerException extends Exception {
    public CustomNullPointerException(String message) {
        super(message);
    }
}

public class q3 {
    public static void main(String[] args) {
        String  s = null;
        try {
            if(s == null){
                throw new CustomNullPointerException("Null Pointer Exception");
            }
            System.out.println(s.length());
        } catch (CustomNullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred.");
        }
    }
}
