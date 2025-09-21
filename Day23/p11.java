package Day23;

/*
 * 3. Functional Interface + @FunctionalInterface annotation
 * ------------------------------------------------------------
 * Description: A functional interface has exactly one abstract method and can be implemented using lambda expressions.
 * Purpose: Helps enforce functional programming style in Java (SAM - Single Abstract Method).
 * Real Example: Useful in defining callback functions like Greeting, Logging, or Event Handling.
 */

@FunctionalInterface
interface Greeting {
    void sayHello(String name);  // Single abstract method
}

public class p11 {
    public static void main(String[] args) {
        // Lambda expression implementing Greeting interface
        Greeting g = n -> System.out.println("Hello " + n);
        
        // Using the functional interface
        g.sayHello("Shalini");
    }
}
