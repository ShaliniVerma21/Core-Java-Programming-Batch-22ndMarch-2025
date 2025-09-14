package Day22;

//Program 4: Appending content without overwriting existing file data

import java.io.FileWriter;
import java.io.IOException;

public class p12{
 public static void main(String[] args) {
     try {
         FileWriter writer = new FileWriter("demo2.txt", true); // true = append mode
         writer.write("\nThis line is appended to the file.");
         writer.close();
         System.out.println("Successfully appended to the file.");
     } catch (IOException e) {
         System.out.println("An error occurred while appending.");
         e.printStackTrace();
     }
 }
}
