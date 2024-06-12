// Write a Java program to handle NumberFormatException.
public class q6 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("Hello");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}
