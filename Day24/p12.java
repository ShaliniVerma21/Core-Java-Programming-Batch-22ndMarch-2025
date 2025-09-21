package Day24;

import java.util.*;
import java.util.stream.Collectors;

/*
 * 4. Calculating Total & Average Salary using Streams
 * ------------------------------------------------------------
 * Description: Use Stream API to calculate aggregate values like total and average salary.
 * Purpose: Demonstrates functional aggregation and reduces boilerplate code.
 * Real Example: Calculating total payroll and average salary in a company's HR system.
 */

class Employee4 {
    int id;
    String name;
    String department;
    double salary;

    Employee4(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class p12 {
    public static void main(String[] args) {
        List<Employee4> employees = Arrays.asList(
                new Employee4(101, "Shalini", "IT", 75000),
                new Employee4(102, "Rahul", "HR", 50000),
                new Employee4(103, "Kavita", "Finance", 60000),
                new Employee4(104, "Amit", "IT", 72000)
        );

        // Calculate total salary
        double totalSalary = employees.stream()
                .mapToDouble(e -> e.salary)
                .sum();

        // Calculate average salary
        double avgSalary = employees.stream()
                .mapToDouble(e -> e.salary)
                .average()
                .orElse(0.0);

        System.out.println("Total Salary: " + totalSalary);
        System.out.println("Average Salary: " + avgSalary);
    }
}
