package Day22;

//Program 2: Writing content to a file using FileWriter

import java.io.FileWriter;
import java.io.IOException;

public class p10{
 public static void main(String[] args) {
     try {
         FileWriter writer = new FileWriter("demo2.txt");
         writer.write("Hello, this is my first file handling program.\n");
         writer.write("Learning Java is fun!");
         writer.close(); // Always close after writing
         System.out.println("Successfully wrote to the file.");
     } catch (IOException e) {
         System.out.println("An error occurred while writing.");
         e.printStackTrace();
     }
 }
}
