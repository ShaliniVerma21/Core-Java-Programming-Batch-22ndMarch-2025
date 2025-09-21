package Day24;

import java.util.*;

/*
 * 2. Sorting Employees using Comparator and Lambda Expressions
 * ------------------------------------------------------------
 * Description: Sort employees by different attributes using Lambda expressions.
 * Purpose: Demonstrates modern Java sorting without anonymous inner classes.
 * Real Example: Sorting employees by name, age, or salary for HR reports.
 */

class Employee2 {
    int id;
    String name;
    String department;
    double salary;

    Employee2(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class p10 {
    public static void main(String[] args) {
        List<Employee2> employees = new ArrayList<>();
        employees.add(new Employee2(101, "Shalini", "IT", 75000));
        employees.add(new Employee2(102, "Rahul", "HR", 50000));
        employees.add(new Employee2(103, "Kavita", "Finance", 60000));
        employees.add(new Employee2(104, "Amit", "IT", 72000));

        // Sort by name using Lambda
        employees.sort((e1, e2) -> e1.name.compareTo(e2.name));
        System.out.println("Sorted by Name:");
        employees.forEach(System.out::println);

        // Sort by salary descending
        employees.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));
        System.out.println("\nSorted by Salary (Descending):");
        employees.forEach(System.out::println);

        // Sort by department then by name
        employees.sort(Comparator.comparing((Employee2 e) -> e.department)
                                 .thenComparing(e -> e.name));
        System.out.println("\nSorted by Department then Name:");
        employees.forEach(System.out::println);
    }
}

