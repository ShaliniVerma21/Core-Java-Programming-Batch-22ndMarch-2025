package Day24;

import java.util.*;
import java.util.stream.Collectors;

/*
 * 19. Sorting Employees by Multiple Fields using Comparator
 * ------------------------------------------------------------
 * Description: Sorts employees first by department, then by salary in descending order.
 * Purpose: Demonstrates multi-level sorting using Comparator and Streams API.
 * Real Example: Displaying employees in a company directory sorted by department and salary.
 */

class Employee19 {
    String name;
    String department;
    double salary;

    Employee19(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " (" + department + ", " + salary + ")";
    }
}

public class p3{
    public static void main(String[] args) {
        List<Employee19> employees = Arrays.asList(
                new Employee19("Shalini", "IT", 75000),
                new Employee19("Rahul", "IT", 55000),
                new Employee19("Kavita", "HR", 60000),
                new Employee19("Amit", "HR", 52000),
                new Employee19("Sneha", "Finance", 65000)
        );

        // Sort by department ascending, then by salary descending
        List<Employee19> sorted = employees.stream()
                .sorted(Comparator.comparing((Employee19 e) -> e.department)
                        .thenComparing(Comparator.comparingDouble(e -> -e.salary)))
                .collect(Collectors.toList());

        System.out.println("Employees Sorted by Department & Salary:");
        sorted.forEach(System.out::println);
    }
}
