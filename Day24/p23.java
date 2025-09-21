package Day24;

import java.util.*;
import java.util.stream.Collectors;

/*
 * 16. Partitioning Employees Based on Salary using Collectors.partitioningBy
 * ------------------------------------------------------------
 * Description: Partitions employees into two groups based on a salary threshold.
 * Purpose: Demonstrates dividing data functionally into boolean-based partitions.
 * Real Example: Separating high-salary and low-salary employees for HR analytics.
 */

class Employee16 {
    String name;
    double salary;

    Employee16(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }
}

public class p23{
    public static void main(String[] args) {
        List<Employee16> employees = Arrays.asList(
                new Employee16("Shalini", 75000),
                new Employee16("Rahul", 50000),
                new Employee16("Kavita", 60000),
                new Employee16("Amit", 72000)
        );

        // Partition employees with salary > 60000
        Map<Boolean, List<Employee16>> partitioned = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.salary > 60000));

        System.out.println("Employees with Salary > 60000: " + partitioned.get(true));
        System.out.println("Employees with Salary <= 60000: " + partitioned.get(false));
    }
}
