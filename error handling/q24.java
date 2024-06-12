// Write a Java program to demonstrate a checked exception (e.g.,
// FileNotFoundException) being thrown and caught using try-catch block.
import java.io.*;
import java.util.*;
public class q24 {
    public static void main(String[] args) {
        
        File file = new File("nonexistentfile.txt");
        
        try {
            Scanner scanner = new Scanner(file);
            // Reading from the file
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            // Handling the FileNotFoundException
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
