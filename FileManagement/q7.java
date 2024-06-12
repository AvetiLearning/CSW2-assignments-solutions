package FileManagement;
import java.io.File;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;
public class q7 {
//     Copy File Content: Write a Java program that copies the content from one file
// (source) to another (destination). The program should prompt the user for both
// source and destination file paths and perform the copy operation, ensuring that it
// doesn't overwrite an existing file without user confirmation.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the source file path: ");
        String sourcePath = sc.nextLine();
        System.out.println("Enter the destination file path: ");
        String destinationPath = sc.nextLine();
        File sourceFile = new File(sourcePath);
        File destinationFile = new File(destinationPath);
        if(!sourceFile.exists()){
            System.out.println("Source file does not exist");
            return;
        }
        if(destinationFile.exists()){
            System.out.println("Destination file already exists.");
            return;
        }
        try {
            FileWriter fw = new FileWriter(destinationFile);
            Scanner myReader = new Scanner(sourceFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                fw.write(data);
            }
            myReader.close();
            fw.close();
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
