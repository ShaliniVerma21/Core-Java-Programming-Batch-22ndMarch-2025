package Day24;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/*
 * 8. Processing Employee Attendance with LocalDate and Streams
 * ------------------------------------------------------------
 * Description: Tracks and filters employee attendance using LocalDate and Streams API.
 * Purpose: Demonstrates date handling and functional filtering for daily operations.
 * Real Example: Generating a list of employees present on a specific day in HR systems.
 */

class Employee8 {
    int id;
    String name;
    List<LocalDate> attendanceDates;

    Employee8(int id, String name, List<LocalDate> attendanceDates) {
        this.id = id;
        this.name = name;
        this.attendanceDates = attendanceDates;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }
}

public class p16 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        List<Employee8> employees = Arrays.asList(
                new Employee8(101, "Shalini", Arrays.asList(today.minusDays(1), today)),
                new Employee8(102, "Rahul", Arrays.asList(today.minusDays(2))),
                new Employee8(103, "Kavita", Arrays.asList(today))
        );

        // Filter employees present today
        List<Employee8> presentToday = employees.stream()
                .filter(e -> e.attendanceDates.contains(today))
                .collect(Collectors.toList());

        System.out.println("Employees Present Today:");
        presentToday.forEach(System.out::println);
    }
}

