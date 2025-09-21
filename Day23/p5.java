package Day23;

/*
 * 21. Sorting with Streams
 * ------------------------------------------------------------
 * Description: The sorted() method in streams sorts elements in natural order or using a comparator.
 * Purpose: Provides an easy way to sort collections functionally without loops.
 * Real Example: Sorting a list of product names alphabetically before displaying on an e-commerce website.
 */

import java.util.*;
import java.util.stream.Collectors;

public class p5 {
    public static void main(String[] args) {
        // List of fruits
        List<String> list = Arrays.asList("Banana", "Apple", "Mango");
        
        // Sort the list using streams and collect to a new list
        List<String> sorted = list.stream()
                                  .sorted() // Natural order
                                  .collect(Collectors.toList());
        
        // Print the sorted list
        System.out.println(sorted);
    }
}
