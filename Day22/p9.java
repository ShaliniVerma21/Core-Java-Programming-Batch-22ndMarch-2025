package Day22;

import java.io.*;
import java.util.*;

/*
 * 10. Reading CSV File and Processing Data
 * -----------------------------------------------------
 * Description: Reads CSV file, splits data, and stores in objects.
 * Purpose: Demonstrates parsing and processing structured text files.
 * Real Example: Loading employee records or sales data from CSV files.
 */
class Employee10CSV {
    String name;
    int age;
    String department;

    Employee10CSV(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return name + ", " + age + ", " + department;
    }
}

public class p9 {
    public static void main(String[] args) {
        String filePath = "employees.csv";

        List<Employee10CSV> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    employees.add(new Employee10CSV(parts[0].trim(), Integer.parseInt(parts[1].trim()), parts[2].trim()));
                }
            }
            System.out.println("Employees Loaded from CSV:");
            employees.forEach(System.out::println);
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error processing CSV: " + e.getMessage());
        }
    }
}
