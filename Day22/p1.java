package Day22;

//Program 1: Creating a new file in Java
//Important: Always handle IOException when working with files.

import java.io.File;
import java.io.IOException;

public class p1 {
 public static void main(String[] args) {
     try {
         File file = new File("demo1.txt"); // Create a File object
         if (file.createNewFile()) {
             System.out.println("File created: " + file.getName());
         } else {
             System.out.println("File already exists.");
         }
     } catch (IOException e) {
         System.out.println("An error occurred while creating file.");
         e.printStackTrace();
     }
 }
}
