package Day23;

/*
 * 6. Default Method in Interface
 * ------------------------------------------------------------
 * Description: Default methods in interfaces allow adding new methods with a default implementation without breaking existing code.
 * Purpose: Supports backward compatibility and lets interfaces evolve over time.
 * Real Example: In Java Collections, default methods like forEach() were added in JDK 8 without breaking old implementations.
 */

interface Vehicle {
    // Default method with implementation
    default void start() { 
        System.out.println("Vehicle starting..."); 
    }
}

public class p14 implements Vehicle {
    public static void main(String[] args) {
        // Using default method of the interface
        new p14().start();
    }
}
