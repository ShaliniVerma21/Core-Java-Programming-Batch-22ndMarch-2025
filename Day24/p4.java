package Day24;

import java.util.*;
import java.util.stream.Collectors;

/*
 * 20. Finding Second Highest Salary using Streams
 * ------------------------------------------------------------
 * Description: Finds the employee with the second highest salary using Stream sorted().
 * Purpose: Demonstrates advanced stream operations like sorting, skipping, and limiting.
 * Real Example: Identifying the second top earner in a company for recognition or reporting.
 */

class Employee20 {
    String name;
    double salary;

    Employee20(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }
}

public class p4 {
    public static void main(String[] args) {
        List<Employee20> employees = Arrays.asList(
                new Employee20("Shalini", 75000),
                new Employee20("Rahul", 50000),
                new Employee20("Kavita", 60000),
                new Employee20("Amit", 72000)
        );

        // Find second highest salary
        Employee20 secondHighest = employees.stream()
                .sorted(Comparator.comparingDouble(Employee20::getSalary).reversed())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println("Second Highest Paid Employee: " + secondHighest);
    }
}

// Add getter for salary
class Employee20 {
    String name;
    double salary;

    Employee20(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }
}
