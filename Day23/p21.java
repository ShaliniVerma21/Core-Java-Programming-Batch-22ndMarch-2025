package Day23;

/*
 * 14. New Date & Time API
 * ------------------------------------------------------------
 * Description: JDK 8 introduced a new Date and Time API (java.time) to replace the outdated Date and Calendar classes.
 * Purpose: Provides immutable, thread-safe, and easy-to-use classes for date and time manipulation.
 * Real Example: Getting current date and time for logging user activities in an application.
 */

import java.time.LocalDate;
import java.time.LocalTime;

public class p21 {
    public static void main(String[] args) {
        // Get current date
        LocalDate today = LocalDate.now();
        
        // Get current time
        LocalTime now = LocalTime.now();
        
        // Print date and time
        System.out.println(today);
        System.out.println(now);
    }
}
