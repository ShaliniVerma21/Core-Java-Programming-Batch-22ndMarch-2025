package Day23;

/*
 * 17. CompletableFuture - Async Task
 * ------------------------------------------------------------
 * Description: CompletableFuture allows executing tasks asynchronously without blocking the main thread.
 * Purpose: To perform background operations concurrently and improve application responsiveness.
 * Real Example: Sending email notifications asynchronously after a user registration without delaying response.
 */

import java.util.concurrent.CompletableFuture;

public class p24{
    public static void main(String[] args) {
        // Run an asynchronous task using CompletableFuture
        CompletableFuture.runAsync(() -> {
            System.out.println("Async task running...");
        }).join(); // Waits for completion of async task
    }
}
