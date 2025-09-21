package Day23;

/*
 * 15. DateTime API - Formatting
 * ------------------------------------------------------------
 * Description: DateTimeFormatter formats LocalDateTime objects into readable strings according to a pattern.
 * Purpose: To display date and time in custom formats for UI or reports.
 * Real Example: Displaying order timestamps in "dd-MM-yyyy HH:mm" format on an e-commerce dashboard.
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class p22 {
    public static void main(String[] args) {
        // Get current date and time
        LocalDateTime dt = LocalDateTime.now();
        
        // Format date-time into custom pattern
        String formatted = dt.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
        
        // Print formatted date-time
        System.out.println(formatted);
    }
}
