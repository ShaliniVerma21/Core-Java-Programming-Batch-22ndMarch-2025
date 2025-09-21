package Day23;

/*
 * 22. Stream Reduce Example
 * ------------------------------------------------------------
 * Description: The reduce() method performs a reduction on the elements of a stream, producing a single result.
 * Purpose: To aggregate or combine stream elements, such as sum, product, or concatenation.
 * Real Example: Calculating the total sales amount from a list of transaction values.
 */

import java.util.Arrays;

public class p6{
    public static void main(String[] args) {
        // Using reduce to calculate sum of integers
        int sum = Arrays.asList(1, 2, 3, 4, 5)
                        .stream()
                        .reduce(0, Integer::sum); // 0 is initial value, Integer::sum is accumulator
        
        // Print the sum
        System.out.println("Sum = " + sum);
    }
}
