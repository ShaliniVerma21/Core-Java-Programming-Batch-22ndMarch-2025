package Day24;

import java.util.*;
import java.util.stream.Collectors;

/*
 * 1. Employee Management using OOP & Collections
 * ------------------------------------------------------------
 * Description: Manage a list of Employee objects using OOP and Java Collections.
 * Purpose: Demonstrates object-oriented design and collection manipulation.
 * Real Example: Maintaining employee records in an HR management system.
 */

// Employee class with basic fields
class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class p1 {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Shalini", "IT", 75000));
        employees.add(new Employee(102, "Rahul", "HR", 50000));
        employees.add(new Employee(103, "Kavita", "Finance", 60000));

        // Display all employees
        employees.forEach(System.out::println);

        // Add a new employee
        employees.add(new Employee(104, "Amit", "IT", 72000));

        System.out.println("\nAfter adding a new employee:");
        employees.forEach(System.out::println);

        // Remove an employee by ID
        employees.removeIf(e -> e.id == 102);

        System.out.println("\nAfter removing employee with ID 102:");
        employees.forEach(System.out::println);
    }
}

