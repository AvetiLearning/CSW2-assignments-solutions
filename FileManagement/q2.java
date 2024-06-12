package FileManagement;

import java.io.*;
import java.util.*;
public class q2 {
    public static void main(String[] args) {
        // Read from a File: Write a Java program that reads the contents of the file "diary.txt"
        // created in the previous question and displays them to the user. Ensure the program
        // checks if the file exists before reading from it.
        try {
            File diary = new File("diary.txt");
            if(!diary.exists()){
                System.out.println("File does not exist");
                return;
            }
            Scanner reader = new Scanner(diary);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
        
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }
}
