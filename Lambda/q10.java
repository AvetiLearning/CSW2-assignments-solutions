package Lambda;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q10 {
//     Write a Java program that takes a LocalDateTime object and formats it to
// a custom string format ("yyyy-MM-dd HH:mm:ss"). Define a LocalDateTime
// object representing a specific date and time. Use DateTimeFormatter to format
// the LocalDateTime object to the desired string format.


    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime = now.format(formatter);
        System.out.println(formatDateTime);
    }
}
