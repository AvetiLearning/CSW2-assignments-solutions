package strings;

public class Q3 {
//     Write a Java program that uses StringBuffer to construct a simple text editor which
// can perform the following operations:
// a. Append a given string to the existing text.
// b. Insert a given string at a specified index within the existing text.
// c. Delete a portion of text between two specified indices.
// d. Reverse the entire text.
// e. Replace a portion of the text between two specified indices with a given
// string.

    public static void main(String[] args) {

        StringBuffer text = new StringBuffer("Hello World");
        System.out.println(text);

        // a. Append a given string to the existing text.
        text.append("!");
        System.out.println(text);

        // b. Insert a given string at a specified index within the existing text.
        text.insert(5, " Java");
        System.out.println(text);

        // c. Delete a portion of text between two specified indices.
        text.delete(5, 10);
        System.out.println(text);

        // d. Reverse the entire text.
        text.reverse();
        System.out.println(text);

        // e. Replace a portion of the text between two specified indices with a given string.
        text.replace(0, 5, "Hello");
        System.out.println(text);
    }
}
