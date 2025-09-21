package Day23;

/*
 * 23. Stream GroupingBy
 * ------------------------------------------------------------
 * Description: The groupingBy() collector groups stream elements based on a classifier function.
 * Purpose: To categorize or partition data into a Map for further analysis.
 * Real Example: Grouping product names by their first letter for display in a catalog.
 */

import java.util.*;
import java.util.stream.Collectors;

public class p7{
    public static void main(String[] args) {
        // List of fruits
        List<String> list = Arrays.asList("apple", "banana", "apricot");
        
        // Group by first character of each string
        Map<Character, List<String>> grouped = list.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        
        // Print the grouped map
        System.out.println(grouped);
    }
}
