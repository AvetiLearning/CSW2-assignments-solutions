package FileManagement;
import java.util.Scanner;
import java.io.File;
public class q9 {
    public static void main(String[] args) {
        //     Display File Metadata: Create a Java program that displays metadata of a specified
// file. The user should be able to input the file name, and the program should output
// the file size, last modified date, and other available attributes

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        if(!file.exists()){
            System.out.println("File does not exist");
            return;
        }
        System.out.println("File size: " + file.length() + " bytes");
        System.out.println("Last modified: " + file.lastModified());
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Executable: " + file.canExecute());

        
    }
}
