package Day23;

/*
 * 1. Basic Lambda Expression
 * ------------------------------------------------------------
 * Description: Lambda expressions provide a concise way to represent functional interfaces (single abstract method).
 * Purpose: Replaces anonymous inner classes to reduce boilerplate code and make Java more functional.
 * Real Example: Instead of creating a full Runnable class, we can use a lambda to define a short task in multithreading.
 */

public class p1 {
    public static void main(String[] args) {
        // Runnable using lambda expression (no need of anonymous class)
        Runnable r = () -> System.out.println("Hello from Lambda!");
        
        // Running the task
        r.run();
    }
}
