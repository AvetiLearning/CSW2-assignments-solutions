package FileManagement;
import java.io.File;
import java.util.Scanner;
public class q5 {
//     Filter and List Specific File Types: Create a Java application that lists all the ".txt"
// files in a given directory. The program should prompt the user for the directory path
// and then display a list of all text files found in that directory.
    public static void main(String[] args) {
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
            if(file.getName().endsWith(".txt")){
                System.out.println(file.getName());
            }
        }
    }
}
