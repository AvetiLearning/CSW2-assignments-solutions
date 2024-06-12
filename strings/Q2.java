package strings;

public class Q2 {
//     Write a Java program that demonstrates the immutability of the String class and how
// it implements the CharSequence interface. Your program should illustrate the
// behaviours that highlight String immutability and its usage as a CharSequence

    public static void main(String[] args) {

        String s1 = "Hello";
        System.out.println(s1.hashCode());
        s1 += " World";
        System.out.println(s1.hashCode());
        // CharSequence interface
        CharSequence cs =  s1;
        System.out.println(cs.charAt(0));
        System.out.println(cs.length());
        System.out.println(cs.subSequence(0, 5));
    }

}
