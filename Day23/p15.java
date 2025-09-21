package Day23;

/*
 * 7. Static Method in Interface
 * ------------------------------------------------------------
 * Description: Interfaces can have static methods which belong to the interface itself, not to instances.
 * Purpose: Provides utility/helper methods related to the interface without requiring object creation.
 * Real Example: In Java's built-in interfaces like Comparator, static methods such as comparing() are provided for common use.
 */

interface Calculator {
    // Static method in interface
    static int add(int a, int b) { 
        return a + b; 
    }
}

public class p15 {
    public static void main(String[] args) {
        // Calling static method directly using interface name
        System.out.println("Sum = " + Calculator.add(5, 10));
    }
}
