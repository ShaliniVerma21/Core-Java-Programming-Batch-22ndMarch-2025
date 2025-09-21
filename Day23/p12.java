package Day23;

/*
 * 4. Method Reference Example
 * ------------------------------------------------------------
 * Description: Method references provide a shorthand notation for calling existing methods using "::" operator.
 * Purpose: Makes code more readable by reusing existing methods instead of writing lambdas.
 * Real Example: Sorting a list of names using String's compareToIgnoreCase method instead of writing a custom comparator.
 */

import java.util.Arrays;

public class p12 {
    public static void main(String[] args) {
        // Array of names
        String[] names = {"Shalini", "Rahul", "Amit"};
        
        // Sorting using method reference (instead of lambda comparator)
        Arrays.sort(names, String::compareToIgnoreCase);
        
        // Printing each name using method reference
        Arrays.stream(names).forEach(System.out::println);
    }
}
