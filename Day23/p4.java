package Day23;

/*
 * 20. Removing Duplicates using Streams
 * ------------------------------------------------------------
 * Description: The distinct() method in streams removes duplicate elements from a collection.
 * Purpose: To easily get unique elements without manually iterating and checking.
 * Real Example: Removing duplicate product IDs from a list before processing orders in an e-commerce app.
 */

import java.util.*;
import java.util.stream.Collectors;

public class p4 {
    public static void main(String[] args) {
        // List with duplicate integers
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        
        // Remove duplicates using distinct() and collect to a new list
        List<Integer> unique = list.stream()
                                   .distinct()
                                   .collect(Collectors.toList());
        
        // Print the list with unique elements
        System.out.println(unique);
    }
}
