package Lambda;

import java.util.Arrays;
import java.util.List;

public class Q2 {
    // Write a program that sorts a list of strings based on their lengths in
    // descending order. Define a custom comparator using a lambda expression that
    // compares strings based on their lengths. Use the custom comparator to sort the
    // list of strings in descending order of length.

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange", "kiwi", "grape");
        list.sort((s1, s2) -> s2.length() - s1.length());
        System.out.println(list);
    }
}
