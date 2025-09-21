package Day22;
import java.io.*;

/*
 * 2. Writing to a Text File with Exception Handling
 * -----------------------------------------------------
 * Description: Writes multiple lines to a text file using BufferedWriter.
 * Purpose: Demonstrates handling IOExceptions during file writing.
 * Real Example: Logging application data or saving reports.
 */
public class p24 {
    public static void main(String[] args) {
        String filePath = "output.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write("Hello World!");
            bw.newLine();
            bw.write("File Handling in Java is powerful.");
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
