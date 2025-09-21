package Day22;

import java.io.File;

/*
 * 4. Listing Files in a Directory
 * -----------------------------------------------------
 * Description: Lists all files and directories in a specified folder.
 * Purpose: Demonstrates using File class for directory navigation.
 * Real Example: Building file explorers or directory scanners.
 */
public class p3 {
    public static void main(String[] args) {
        File folder = new File(".");

        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                System.out.println((f.isDirectory() ? "[DIR] " : "[FILE] ") + f.getName());
            }
        } else {
            System.out.println("No files found or folder does not exist.");
        }
    }
}
