package Day24;

import java.util.*;
import java.util.stream.Collectors;

/*
 * 24. Finding Maximum and Minimum Salary using Streams
 * ------------------------------------------------------------
 * Description: Finds employees with the highest and lowest salaries using Stream.max() and Stream.min().
 * Purpose: Demonstrates finding extreme values in a collection functionally.
 * Real Example: Identifying top earners and lowest paid employees for HR reporting.
 */

class Employee24 {
    String name;
    double salary;

    Employee24(String name, double salary) {
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

public class p8{
    public static void main(String[] args) {
        List<Employee24> employees = Arrays.asList(
                new Employee24("Shalini", 75000),
                new Employee24("Rahul", 50000),
                new Employee24("Kavita", 60000),
                new Employee24("Amit", 72000)
        );

        // Find maximum salary
        Employee24 maxSalaryEmp = employees.stream()
                .max(Comparator.comparingDouble(Employee24::getSalary))
                .orElse(null);

        // Find minimum salary
        Employee24 minSalaryEmp = employees.stream()
                .min(Comparator.comparingDouble(Employee24::getSalary))
                .orElse(null);

        System.out.println("Highest Paid Employee: " + maxSalaryEmp);
        System.out.println("Lowest Paid Employee: " + minSalaryEmp);
    }
}
