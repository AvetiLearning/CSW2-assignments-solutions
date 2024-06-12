package FileManagement;
import java.io.*;
import java.util.Scanner;
public class q3 {
    
    public static void main(String[] args) {
//         Append Content to an Existing File: Write a Java program that adds a new diary
// entry to the "diary.txt" file without overwriting its existing content. The program should
// ask the user for the new entry and append it to the file along with a timestamp.
        System.out.println("Enter your diary entry: ");
        Scanner sc = new Scanner(System.in);
        String entry = sc.nextLine();
        try {
            File diary = new File("diary.txt");
            if(!diary.exists()){
                System.out.println("File does not exist");
                return;
            }

            FileWriter myWriter = new FileWriter(diary, true);
            myWriter.write(entry);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
    }
    sc.close();
}
}
