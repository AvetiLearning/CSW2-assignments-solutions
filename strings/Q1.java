package strings;


public class Q1 {
//     Write a Java program that illustrates the difference between using string literals and
// the new keyword for creating String objects. Your program should demonstrate the
// memory usage implications and how string comparison behaves differently in each
// case.

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s3 == s4); // false

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s3.equals(s4)); // true
    }
}
