package Day24;

import java.util.*;
import java.util.concurrent.CompletableFuture;

/*
 * 11. Calculating Bonus Asynchronously using CompletableFuture
 * ------------------------------------------------------------
 * Description: Performs asynchronous bonus calculation for employees using CompletableFuture.
 * Purpose: Demonstrates non-blocking, parallel computation for better performance.
 * Real Example: Calculating year-end bonuses for all employees without blocking main thread.
 */

class Employee11 {
    int id;
    String name;
    double salary;

    Employee11(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " (Salary: " + salary + ")";
    }
}

public class p19 {
    public static void main(String[] args) {
        List<Employee11> employees = Arrays.asList(
                new Employee11(101, "Shalini", 75000),
                new Employee11(102, "Rahul", 50000),
                new Employee11(103, "Kavita", 60000)
        );

        // Asynchronously calculate 10% bonus for each employee
        List<CompletableFuture<Double>> bonusFutures = new ArrayList<>();
        for (Employee11 e : employees) {
            CompletableFuture<Double> futureBonus = CompletableFuture.supplyAsync(() -> {
                double bonus = e.salary * 0.10;
                System.out.println("Bonus calculated for " + e.name + ": " + bonus);
                return bonus;
            });
            bonusFutures.add(futureBonus);
        }

        // Wait for all async tasks to complete and sum total bonus
        double totalBonus = bonusFutures.stream()
                .mapToDouble(CompletableFuture::join)
                .sum();

        System.out.println("\nTotal Bonus for All Employees: " + totalBonus);
    }
}

