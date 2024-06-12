package strings;

public class Q7 {
//     Character Array and Search: Ask for a string from the user. Convert the string to a
// character array. Prompt the user to enter a character to search in the string. Find the
// first and last occurrences of the character. Display the character array and the
// positions found (if any)

public static void main(String[] args){
    
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        char[] charArray = s.toCharArray();
        System.out.println("Enter a character to search: ");
        char c = sc.next().charAt(0);
        int firstOccurrence = -1;
        int lastOccurrence = -1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == c) {
                if (firstOccurrence == -1) {
                    firstOccurrence = i;
                }
                lastOccurrence = i;
            }
        }
        System.out.println("Character array: ");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
        System.out.println();
        if (firstOccurrence != -1) {
            System.out.println("First occurrence of " + c + " at index " + firstOccurrence);
            System.out.println("Last occurrence of " + c + " at index " + lastOccurrence);
        } else {
            System.out.println("Character not found");
        }
}
}
