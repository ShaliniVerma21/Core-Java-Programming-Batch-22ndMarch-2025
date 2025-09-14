package Day22;
//Program 14: Using try-with-resources (automatic closing of files)

import java.io.*;

public class p21{
 public static void main(String[] args) {
     // Try-with-resources ensures file is closed automatically
     try (FileWriter writer = new FileWriter("trydemo.txt")) {
         writer.write("This file is written using try-with-resources.");
     } catch (IOException e) {
         e.printStackTrace();
     }

     try (FileReader reader = new FileReader("trydemo.txt")) {
         int ch;
         System.out.println("Reading file:");
         while ((ch = reader.read()) != -1) {
             System.out.print((char) ch);
         }
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
