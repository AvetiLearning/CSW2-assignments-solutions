package FileManagement;
import java.io.File;
import java.util.Scanner;
public class q8 {
//     Rename a File: Develop a Java application that renames a specified file. The
// program should request the current file name and the new file name from the user,
// renaming the file accordingly and confirming the action upon completion.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the current file name: ");
        String currentFileName = sc.nextLine();
        File currentFile = new File(currentFileName);
        if(!currentFile.exists()){
            System.out.println("File does not exist");
            return;
        }
        System.out.println("Enter the new file name: ");
        String newFileName = sc.nextLine();
        File newFile = new File(newFileName);
        if(currentFile.renameTo(newFile)){
            System.out.println("File renamed successfully");
        } else {
            System.out.println("Error renaming file");
        }
    }
}
