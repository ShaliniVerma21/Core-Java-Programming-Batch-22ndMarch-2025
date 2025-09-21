package Day24;

/*
 * 25. Custom Exception Handling for Employee Age Validation
 * ------------------------------------------------------------
 * Description: Defines a custom exception to validate employee age.
 * Purpose: Demonstrates exception handling and creating user-defined exceptions in Java.
 * Real Example: Ensuring employee age is within a valid range before adding to HR database.
 */

// Custom exception class
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class Employee25 {
    String name;
    int age;

    Employee25(String name, int age) throws InvalidAgeException {
        if (age < 18 || age > 60) {
            throw new InvalidAgeException("Invalid age for employee: " + age);
        }
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + " years)";
    }
}

public class p9{
    public static void main(String[] args) {
        try {
            Employee25 emp1 = new Employee25("Shalini", 25);
            Employee25 emp2 = new Employee25("Rahul", 16); // Will throw exception
            System.out.println(emp1);
            System.out.println(emp2);
        } catch (InvalidAgeException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
