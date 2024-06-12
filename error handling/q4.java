// Implement a Java program that reads a file path from the command line argument and
// attempts to read the contents of the file. If the file path is null or points to a non-existent
// file, throw a custom FileNotFoundException. If the file exists but cannot be read due
// to permission issues, throw a custom FileReadPermissionException. Your task is to
// create these custom exception classes and handle them appropriately in your program.

import java.io.*;
import java.util.*;

class FileNotFoundException extends Exception {
    public FileNotFoundException(String message) {
        super(message);
    }
}

class FileReadPermissionException extends Exception {
    public FileReadPermissionException(String message) {
        super(message);
    }
}


public class q4 {
    public static void main(String[] args) {
        try {
            if(args.length == 0){
                throw new FileNotFoundException("File path is null");
            }
            File file = new File(args[0]);
            if(!file.exists()){
                throw new FileNotFoundException("File does not exist");
            }
            if(!file.canRead()){
                throw new FileReadPermissionException("File cannot be read due to permission issues");
            }
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (FileReadPermissionException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println("An error occurred.");
        }
    }
}
