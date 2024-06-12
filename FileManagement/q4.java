package FileManagement;
import java.io.File;
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
//         List Files and Directories: Write a program in Java that asks the user for a directory
// path and then lists all files and subdirectories in that directory. If the directory does
// not exist, the program should inform the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the directory path: ");
        String path = sc.nextLine();
        File directory = new File(path);
        if(!directory.exists()){
            System.out.println("Directory does not exist");
            return;
        }
        File[] files = directory.listFiles();
        for(File file : files){
            System.out.println(file.getName());
        }
    }
}
