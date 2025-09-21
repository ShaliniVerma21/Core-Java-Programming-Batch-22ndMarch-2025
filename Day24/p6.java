package Day24;

import java.util.*;
import java.util.stream.Collectors;

/*
 * 22. Counting Employees in Each Department using Collectors.counting()
 * ------------------------------------------------------------
 * Description: Counts number of employees in each department using Streams and Collectors.counting().
 * Purpose: Demonstrates aggregation operations using functional programming.
 * Real Example: Generating a quick summary report of department sizes in an organization.
 */

class Employee22 {
    String name;
    String department;

    Employee22(String name, String department) {
        this.name = name;
        this.department = department;
    }
}

public class p6{
    public static void main(String[] args) {
        List<Employee22> employees = Arrays.asList(
                new Employee22("Shalini", "IT"),
                new Employee22("Rahul", "HR"),
                new Employee22("Kavita", "Finance"),
                new Employee22("Amit", "IT"),
                new Employee22("Sneha", "HR")
        );

        // Count employees per department
        Map<String, Long> departmentCount = employees.stream()
                .collect(Collectors.groupingBy(e -> e.department, Collectors.counting()));

        System.out.println("Employee Count per Department:");
        departmentCount.forEach((dept, count) -> System.out.println(dept + ": " + count));
    }
}
