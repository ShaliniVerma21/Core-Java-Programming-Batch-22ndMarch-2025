package Day23;

/*
 * 13. Optional - ifPresent
 * ------------------------------------------------------------
 * Description: The ifPresent() method executes a block of code only if the Optional contains a non-null value.
 * Purpose: Provides a safe way to perform actions without explicitly checking for null.
 * Real Example: Printing user city details only if it exists in the database.
 */

import java.util.Optional;

public class p20 {
    public static void main(String[] args) {
        // Creating an Optional with a non-null value
        Optional<String> city = Optional.of("Mumbai");
        
        // Perform action only if value is present
        city.ifPresent(c -> System.out.println("City: " + c));
    }
}
