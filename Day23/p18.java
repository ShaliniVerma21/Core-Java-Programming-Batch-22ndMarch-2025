package Day23;

/*
 * 10. Streams - Collectors
 * ------------------------------------------------------------
 * Description: Collectors collect stream elements into a collection like List, Set, or Map after processing.
 * Purpose: To gather results of stream operations into a concrete collection for further use.
 * Real Example: Filtering all programming languages starting with 'J' from a list of languages for reporting.
 */

import java.util.*;
import java.util.stream.Collectors;

public class p18 {
    public static void main(String[] args) {
        // List of programming languages
        List<String> names = Arrays.asList("Java", "Python", "JavaScript");
        
        // Filter languages starting with 'J' and collect into a new list
        List<String> filtered = names.stream()
                .filter(n -> n.startsWith("J"))  // Keep names starting with 'J'
                .collect(Collectors.toList());    // Collect into a List
        
        // Print the filtered list
        System.out.println(filtered);
    }
}
