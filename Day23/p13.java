package Day23;

/*
 * 5. Constructor Reference Example
 * ------------------------------------------------------------
 * Description: Constructor reference (::new) is used to create objects without explicitly calling new inside lambda.
 * Purpose: Provides cleaner and more readable code when creating objects in functional style.
 * Real Example: Useful in factories or supplier patterns (e.g., creating Student objects on demand).
 */

import java.util.function.Supplier;

// Student class with default constructor
class Student {
    Student() {
        System.out.println("Student Created!");
    }
}

public class p13 {
    public static void main(String[] args) {
        // Constructor reference used with Supplier functional interface
        Supplier<Student> supplier = Student::new;
        
        // Creates a new Student object
        supplier.get();
    }
}
