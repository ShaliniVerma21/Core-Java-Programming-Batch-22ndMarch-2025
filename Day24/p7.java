package Day24;

import java.util.*;
import java.util.stream.Collectors;

/*
 * 23. Summing Total Salary Using Streams.reduce()
 * ------------------------------------------------------------
 * Description: Calculates the total salary of all employees using Stream.reduce().
 * Purpose: Demonstrates aggregation of numerical values in functional style.
 * Real Example: Computing total payroll for a company or department.
 */

class Employee23 {
    String name;
    double salary;

    Employee23(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double getSalary() {
        return salary;
    }
}

public class p7{
    public static void main(String[] args) {
        List<Employee23> employees = Arrays.asList(
                new Employee23("Shalini", 75000),
                new Employee23("Rahul", 50000),
                new Employee23("Kavita", 60000),
                new Employee23("Amit", 72000)
        );

        // Sum total salary
        double totalSalary = employees.stream()
                .map(Employee23::getSalary)
                .reduce(0.0, Double::sum);

        System.out.println("Total Salary of All Employees: " + totalSalary);
    }
}
