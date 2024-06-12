// Write a program that reads data from a file and performs some processing. Handle
// checked IOException by using try-catch block to catch and handle the exception.

import java.io.*;
import java.util.Scanner;

public class q23 {
    public static void main(String[] args) {
        try {
            File diary = new File("diary.txt");
            Scanner reader = new Scanner(diary);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
     
            FileWriter myWriter = new FileWriter(diary);
            myWriter.write("HI");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
