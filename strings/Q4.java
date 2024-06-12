package strings;

import java.util.Scanner;

public class Q4 {
//     Create a Java program that uses StringBuilder to perform a series of text
// manipulations on a user-provided string. The program should allow users to:
// a. Add a substring at a specified position.
// b. Remove a range of characters from the string.
// c. Modify a character at a specified index.
// d. Concatenate another string at the end.
// e. Display the current string after each operation.
// The program should repeatedly prompt the user to choose an operation until they decide to
// exit. After each operation, it should display the modified string, demonstrating the mutable
// nature of StringBuilder


    public static void main(String[] args) {

        StringBuilder text = new StringBuilder("");
        Scanner sc = new Scanner(System.in);
       while (true) {
        int choice = 0;
        System.out.println("Enter your choice: ");
        System.out.println("1. Add a substring at a specified position.");
        System.out.println("2. Remove a range of characters from the string.");
        System.out.println("3. Modify a character at a specified index.");
        System.out.println("4. Concatenate another string at the end.");
        System.out.println("5. Display the current string after each operation.");
        System.out.println("6. Exit");
        
        choice = sc.nextInt();
        sc.nextLine();
        switch (sc.nextInt()) {
            case 1:
                System.out.println("Enter the substring: ");
                String sub = sc.nextLine();
                System.out.println("Enter the position: ");
                int pos = sc.nextInt();
                text.insert(pos, sub);
                break;
            case 2:
                System.out.println("Enter the start index: ");
                int start = sc.nextInt();
                System.out.println("Enter the end index: ");
                int end = sc.nextInt();
                text.delete(start, end);
                break;
            case 3:
                System.out.println("Enter the index: ");
                int index = sc.nextInt();
                System.out.println("Enter the character: ");
                char ch = sc.next().charAt(0);
                text.setCharAt(index, ch);
                break;
            case 4:
                System.out.println("Enter the string to concatenate: ");
                String str = sc.nextLine();
                text.append(str);
                break;
            case 5:
                System.out.println(text);
                break;
            case 6:
                return;
            default:
                System.out.println("Invalid choice");
                break;

        }

            
        System.out.println(text);
       }
    }

}
