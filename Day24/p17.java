package Day24;

import java.util.*;

/*
 * 9. Optional Example – Handling Null Manager of Employee
 * ------------------------------------------------------------
 * Description: Uses Optional to safely access nullable fields like manager without NullPointerException.
 * Purpose: Demonstrates null-safety in JDK 8 functional style programming.
 * Real Example: Retrieving a manager’s name for an employee if assigned, else using a default value.
 */

class Employee9 {
    int id;
    String name;
    String manager; // Could be null

    Employee9(int id, String name, String manager) {
        this.id = id;
        this.name = name;
        this.manager = manager;
    }

    @Override
    public String toString() {
        return id + ": " + name + " (Manager: " + manager + ")";
    }
}

public class p17 {
    public static void main(String[] args) {
        List<Employee9> employees = Arrays.asList(
                new Employee9(101, "Shalini", "Rahul"),
                new Employee9(102, "Kavita", null),
                new Employee9(103, "Amit", "Rahul")
        );

        employees.forEach(e -> {
            // Use Optional to handle null manager safely
            String managerName = Optional.ofNullable(e.manager).orElse("No Manager Assigned");
            System.out.println(e.name + " -> Manager: " + managerName);
        });
    }
}

