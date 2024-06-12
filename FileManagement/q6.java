package FileManagement;
import java.io.File;
import java.util.Scanner;
public class q6 {
//     Delete a Specific File: Write a Java program where the user can enter the name of a
// file to be deleted from the system. The program should check if the file exists and
// delete it, providing a confirmation message upon successful deletion or an error
// message if the file does not exist.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        if(!file.exists()){
            System.out.println("File does not exist");
            return;
        }
        if(file.delete()){
            System.out.println("File deleted successfully");
        } else {
            System.out.println("Error deleting file");
        }
    }
}
