package Day24;

import java.util.*;
import java.util.stream.Collectors;

/*
 * 5. Grouping Employees by Department using Collectors.groupingBy
 * ------------------------------------------------------------
 * Description: Groups employees into a map based on department using Streams.
 * Purpose: Demonstrates functional-style grouping of data for analysis or reporting.
 * Real Example: Categorizing employees by department for generating departmental reports.
 */

class Employee5 {
    int id;
    String name;
    String department;
    double salary;

    Employee5(int id, String name, String department, double salary) {
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

public class p13 {
    public static void main(String[] args) {
        List<Employee5> employees = Arrays.asList(
                new Employee5(101, "Shalini", "IT", 75000),
                new Employee5(102, "Rahul", "HR", 50000),
                new Employee5(103, "Kavita", "Finance", 60000),
                new Employee5(104, "Amit", "IT", 72000),
                new Employee5(105, "Sneha", "HR", 52000)
        );

        // Group employees by department
        Map<String, List<Employee5>> groupedByDept = employees.stream()
                .collect(Collectors.groupingBy(e -> e.department));

        // Print grouped employees
        groupedByDept.forEach((dept, empList) -> {
            System.out.println(dept + ": " + empList);
        });
    }
}
