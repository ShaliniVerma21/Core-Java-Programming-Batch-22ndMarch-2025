package Day24;

import java.util.*;
import java.util.stream.Collectors;

/*
 * 6. Finding Highest Paid Employee using Streams.max()
 * ------------------------------------------------------------
 * Description: Uses Stream API to find the employee with the maximum salary.
 * Purpose: Demonstrates functional approach to finding extrema using optional results.
 * Real Example: Identifying the top earner in a company for bonuses or awards.
 */

class Employee6 {
    int id;
    String name;
    String department;
    double salary;

    Employee6(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }
}

public class p14 {
    public static void main(String[] args) {
        List<Employee6> employees = Arrays.asList(
                new Employee6(101, "Shalini", "IT", 75000),
                new Employee6(102, "Rahul", "HR", 50000),
                new Employee6(103, "Kavita", "Finance", 60000),
                new Employee6(104, "Amit", "IT", 72000)
        );

        // Find employee with highest salary
        Employee6 highestPaid = employees.stream()
                .max(Comparator.comparingDouble(e -> e.salary))
                .orElse(null);

        System.out.println("Highest Paid Employee: " + highestPaid);
    }
}
