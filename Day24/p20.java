package Day24;

/*
 * 13. Advanced Lambda – Custom Functional Interface for Promotions
 * ------------------------------------------------------------
 * Description: Uses a custom functional interface to determine employee promotion eligibility.
 * Purpose: Demonstrates defining and using functional interfaces with lambda expressions.
 * Real Example: Automatically checking if employees qualify for promotion based on salary and performance.
 */

// Custom functional interface
@FunctionalInterface
interface PromotionEligibility {
    boolean isEligible(Employee13 e);
}

class Employee13 {
    String name;
    double salary;
    int performanceScore;

    Employee13(String name, double salary, int performanceScore) {
        this.name = name;
        this.salary = salary;
        this.performanceScore = performanceScore;
    }

    @Override
    public String toString() {
        return name + " (Salary: " + salary + ", Score: " + performanceScore + ")";
    }
}

public class p20 {
    public static void main(String[] args) {
        Employee13 emp = new Employee13("Shalini", 75000, 85);

        // Lambda expression to check promotion eligibility
        PromotionEligibility eligibility = e -> e.salary < 80000 && e.performanceScore > 80;

        if (eligibility.isEligible(emp)) {
            System.out.println(emp.name + " is eligible for promotion!");
        } else {
            System.out.println(emp.name + " is not eligible for promotion.");
        }
    }
}
