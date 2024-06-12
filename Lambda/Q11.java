package Lambda;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Q11 {
//     Write a Java program that converts a given date and time in UTC to the
// local date and time of a specific time zone (e.g., "America/New_York"). Parse a
// string representing a date and time in UTC format. Convert the parsed Instant to
// a ZonedDateTime using a specific ZoneId.

    public static void main(String[] args) {
        // Parse a string representing a date and time in UTC format
        String date = "2021-07-01T12:00:00Z";
        Instant instant = Instant.parse(date);
        System.out.println(instant);

        // Convert the parsed Instant to a ZonedDateTime using a specific ZoneId
        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        ZonedDateTime zonedDateTime = instant.atZone(zoneId);
        System.out.println(zonedDateTime);
    }

}
