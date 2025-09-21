package Day23;

/*
 * 9. Streams - Filter & Map
 * ------------------------------------------------------------
 * Description: Stream's filter() selects elements based on a condition, and map() transforms each element.
 * Purpose: Enables functional-style processing of collections in a concise way.
 * Real Example: Squaring all even numbers from a list of transaction amounts before further processing.
 */

import java.util.Arrays;
import java.util.List;

public class p17 {
    public static void main(String[] args) {
        // List of integers
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        
        // Filtering even numbers, squaring them, and printing
        nums.stream()
            .filter(n -> n % 2 == 0)   // Keep only even numbers
            .map(n -> n * n)           // Square each filtered number
            .forEach(System.out::println); // Print each squared number
    }
}
