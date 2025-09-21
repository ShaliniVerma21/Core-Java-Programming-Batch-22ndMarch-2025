package Day24;

import java.util.*;
import java.util.stream.Collectors;

/*
 * 21. Employee Salary Increment Using Map and Lambda
 * ------------------------------------------------------------
 * Description: Applies a salary increment to all employees using Stream.map().
 * Purpose: Demonstrates functional-style transformation of collection elements.
 * Real Example: Applying yearly salary increments to all employees in payroll processing.
 */

class Employee21 {
    String name;
    double salary;

    Employee21(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }
}

public class p5{
    public static void main(String[] args) {
        List<Employee21> employees = Arrays.asList(
                new Employee21("Shalini", 75000),
                new Employee21("Rahul", 50000),
                new Employee21("Kavita", 60000)
        );

        // Increment salary by 10%
        List<Employee21> updatedSalaries = employees.stream()
                .map(e -> {
                    e.salary = e.salary * 1.10;
                    return e;
                })
                .collect(Collectors.toList());

        System.out.println("Employees After Salary Increment:");
        updatedSalaries.forEach(System.out::println);
    }
}
