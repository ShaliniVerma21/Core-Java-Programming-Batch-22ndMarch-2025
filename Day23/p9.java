package Day23;

/*
 * 25. Stream Peek (Debugging)
 * ------------------------------------------------------------
 * Description: Peek() allows you to see the stream elements as they flow through, mainly for debugging/logging.
 * Purpose: Helps in checking intermediate operations inside a stream pipeline.
 * Real Example: Useful while processing a list of orders to log each step (before/after applying discounts).
 */

import java.util.stream.Stream;

public class p9 {
    public static void main(String[] args) {
        // Creating a stream of strings
        Stream.of("one","two","three")
              .peek(System.out::println)       // Peek to debug/log elements
              .map(String::toUpperCase)        // Convert each string to uppercase
              .forEach(System.out::println);   // Print final results
    }
}
