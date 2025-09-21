package Day22;
package Day25;

import java.io.*;

/*
 * 9. File Copy with Debugging
 * -----------------------------------------------------
 * Description: Copies a file byte-by-byte while printing debug information.
 * Purpose: Demonstrates validating file operations and debugging during processing.
 * Real Example: Ensuring accurate file transfer or backup process.
 */
public class p8 {
    public static void main(String[] args) {
        String source = "data.txt";
        String dest = "backup_data.txt";

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {

            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
                System.out.print((char)b); // Debug print
            }
            System.out.println("\nFile copied with debugging info.");
        } catch (IOException e) {
            System.err.println("File copy error: " + e.getMessage());
        }
    }
}
