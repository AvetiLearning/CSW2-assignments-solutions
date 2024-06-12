package strings;

public class Q6 {
//     Case Conversion and Comparison: Prompt the user to input two strings. Convert
// both strings to lowercase and uppercase. Compare the converted strings to check
// case-insensitive equality. Display the converted strings and the result of the
// comparison

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = sc.nextLine();

        String s1Lower = s1.toLowerCase();
        String s2Lower = s2.toLowerCase();
        String s1Upper = s1.toUpperCase();
        String s2Upper = s2.toUpperCase();

        System.out.println("s1Lower: " + s1Lower);
        System.out.println("s2Lower: " + s2Lower);
        System.out.println("s1Upper: " + s1Upper);
        System.out.println("s2Upper: " + s2Upper);

        System.out.println("s1Lower equals s2Lower: " + s1Lower.equals(s2Lower));
        System.out.println("s1Upper equals s2Upper: " + s1Upper.equals(s2Upper));
    }
}
