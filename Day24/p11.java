package Day24;

import java.util.*;
import java.util.stream.Collectors;

/*
 * 3. Filtering Employees using Streams
 * ------------------------------------------------------------
 * Description: Filter a collection of employees based on conditions using Streams API.
 * Purpose: Demonstrates functional-style data processing and cleaner code.
 * Real Example: Filtering employees from IT department or with salary above a threshold.
 */

class Employee3 {
    int id;
    String name;
    String department;
    double salary;

    Employee3(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class p11 {
    public static void main(String[] args) {
        List<Employee3> employees = Arrays.asList(
                new Employee3(101, "Shalini", "IT", 75000),
                new Employee3(102, "Rahul", "HR", 50000),
                new Employee3(103, "Kavita", "Finance", 60000),
                new Employee3(104, "Amit", "IT", 72000)
        );

        // Filter employees from IT department
        List<Employee3> itEmployees = employees.stream()
                .filter(e -> e.department.equals("IT"))
                .collect(Collectors.toList());

        System.out.println("IT Department Employees:");
        itEmployees.forEach(System.out::println);

        // Filter employees with salary > 60000
        List<Employee3> highSalary = employees.stream()
                .filter(e -> e.salary > 60000)
                .collect(Collectors.toList());

        System.out.println("\nEmployees with Salary > 60000:");
        highSalary.forEach(System.out::println);
    }
}

