package Day24;

import java.util.*;
import java.util.stream.Collectors;

/*
 * 7. Removing Duplicate Employees using Stream.distinct()
 * ------------------------------------------------------------
 * Description: Removes duplicate employees from a collection using Stream.distinct().
 * Purpose: Demonstrates handling duplicates in collections functionally.
 * Real Example: Ensuring unique employee records in HR or payroll systems.
 */

class Employee7 {
    int id;
    String name;
    String department;

    Employee7(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Override equals and hashCode for distinct() to work correctly
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee7)) return false;
        Employee7 other = (Employee7) obj;
        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return id + ": " + name + " (" + department + ")";
    }
}

public class p15 {
    public static void main(String[] args) {
        List<Employee7> employees = Arrays.asList(
                new Employee7(101, "Shalini", "IT"),
                new Employee7(102, "Rahul", "HR"),
                new Employee7(103, "Kavita", "Finance"),
                new Employee7(101, "Shalini", "IT") // Duplicate ID
        );

        // Remove duplicates using distinct
        List<Employee7> uniqueEmployees = employees.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Unique Employees:");
        uniqueEmployees.forEach(System.out::println);
    }
}
