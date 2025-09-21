package Day24;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 17. Generating Employee IDs using Stream.generate()
 * ------------------------------------------------------------
 * Description: Creates a stream of employee IDs dynamically using Stream.generate().
 * Purpose: Demonstrates generating infinite or custom sequences in functional style.
 * Real Example: Automatically generating unique employee IDs for onboarding.
 */

public class p24{
    public static void main(String[] args) {
        // Generate first 5 employee IDs starting from 1001
        List<Integer> employeeIds = Stream.iterate(1001, id -> id + 1)
                .limit(5)
                .collect(Collectors.toList());

        System.out.println("Generated Employee IDs: " + employeeIds);
    }
}
