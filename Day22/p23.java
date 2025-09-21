package Day22;

import java.io.*;

/*
 * 1. Reading a Text File Safely with Exception Handling
 * -----------------------------------------------------
 * Description: Reads content from a text file line by line using BufferedReader.
 * Purpose: Demonstrates handling IOExceptions during file reading.
 * Real Example: Reading configuration or log files safely.
 */
public class p23 {
    public static void main(String[] args) {
        String filePath = "data.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Display each line
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
