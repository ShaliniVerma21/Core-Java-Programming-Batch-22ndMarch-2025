package Day22;
import java.io.*;

/*
 * 6. Reading Large Files Efficiently
 * -----------------------------------------------------
 * Description: Reads large files line by line using BufferedReader to avoid memory issues.
 * Purpose: Demonstrates efficient file handling and resource management.
 * Real Example: Processing large log files or datasets in analytics.
 */
public class p5 {
    public static void main(String[] args) {
        String filePath = "large_data.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            long count = 0;
            while ((line = br.readLine()) != null) {
                count++;
            }
            System.out.println("Total lines in file: " + count);
        } catch (IOException e) {
            System.err.println("Error reading large file: " + e.getMessage());
        }
    }
}
