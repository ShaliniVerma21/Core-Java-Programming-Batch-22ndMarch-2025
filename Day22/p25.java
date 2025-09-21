package Day22;

import java.io.*;

/*
 * 3. Copying a File Using Streams
 * -----------------------------------------------------
 * Description: Copies content from one file to another using FileInputStream & FileOutputStream.
 * Purpose: Demonstrates byte-level file operations and exception handling.
 * Real Example: Backup of important files in a directory.
 */
public class p25 {
    public static void main(String[] args) {
        String sourceFile = "data.txt";
        String destFile = "copy_data.txt";

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.err.println("File operation error: " + e.getMessage());
        }
    }
}
