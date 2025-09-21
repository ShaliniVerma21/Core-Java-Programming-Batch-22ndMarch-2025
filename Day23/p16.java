package Day23;

/*
 * 8. Streams API - forEach
 * ------------------------------------------------------------
 * Description: The forEach() method iterates over each element of a stream and performs an action.
 * Purpose: Simplifies iteration over collections in a functional programming style.
 * Real Example: Printing all user names from a list of registered users in a system.
 */

import java.util.Arrays;
import java.util.List;

public class p16 {
    public static void main(String[] args) {
        // Creating a list of names
        List<String> names = Arrays.asList("A", "B", "C");
        
        // Using stream and forEach to print each element
        names.stream().forEach(System.out::println);
    }
}
