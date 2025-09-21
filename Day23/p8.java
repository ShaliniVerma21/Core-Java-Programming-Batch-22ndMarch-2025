package Day23;

/*
 * 24. Stream AnyMatch, AllMatch, NoneMatch
 * ------------------------------------------------------------
 * Description: These methods check if any, all, or none of the stream elements match a given predicate.
 * Purpose: To perform quick checks on collections without explicit loops.
 * Real Example: Checking if any product is out of stock, or if all orders are delivered in an e-commerce system.
 */

import java.util.Arrays;

public class p8{
    public static void main(String[] args) {
        // List of integers
        boolean anyEven = Arrays.asList(1, 3, 5, 6)
                                .stream()
                                .anyMatch(n -> n % 2 == 0); // Check if any element is even
        
        // Print result
        System.out.println("Any Even: " + anyEven);
    }
}
