package FileManagement;
import java.io.*;
import java.util.Scanner;
import java.time.LocalDate;
public class q1 {

    public static void main(String[] args) {
//         Create and Write to a File: Write a Java program that prompts the user for a diary
// entry, then creates a file named "diary.txt" and writes the current date followed by the
// user's entry into this file. Ensure the program checks if the file already exists and
// informs the user, to avoid overwriting any previous content.
        System.out.println("Enter your diary entry: ");
        Scanner sc = new Scanner(System.in);
        String entry = sc.nextLine();
        try {
            File diary = new File("diary.txt");
            if(diary.exists()){
                System.out.println("File already exists");
                return;
            }

            FileWriter myWriter = new FileWriter(diary);
            myWriter.write("Date: " + LocalDate.now() + "\n" + entry);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");  
    }
    }
}