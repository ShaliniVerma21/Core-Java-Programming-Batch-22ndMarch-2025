package Day23;

/*
 * 12. Optional Class - Avoid NullPointer
 * ------------------------------------------------------------
 * Description: Optional is a container object which may or may not contain a non-null value.
 * Purpose: Helps to avoid NullPointerException by providing safe access and default values.
 * Real Example: Returning an Optional user name from a database query that may not find a match.
 */

import java.util.Optional;

public class p2 {
    public static void main(String[] args) {
        // Creating an Optional that may contain null
        Optional<String> name = Optional.ofNullable(null);
        
        // Provide a default value if the Optional is empty
        System.out.println(name.orElse("Default Name"));
    }
}
