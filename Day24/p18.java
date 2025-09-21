package Day24;

import java.util.*;
import java.util.stream.Collectors;

/*
 * 10. Map of Departments to Employees using HashMap + Streams
 * ------------------------------------------------------------
 * Description: Organizes employees into a map where the key is department and value is a list of employees.
 * Purpose: Demonstrates combining collections, Streams, and maps for better data structure management.
 * Real Example: Creating a department-wise employee directory in an HR dashboard.
 */

class Employee10 {
    int id;
    String name;
    String department;

    Employee10(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class p18 {
    public static void main(String[] args) {
        List<Employee10> employees = Arrays.asList(
                new Employee10(101, "Shalini", "IT"),
                new Employee10(102, "Rahul", "HR"),
                new Employee10(103, "Kavita", "Finance"),
                new Employee10(104, "Amit", "IT"),
                new Employee10(105, "Sneha", "HR")
        );

        // Create a map of department -> list of employees
        Map<String, List<Employee10>> deptMap = employees.stream()
                .collect(Collectors.groupingBy(e -> e.department));

        // Print department-wise employees
        deptMap.forEach((dept, empList) -> {
            System.out.println(dept + ": " + empList);
        });
    }
}
