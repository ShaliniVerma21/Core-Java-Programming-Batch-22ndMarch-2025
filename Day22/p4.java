package Day22;

import java.io.*;

/*
 * 5. Appending Data to an Existing File
 * -----------------------------------------------------
 * Description: Adds new content to an existing file without overwriting it.
 * Purpose: Demonstrates FileWriter with append mode and exception handling.
 * Real Example: Logging messages to a server log file.
 */
public class p4 {
    public static void main(String[] args) {
        String filePath = "output.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            bw.newLine();
            bw.write("Appending new line using Java.");
            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.err.println("Error appending file: " + e.getMessage());
        }
    }
}
