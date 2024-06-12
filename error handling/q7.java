// Create a method that takes a string input and converts it to an integer. Handle
// NumberFormatException using try-catch block and prompt the user to enter a valid
// number upon exception.

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try {
            int num = Integer.parseInt(input);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter a valid number.");
        }
    }
}
