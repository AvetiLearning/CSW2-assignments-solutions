
// Write a program to handle ClassCastException.

import java.util.*;

public class q27 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("Hello");
        try {
            Integer x = (Integer) list.get(0);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }
    }
}