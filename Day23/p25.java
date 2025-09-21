package Day23;

/*
 * 18. CompletableFuture with Return Value
 * ------------------------------------------------------------
 * Description: CompletableFuture.supplyAsync() executes a task asynchronously and returns a result.
 * Purpose: To perform background computations and retrieve results once completed without blocking main thread.
 * Real Example: Fetching user details from a remote service asynchronously and processing them once available.
 */

import java.util.concurrent.CompletableFuture;

public class p25{
    public static void main(String[] args) {
        // Run an asynchronous task that returns a value
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello from Future");
        
        // Wait for result and print it
        System.out.println(future.join());
    }
}
