package Day24;

import java.util.*;
import java.util.stream.Collectors;

/*
 * 14. FlatMap Example – List of Employees with List of Skills
 * ------------------------------------------------------------
 * Description: Flattens a list of lists (employee skills) using Stream.flatMap().
 * Purpose: Demonstrates handling nested collections in a functional style.
 * Real Example: Aggregating all unique skills from all employees in a training dashboard.
 */

class Employee14 {
    String name;
    List<String> skills;

    Employee14(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }
}

public class p21{
    public static void main(String[] args) {
        List<Employee14> employees = Arrays.asList(
                new Employee14("Shalini", Arrays.asList("Java", "Python")),
                new Employee14("Rahul", Arrays.asList("Python", "JavaScript")),
                new Employee14("Kavita", Arrays.asList("Java", "SQL"))
        );

        // Collect all unique skills of all employees
        List<String> allSkills = employees.stream()
                .flatMap(e -> e.skills.stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println("All Unique Skills: " + allSkills);
    }
}
