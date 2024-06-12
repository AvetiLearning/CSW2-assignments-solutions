
// Implement a method that reads an integer from the user but handles
// InputMismatchException using try-catch block.
import java.util.InputMismatchException;
import java.util.Scanner;
public class q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        try {
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
}
}
