package Day24;

import java.util.*;
import java.util.stream.Collectors;

/*
 * 18. Multi-level Grouping of Employees using Collectors.groupingBy
 * ------------------------------------------------------------
 * Description: Groups employees first by department, then by salary range.
 * Purpose: Demonstrates advanced hierarchical grouping using Streams API.
 * Real Example: Creating detailed HR reports with department-wise salary categories.
 */

class Employee18 {
    String name;
    String department;
    double salary;

    Employee18(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }
}

public class p25{
    public static void main(String[] args) {
        List<Employee18> employees = Arrays.asList(
                new Employee18("Shalini", "IT", 75000),
                new Employee18("Rahul", "IT", 55000),
                new Employee18("Kavita", "HR", 60000),
                new Employee18("Amit", "HR", 52000),
                new Employee18("Sneha", "Finance", 65000)
        );

        // Multi-level grouping: department -> salary range
        Map<String, Map<String, List<Employee18>>> grouped = employees.stream()
                .collect(Collectors.groupingBy(
                        e -> e.department,
                        Collectors.groupingBy(e -> e.salary > 60000 ? "High Salary" : "Low Salary")
                ));

        // Print grouped employees
        grouped.forEach((dept, salaryMap) -> {
            System.out.println(dept + ": " + salaryMap);
        });
    }
}
