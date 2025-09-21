package Day24;

import java.util.*;
import java.util.stream.Collectors;

/*
 * 15. Stream Peek Example – Debugging Employee Salary Processing
 * ------------------------------------------------------------
 * Description: Uses Stream.peek() to debug intermediate values in a stream pipeline.
 * Purpose: Helps in inspecting elements at different stages without modifying the stream.
 * Real Example: Logging or auditing employee salary adjustments before applying transformations.
 */

class Employee15 {
    String name;
    double salary;

    Employee15(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }
}

public class p22{
    public static void main(String[] args) {
        List<Employee15> employees = Arrays.asList(
                new Employee15("Shalini", 75000),
                new Employee15("Rahul", 50000),
                new Employee15("Kavita", 60000)
        );

        List<Double> updatedSalaries = employees.stream()
                .peek(e -> System.out.println("Before Bonus: " + e))
                .map(e -> {
                    e.salary += 5000; // Add bonus
                    return e.salary;
                })
                .peek(s -> System.out.println("After Bonus: " + s))
                .collect(Collectors.toList());

        System.out.println("\nFinal Updated Salaries: " + updatedSalaries);
    }
}
