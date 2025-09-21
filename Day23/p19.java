package Day23;

/*
 * 11. Parallel Streams
 * ------------------------------------------------------------
 * Description: Parallel streams divide the data into multiple chunks and process them concurrently using multiple threads.
 * Purpose: Improves performance for large datasets by leveraging multi-core processors.
 * Real Example: Processing millions of order records in an e-commerce system in parallel to calculate totals faster.
 */

import java.util.stream.IntStream;

public class p19 {
    public static void main(String[] args) {
        // Creating a stream of numbers from 1 to 9
        IntStream.range(1, 10)
                 .parallel()                    // Enable parallel processing
                 .forEach(System.out::println); // Print each number (order may vary)
    }
}
