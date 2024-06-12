package FileManagement;
import java.io.File;
import java.util.Scanner;

public class q10 {
    // Recursive Directory Listing: Write a Java program that recursively lists all files and
    // subdirectories within a given directory. The program should prompt the user for the
    // directory path and then display a structured list of all contents, including files and
    // directories nested within any subdirectories.
    public static void listFiles(File directory){
        File[] files = directory.listFiles();
        for(File file : files){
            if(file.isDirectory()){
                System.out.println("Directory: " + file.getName());
                listFiles(file);
            } else {
                System.out.println("File: " + file.getName());
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the directory path: ");
        String path = sc.nextLine();
        File directory = new File(path);
        if(!directory.exists()){
            System.out.println("Directory does not exist");
            return;
        }
        listFiles(directory);
    }

}
