package Day23;

/*
 * 2. Lambda with Parameters
 * ------------------------------------------------------------
 * Description: Lambda expressions can accept parameters just like methods, making code more flexible.
 * Purpose: Used to implement functional interfaces (Single Abstract Method) in a concise way.
 * Real Example: Calculator operations (add, subtract, multiply) can be implemented using lambdas instead of separate classes.
 */

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);  // Single abstract method
}

public class p10 {
    public static void main(String[] args) {
        // Lambda implementation for addition
        MathOperation add = (a, b) -> a + b;
        
        // Using the lambda to perform operation
        System.out.println("Sum: " + add.operate(5, 3));
    }
}
